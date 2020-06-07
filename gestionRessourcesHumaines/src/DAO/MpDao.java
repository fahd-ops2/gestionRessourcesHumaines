package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Admin;
import classes.Mp;
import classes.Personnel;

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
			
			
             String req ="INSERT INTO `mp`(`MatiereID`, `PersonnelID`) VALUES (?,?) ";
             PreparedStatement pst= cna.prepareStatement(req);
             pst.setInt(1,mp.getMatiereID());
             pst.setInt(2,mp.getPersonnelID());
             return pst.executeUpdate();       
		} catch (SQLException e) {
			e.getMessage();
		}
		return -1; 

}
public int deleteMp(int i){
	try{
		String req ="DELETE FROM `mp` WHERE `ID`=? ";
        PreparedStatement pst= cna.prepareStatement(req);
        pst.setInt(1,i);
        return pst.executeUpdate(); 
	}catch(Exception e ){
		System.out.println("deleteMp");
	}
	return 0;
}
public ResultSet selectAll(){
	try{
	String req=" SELECT Pren_n,Pren_N_arabe,NomMatiere  FROM `mp`  ,personnel p ,matiere ma  WHERE mp.MatiereID=ma.ID  and mp.PersonnelID = p.ID";
		PreparedStatement pst= cna.prepareStatement(req);
		ResultSet res =pst.executeQuery();
		return res;
	}catch(Exception e){
		System.out.println("selectall of Mp");
		return null;
	}
}
public ResultSet selectby(int id ){
	try{
	String req=" SELECT Pren_n,Pren_N_arabe,NomMatiere  FROM `mp`  ,personnel p ,matiere ma  WHERE mp.MatiereID=ma.ID  and mp.PersonnelID = p.ID and PersonnelID=?";
		PreparedStatement pst= cna.prepareStatement(req);
		pst.setInt(1, id);
		ResultSet res =pst.executeQuery();
		return res;
	}catch(Exception e){
		System.out.println("selectall of Mp");
		return null;
	}
}
public static void main(String[] args){
	try{
	MpDao md=new MpDao();
	ResultSet res =md.selectby(1);
	 while (res.next()){
			System.out.println(res.getObject(1)+" "+res.getObject(2)+" "+res.getObject(3));
		}}
	catch(Exception e ){
		System.out.println("no");
	}
}


}
