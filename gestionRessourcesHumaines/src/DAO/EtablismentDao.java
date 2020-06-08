package DAO;
import classes.Etablisment;

import java.sql.*;
import java.sql.Date;
import  java.util.*;

public class EtablismentDao {
	private Connection cn= null;
	
	public EtablismentDao(){
		cn=Singleton.getConnect().getCn();
	}
	public int insertEtablisment(Etablisment et){
		try{
			String req="INSERT INTO `etablisment` (`ListeMissionID`, `PersonnelID`, `Etablissement_ville`, `Date_debut`, `Date_fin`) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement st= cn.prepareStatement(req);
			st.setInt(1,et.getListeMissionID());
			st.setInt(2, et.getPersonnelID());
			st.setString(3,et.getEtablissement_ville());
			st.setDate(4, et.getDate_debut());
			st.setDate(5, et.getDate_fin());
			return st.executeUpdate();
			
			
		}catch(Exception e){
			System.out.print("insertEtablisment");
			return 0;
		}
		

	}
	public int DeleteEtablisment(int i){
			try{
				String req="DELETE FROM `etablisment` WHERE `etablisment`.`ID` = ?";
				PreparedStatement st = cn.prepareStatement(req);
				st.setInt(1, i);
				return st.executeUpdate();
			}catch(Exception e){
				System.out.println("DeleteEtablisment");
				return 0;
			}
		}
	public ResultSet selectAllbycin(String cin ){
		try{
		String req =" SELECT Pren_n,Pren_N_arabe,ListeMissionID,Etablissement_ville,Etablissement_ville,Date_debut,Date_fin FROM `etablisment` eta,personnel p where p.Id=eta.personnelID and cin =?" ;
		PreparedStatement st = cn.prepareStatement(req);
		st.setString(1,cin);
		ResultSet rst = st.executeQuery();
		return rst;
		}catch(Exception e){
			System.out.println("Err selecting by cin");
		}
		return null;
		
	}
	public ResultSet selectAll(){
		try{
		String req =" SELECT Pren_n,Pren_N_arabe,ListeMissionID,Etablissement_ville,Etablissement_ville,Date_debut,Date_fin FROM `noteadmin` eta,personnel p where p.Id=eta.personnelID " ;
		PreparedStatement st = cn.prepareStatement(req);
		ResultSet rst = st.executeQuery();
		return rst;
		}catch(Exception e){
			System.out.println("Err selecting all");
		}
		return null;
		
	}
	public static void main(String[] args){
		try{
		
		EtablismentDao s = new EtablismentDao();
		s.DeleteEtablisment(1);
		
		}catch(Exception e){
			System.out.println("err");
			
		}
	}

}
