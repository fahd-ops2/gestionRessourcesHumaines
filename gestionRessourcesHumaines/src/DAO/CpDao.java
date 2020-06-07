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
	public static void main(String[] args){
		try{
		CP a = new CP(1,1,1);
		CpDao cd= new CpDao();
		cd.deleteCp(4);
		
		}catch(Exception e){
			System.out.println("err");
		}
		
		
	}

}
