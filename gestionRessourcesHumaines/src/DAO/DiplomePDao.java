package DAO;

import classes.DiplomeP;

import java.util.*;
import java.sql.*;
import java.sql.Date;
public class DiplomePDao
{
private Connection cn = null;
  
public DiplomePDao(){
	cn=Singleton.getConnect().getCn();
}
public int insertDiplomeP(DiplomeP d){
	try{
		String req="INSERT INTO `diplomep` ( `PersonnelID`, `SpecialiteID`, `Diplomep`, `DateobtentionP`) VALUES ( ?, ?, ?, ?)";
		PreparedStatement st = cn.prepareStatement(req);
		st.setInt(1,d.getPersonnelID());
		st.setInt(2, d.getSpecialiteID());
		st.setString(3 , d.getDiplomep());
		st.setDate(4, d.getDateobtentionP());
		return st.executeUpdate();
	}catch(Exception e){
		System.out.println("insertDiplome");
		return 0;
	}
}
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
public static void main(String[] args){
	try{
	DiplomePDao Dp= new DiplomePDao();
	Dp.deleteDiplomeP(1);
	}catch(Exception e){
		System.out.println("err");
	}
}

}

