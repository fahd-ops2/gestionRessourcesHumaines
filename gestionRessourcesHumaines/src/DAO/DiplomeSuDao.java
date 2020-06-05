package DAO;

import java.sql.*;

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
}
