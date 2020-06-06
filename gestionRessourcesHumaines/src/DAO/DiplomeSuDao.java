package DAO;

import java.sql.*;

import classes.Admin;
import classes.DiplomeSu;
public class DiplomeSuDao {
     private Connection cna=null;
	/**
	 * 
	 */
	public DiplomeSuDao() {
		cna=Singleton.getConnect().getCn();
	}
public int insertDiplomeSu(DiplomeSu dsu){
		
		
		try {
			
			
             String req ="INSERT INTO `diplomesu`( `PersonnelID`, `SpecialiteID`, `DiplomeSU`, `DateobtentionSu`, `Faculte`) VALUES ( ?, ?,?,?,?) ";
             PreparedStatement pst= cna.prepareStatement(req);
             pst.setInt(1,dsu.getPersonnelID());
             pst.setInt(2,dsu.getSpecialiteID());
             pst.setString(3,dsu.getDiplomeSU());
             pst.setDate(4,dsu.getDateobtentionSu());
             pst.setString(5,dsu.getFaculte());
             return pst.executeUpdate();       
		} catch (SQLException e) {
			e.getMessage();
		}
		return -1; 

}
public int deleteDiplomeSu(int i){
	try{
		String req ="DELETE FROM `diplomesu` WHERE`ID`=? ";
        PreparedStatement pst= cna.prepareStatement(req);
        pst.setInt(1,i);
        return pst.executeUpdate(); 
	}catch(Exception e ){
		System.out.println("Admin");
	}
	return 0;
}
public static void main(String[]args){
	 try{
		 Date d= new Date(0);
	 DiplomeSu ad=new DiplomeSu( 1, 1, "aaaa", "aaa",d);
	 DiplomeSuDao ado=new DiplomeSuDao();
	 ado.deleteDiplomeSu(2);
	 System.out.println(ad.toString());
     }catch(Exception e ){System.out.println("non");}
	 }
}
