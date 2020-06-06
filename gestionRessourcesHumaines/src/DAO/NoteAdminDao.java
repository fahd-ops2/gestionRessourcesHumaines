package DAO;

import java.sql.*;
import java.sql.PreparedStatement;

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
public static void main(String[]args){
	try{
	NoteAdmin note=new NoteAdmin(1,17);
	NoteAdminDao ntd=new NoteAdminDao();
	ntd.insertNoteAdmin(note);
	System.out.println(note.toString());
	
	System.out.println(" done ");}
	catch(Exception e ){
		System.out.println("not done ");}
	
}
}

   
   

