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
		
		String req=" SELECT * FROM `diplomep` ";
			PreparedStatement pst= cn.prepareStatement(req);
			ResultSet res =pst.executeQuery();
			return res;
		}catch(Exception e){
			System.out.println("DeplomeP selectAll ");
			return null;
		}
	}
/** SelectById**/
public ResultSet selectbyId(int id){
	try{
		
		String req=" SELECT * FROM `diplomep` where PersonnelID = ? ";
			PreparedStatement pst= cn.prepareStatement(req);
			pst.setInt(1, id);
			ResultSet res =pst.executeQuery();
			return res;
		}catch(Exception e){
			System.out.println("DiplomeP  selectbyId");
			return null;
		}
		
		}


public static void main(String[] args){
	try{
	 DiplomePDao ado=new DiplomePDao();
	 ResultSet res =ado.selectAll();
	 while (res.next()){
			System.out.println(res.getObject(1)+" "+res.getObject(2)+" "+res.getObject(3)+" "+res.getObject(4)+" "+res.getObject(5));
		}
	 System.out.println("alo");
     }catch(Exception e ){
    	 System.out.println("non");
     }
	 

}

}