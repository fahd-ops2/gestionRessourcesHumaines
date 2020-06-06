package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;







import classes.Personnel;

public class PersonnelDao {
	private Connection cna=null;
	/**
	 * 
	 */
	public PersonnelDao() {
		cna=Singleton.getConnect().getCn();
	}
	public int insertPersonnel(Personnel p ){
		try{
			String req="INSERT INTO `personnel`( `Num_p`, `Cin`, `Pren_n_arabe`, `Pren_n`, `Datenaissance`, `Adresse`, `Tel`, `Nationalite`, `Sexe`) VALUES(?,?,?,?,?,?,?,?,?)";
			 PreparedStatement pst= cna.prepareStatement(req);
			 pst.setString(1,p.getNum_p());
			 pst.setString(2,p.getCin());
			 pst.setString(3,p.getPren_n_arabe());
			 pst.setString(4,p.getPren_n());
			 pst.setDate(5,p.getDatenaissance());
			 pst.setString(6,p.getAdresse());
			 pst.setString(7,p.getTel());
		     pst.setString(8,p.getNationalite());
			 pst.setString(9,p.getSexe());
			 return pst.executeUpdate();
		}catch(Exception e ){
			System.out.println("PersonnelDao not done "); 
			return -1;
		}
	
	}
	public int deletePersonnel(int i){
		try{
		String req="DELETE FROM `personnel` WHERE  ID =?";
		 PreparedStatement pst= cna.prepareStatement(req);
		 pst.setInt(1,i);
		 return pst.executeUpdate();
		 }catch(Exception e){
			 System.out.println("deletePersonnel erreur");
			 return -1;}
		
	}
	public static void main(String[]args){
		
	    
		Personnel personne;
		
		try{
	    //Date d = new Date(0);
		//System.out.println(d);
		//personne= new Personnel("3","3","fahd","fa", d,"adresse","065656","marocain","masculin");
		//System.out.println(personne.toString());
		PersonnelDao pdao=new PersonnelDao();
		//pdao.insertPersonnel(personne);
		pdao.deletePersonnel(7);
		
		System.out.println("done");}
		catch(Exception e){
			System.out.println("not done");}
				
	}

}
