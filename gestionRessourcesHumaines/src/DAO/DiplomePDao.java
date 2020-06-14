package DAO;

import classes.DiplomeP;

import java.util.*;
import java.sql.*;
import java.sql.Date;
public class DiplomePDao{
private Connection cn = null;
  
public DiplomePDao(){
	cn=Singleton.getConnect().getCn();
}
public int insertDiplomeP(DiplomeP d){
	try{
		String req="INSERT INTO `diplomep`( `PersonnelID`, `Diplomep`, `DateobtentionP`, `Specialitee`, `CodeS`) VALUES( ?, ?, ?, ?,?)";
		PreparedStatement st = cn.prepareStatement(req);
		st.setInt(1,d.getPersonnelID());
		st.setString(2, d.getDiplomep());
		st.setString(3, d.getDateobtentionP());
		st.setString(4 , d.getSpecialitee());
		st.setInt(5, d.getCodeS());
		return st.executeUpdate();
	}catch(Exception e){
		System.out.println("insertDiplome");
		return 0;
	}
}
/** Delete**/
public int deleteDiplomeP(int i){
	try{
		String req="DELETE FROM `diplomep` WHERE `diplomep`.`ID` = ?";
		PreparedStatement st = cn.prepareStatement(req);
		st.setInt(1, i);
		return st.executeUpdate();
	}catch(Exception e){
		System.out.println("DeleteDiplomeP");
		return 0;
	}
}
/** Select**/
public ResultSet selectAll(){
	try{
		
		String req=" SELECT Pren_n,Pren_N_arabe,`Diplomep`,Specialitee,cin FROM `diplomep`dip ,personnel p where p.Id=dip.personnelID  ";
			PreparedStatement pst= cn.prepareStatement(req);
			ResultSet res =pst.executeQuery();
			return res;
		}catch(Exception e){
			System.out.println("DeplomeP selectAll ");
			return null;
		}
	}
/** SelectById**/
public ResultSet selectbycin(String cin){
	try{
		
		String req="  SELECT Pren_n,Pren_N_arabe,`Diplomep`,Specialitee,cin FROM `diplomep`dip ,personnel p where p.Id=dip.personnelID and p.cin= ? ";
			PreparedStatement pst= cn.prepareStatement(req);
			pst.setString(1, cin);
			ResultSet res =pst.executeQuery();
			return res;
		}catch(Exception e){
			System.out.println("DiplomeP  selectbyId");
			return null;
		}
		
		}



public static void main(String[] args){
	try{
		DiplomeP dp= new DiplomeP(1, 03, "dsi", "bts", "20/1/2000");
	 DiplomePDao ado=new DiplomePDao();
	 ado.insertDiplomeP(dp);
	 System.out.println("alo");
     }catch(Exception e ){
    	 System.out.println("non");
     }
	 

}

}