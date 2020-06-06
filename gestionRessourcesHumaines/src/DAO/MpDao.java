package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import classes.Admin;
import classes.Mp;

public class MpDao {
     private Connection cna=null;
	/**
	 * 
	 */
	public MpDao() {
		
		cna=Singleton.getConnect().getCn();
	}
public int insertMp(Mp mp){
		
		
		try {
			
			
             String req ="NSERT INTO `mp`(`MatiereID`, `PersonnelID`) VALUES (?,?) ";
             PreparedStatement pst= cna.prepareStatement(req);
             pst.setInt(1,mp.getMatiereID());
             pst.setInt(2,mp.getPersonnelID());
             return pst.executeUpdate();       
		} catch (SQLException e) {
			e.getMessage();
		}
		return -1; 

}
}