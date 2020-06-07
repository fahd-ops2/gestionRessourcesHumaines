package DAO;
import classes.CP;

import java.util.*;
import java.sql.*;
public class CpDao {
	private Connection cn = null;
	public CpDao(){
		cn=Singleton.getConnect().getCn();
	}
	public int insertCp(CP c){
		try{
			String req="INSERT INTO `cp` (`CadreID`, `PersonnelID`) VALUES (? , ?)";
			PreparedStatement st = cn.prepareStatement(req);
			st.setInt(1, c.getCadreID());
			st.setInt(2,c.getPersonnelID());
			return st.executeUpdate();
			
		}catch(Exception e){
			System.out.println("insertCp");
			return 0;
		}
		
	} 
	public int deleteCp(int i){
		try{
			String req="DELETE FROM `cp` WHERE `cp`.`id` = ?";
			PreparedStatement st = cn.prepareStatement(req);
			st.setInt(1, i);
			return st.executeUpdate();
		}catch(Exception e){
			System.out.println("DeleteCp");
			return 0;
		}
	}
	public ResultSet selectAll(){
		try{
		String req=" SELECT Pren_n,Pren_N_arabe,Cadre  FROM `cp`  ,personnel p ,cadre ca  WHERE cp.CadreID=ca.ID  and cp.PersonnelID = p.ID";
			PreparedStatement pst= cn.prepareStatement(req);
			ResultSet res =pst.executeQuery();
			return res;
		}catch(Exception e){
			System.out.println("selectall of Mp");
			return null;
		}
	}
	public ResultSet selectby(int i){
		try{
		String req=" SELECT Pren_n,Pren_N_arabe,Cadre  FROM `cp`  ,personnel p ,cadre ca  WHERE cp.CadreID=ca.ID  and cp.PersonnelID = p.ID and PersonnelID=? ";
			PreparedStatement pst= cn.prepareStatement(req);
			pst.setInt(1, i);
			ResultSet res =pst.executeQuery();
			return res;
		}catch(Exception e){
			System.out.println("selectall of Mp");
			return null;
		}
	}
	public static void main(String[] args){
		try{
		CP a = new CP(1,1,1);
		CpDao cd= new CpDao();
		//ResultSet res =cd.selectAll();
		ResultSet res =cd.selectby(1);
		while(res.next()){
			System.out.println(res.getObject(1)+" "+res.getObject(2)+" "+res.getObject(3));
		}
		
		
		}catch(Exception e){
			System.out.println("err");
		}
		
		
	}

}
