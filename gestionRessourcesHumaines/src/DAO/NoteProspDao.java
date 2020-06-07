package DAO;
import java.sql.*;
import java.sql.Date;
import java.util.*;

import classes.NoteProsp;

public class NoteProspDao {
	private Connection cna=null;
	
	/**......**/
	public NoteProspDao() {
		cna=Singleton.getConnect().getCn();
	}
	public int insertNoteProsp(NoteProsp np){
		try{
			String req ="INSERT INTO `noteprosp` (`PersonnelID`, `NoteProspection`, `DateobtentionPro`) VALUES (?,?, ?)";
			PreparedStatement st= cna.prepareStatement(req);
			st.setInt(1,np.getPersonnelID());
			st.setFloat(2,np.getNoteProspection());
			st.setDate(3, np.getDateobtentionPro());
			return st.executeUpdate();
			
		}catch(Exception ex){
			System.out.println("insertNoteProsp");
					return 0;
		}

		
	}
	public int DeleteNoteProsp(int i){
		try{
			String req="DELETE FROM `noteprosp` WHERE `noteprosp`.`ID` = ?";
			PreparedStatement st = cna.prepareStatement(req);
			st.setInt(1, i);
			return st.executeUpdate();
		}catch(Exception e){
			System.out.println("DeleteNoteProsp");
			return 0;
		}
	}
	public static void main(String[] args){
		try{
		
		NoteProspDao nt = new NoteProspDao();
		nt.DeleteNoteProsp(1);
		
		}catch(Exception e){
			System.out.println("err");
			
		}
		
	}


}
