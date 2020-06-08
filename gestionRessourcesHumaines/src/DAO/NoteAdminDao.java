package DAO;

import java.sql.*;

import classes.NoteAdmin;

public class NoteAdminDao {
   private Connection cna=null;

/**
 * 
 */
public NoteAdminDao() {
	cna=Singleton.getConnect().getCn();
}
public int insertNoteAdmin(NoteAdmin nt){
	try{
		String req="INSERT INTO `noteadmin`(`PersonnelID`, `NoteAdministratif`) VALUES (?,?)"; 
		PreparedStatement pst= cna.prepareStatement(req);
	    pst.setInt(1, nt.getPersonnelID());
	    pst.setFloat(2, nt.getNoteAdministratif());
	    return pst.executeUpdate();}
catch(Exception ex ){
	System.out.println("insertNoteAdmin");}
	return 0;
}
public int DeleteNoteAdmin(int i){
	try{
		String req="DELETE FROM `noteadmin` WHERE `noteadmin`.`ID` = ?";
		PreparedStatement st = cna.prepareStatement(req);
		st.setInt(1, i);
		return st.executeUpdate();
	}catch(Exception e){
		System.out.println("DeleteNoteAdmin");
		return 0;
	}
}
public ResultSet selectAll(){
	try{
	String req ="SELECT * FROM `noteadmin`" ;
	PreparedStatement st = cna.prepareStatement(req);
	ResultSet rst = st.executeQuery();
	return rst;
	}catch(Exception e){
		System.out.println("Err selectiong");
	}
	return null;
	
}
public static void main(String[]args){
	try{
	
	NoteAdminDao ntd=new NoteAdminDao();
		ResultSet st=ntd.selectAll();
		while(st.next()){
			System.out.println(st.getObject(1));
		}
		}catch(Exception e ){
		System.out.println("not done ");
		}
	
}
}

   
   

