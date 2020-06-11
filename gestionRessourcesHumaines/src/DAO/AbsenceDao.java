package DAO;
import java.sql.*;
import java.util.ArrayList;

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
			
			
             String req ="INSERT INTO `absence`( `PersonnelID`, `Duree`, `Justification`,DateAbsence) VALUES(?,?,?,?) ";
             PreparedStatement pst= cna.prepareStatement(req);
             pst.setString(1,abs.getPersonnelID());
             pst.setString(2,abs.getDuree());
             pst.setString(3,abs.getJustification());
             pst.setString(4,abs.getDateAbsence());
             
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
public int updateAbsence(Absence a){
	try {
		String req ="UPDATE `absence` SET duree=? `Justification`=? WHERE ID=? ";
		PreparedStatement pst= cna.prepareStatement(req);
		pst.setString(1,a.getDuree());
		pst.setString(2, a.getJustification());
		pst.setInt(3,a.getID());
		return pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
}	
public ResultSet selectbycin(String cin){
	try {
		String req ="SELECT Pren_n,Pren_n_arabe , a.ID,`Duree`, `Justification`,DateAbsence FROM absence a inner join Personnel p on p.ID=a.PersonnelID where p.cin=? ";
		PreparedStatement pst= cna.prepareStatement(req);
		pst.setString(1, cin);
		return pst.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}

public ResultSet selectAll(){
	try {
		String req ="SELECT Pren_n,Pren_n_arabe , `Duree`, `Justification`,DateAbsence FROM absence a inner join Personnel p on p.ID=a.PersonnelID  ";
		PreparedStatement pst= cna.prepareStatement(req);
		return pst.executeQuery();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}

public ResultSet selectbyid(int id){
	try {
		String req ="SELECT Pren_n,Pren_n_arabe , a.ID,`Duree`, `Justification`,DateAbsence FROM absence a inner join Personnel p on p.ID=a.PersonnelID where a.ID=? ";
		PreparedStatement pst= cna.prepareStatement(req);
		pst.setInt(1, id);
		return pst.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
	public static void main(String[] args) {
		
		try {
			AbsenceDao abd= new AbsenceDao();
			ResultSet res= abd.selectbyid(1);
			while (res.next()){
				System.out.println(res.getObject(1)+" "+res.getObject(2)+" "+res.getObject(3)+" "+res.getObject(4));
			}
			//System.out.println(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
