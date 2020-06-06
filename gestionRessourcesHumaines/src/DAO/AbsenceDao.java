package DAO;
import java.sql.*;

import classes.Absence;
public class AbsenceDao {
      private Connection cna=null;
	/**
	 * 
	 */
	public AbsenceDao() {
		cna=Singleton.getConnect().getCn();
	}
public int insertAbsence(Absence abs){
		
		
		try {
			
			
             String req ="INSERT INTO `absence`( `PersonnelID`, `Duree`, `Justification`) VALUES(?,?,?) ";
             PreparedStatement pst= cna.prepareStatement(req);
             pst.setInt(1,abs.getPersonnelID());
             pst.setString(2,abs.getDuree());
             pst.setString(3,abs.getJustification());
             return pst.executeUpdate();       
		} catch (SQLException e) {
			e.getMessage();
		}
		return -1; 

}
public int deleteAbsence(int i){
	try{
		String req ="DELETE FROM `absence` WHERE`ID`=? ";
        PreparedStatement pst= cna.prepareStatement(req);
        pst.setInt(1,i);
        return pst.executeUpdate(); 
	}catch(Exception e ){
		System.out.println("absence");
	}
	return 0;
}
	

	public static void main(String[] args) {
		
		try {
			Absence ab = new Absence(1,"2j","justifier");
			AbsenceDao abd= new AbsenceDao();
			abd.deleteAbsence(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
