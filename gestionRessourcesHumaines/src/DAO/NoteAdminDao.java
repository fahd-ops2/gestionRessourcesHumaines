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
public ResultSet selectAllby(){
	try{
	String req =" SELECT Pren_n,Pren_N_arabe,NoteAdministratif FROM `noteadmin` na,personnel p where p.Id=na.personnelID " ;
	PreparedStatement st = cna.prepareStatement(req);
	ResultSet rst = st.executeQuery();
	return rst;
	}catch(Exception e){
		System.out.println("Err selectiong");
	}
	return null;
	
}
public ResultSet selectAllbycin(String cin ){
	try{
	String req =" SELECT Pren_n,Pren_N_arabe,NoteAdministratif FROM `noteadmin` na,personnel p where p.Id=na.personnelID and cin =?" ;
	PreparedStatement st = cna.prepareStatement(req);
	st.setString(1,cin);
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
		ResultSet st=ntd.selectAllbycin("qq");
		while(st.next()){
			System.out.println(st.getObject(1)+" "+st.getObject(2)+" "+st.getObject(3));
		}
		}catch(Exception e ){
		System.out.println("not done ");
		}
	
}
}

   
   

