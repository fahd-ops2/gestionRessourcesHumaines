package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Absence;
import classes.Matiere;

public class MatiereDao {
	private Connection cna=null;

	/**
	 * 
	 */
	public MatiereDao() {
		cna=Singleton.getConnect().getCn();
	}
public int insertMatiere(Matiere mat){
		
		
		try {
			
			
             String req ="INSERT INTO `matiere`( `PersonnelID`, `NomMatiere`) VALUES(?,?) ";
             PreparedStatement pst= cna.prepareStatement(req);
             pst.setInt(1,mat.getPersonnelID());
             pst.setString(2,mat.getNomMatiere());
             return pst.executeUpdate();       
		} catch (SQLException e) {
			e.getMessage();
		}
		return -1; 

}
public int deleteAbsence(int i){
	try{
		String req ="DELETE FROM `matiere` WHERE`ID`=? ";
        PreparedStatement pst= cna.prepareStatement(req);
        pst.setInt(1,i);
        return pst.executeUpdate(); 
	}catch(Exception e ){
		System.out.println("absence");
	}
	return 0;
}
	
public ResultSet selectbycin(String cin){
	try {
		String req ="SELECT Pren_n,Pren_n_arabe , NomMatiere,cin FROM matiere a inner join Personnel p on p.ID=a.PersonnelID where p.cin=? ";
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
		String req ="SELECT Pren_n,Pren_n_arabe , NomMatiere,cin FROM matiere a inner join Personnel p on p.ID=a.PersonnelID ";
		PreparedStatement pst= cna.prepareStatement(req);
		return pst.executeQuery();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}


	public static void main(String[] args) {
		
		try {
			MatiereDao abd= new MatiereDao();
			ResultSet res= abd.selectbycin("qwert");
			while (res.next()){
				System.out.println(res.getObject(1)+" "+res.getObject(2)+" "+res.getObject(3)+" "+res.getObject(4));
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
