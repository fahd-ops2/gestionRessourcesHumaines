package DAO;

import java.sql.*;
import java.text.SimpleDateFormat;








import java.util.ArrayList;

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
	public int suiviinsertPersonnel(Personnel p ){
		try{
			String req="UPDATE `personnel` SET `Dateembauche`=?,`Echelle`=?,`Echelon`=?,`Situationfamiliale`=?,`NbreEnfant`=?,`Marieemploye`=?,`Num_tE`=?,`DateDésignation`=? WHERE ID=?";
			 PreparedStatement pst= cna.prepareStatement(req);
			 pst.setDate(1,p.getDateembauche());
			 pst.setString(2,p.getEchelle());
			 pst.setString(3,p.getEchelon());
			 pst.setString(4,p.getSituationfamiliale());
			 pst.setInt(5,p.getNbreEnfant());
			 pst.setString(6,p.getMarieemploye());
			 pst.setString(7,p.getNum_tE());
		     pst.setDate(8,p.getDateDesignation());
			 pst.setInt(9,p.getID());
			 return pst.executeUpdate();
		}catch(Exception e ){
			System.out.println("PersonnelDao not done "); 
			return -1;
		}
	
	}
	public int updatePersonnel(Personnel p ){
		try{
			String req="UPDATE `personnel` SET `Pren_n_arabe`=?,`Pren_n`=?,`Adresse`=?,`Tel`=?,`Nationalite`=?,`Echelle`=?,`Echelon`=?,`Situationfamiliale`=?,`NbreEnfant`=?,`Marieemploye`=?,`Num_tE`=? WHERE`ID`=? ";
			 PreparedStatement pst= cna.prepareStatement(req);
			 pst.setString(1,p.getPren_n_arabe());
			 pst.setString(2,p.getPren_n());
			 pst.setString(3,p.getAdresse());
			 pst.setString(4,p.getTel());
			 pst.setString(5,p.getNationalite());
			 pst.setString(6,p.getEchelle());
			 pst.setString(7,p.getEchelon());
		     pst.setString(8,p.getSituationfamiliale());
			 pst.setInt(9,p.getNbreEnfant());
			 pst.setString(10,p.getMarieemploye());
			 pst.setString(11,p.getNum_tE());
			 pst.setInt(12,p.getID());
			 return pst.executeUpdate();
		}catch(Exception e ){
			System.out.println("PersonnelDao up not done "); 
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
	public ArrayList<Personnel> SelectAll(){
		ArrayList<Personnel> personnels = null;
		try{
			
		String req=" SELECT * FROM personnel";
		Personnel pers;
			personnels=new ArrayList<Personnel>();
			PreparedStatement pst= cna.prepareStatement(req);
			ResultSet res =pst.executeQuery();
		    while (res.next()){
		    	pers=new Personnel(res.getInt(1),res.getInt(15),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getDate(11),res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getString(12),res.getString(13),res.getString(14),res.getString(16),res.getString(17),res.getDate(18),res.getDate(6));
		    	personnels.add(pers);
		    }
		}catch(Exception e){
			System.out.println("selectall of personnel");
			
		}
		return personnels;
	
	}
	public Personnel selectby(){;
	return null;}
	public static void main(String[]args){
		
	    
		Personnel personne;
		
		try{
	    Date d = new Date(0);
		//System.out.println(d);
		// insert //personne= new Personnel("3","3","fahd","fa", d,"adresse","065656","marocain","masculin");
		//System.out.println(personne.toString());
		PersonnelDao pdao=new PersonnelDao();
		//pdao.insertPersonnel(personne);
		//pdao.deletePersonnel(1);
		//suivi insertion 
		//personne=new Personnel(1,2,"aa","aa","aa","aa","aa",d,d);
		//pdao.suiviinsertPersonnel(personne);
		//personne= new Personnel(1, 3, "fahda","fahda", "fahda", "fahd", "fahda","fahda", "fahda", "fahda","fahda", "fahda");
		//System.out.println(personne.toString());
		//pdao.updatePersonnel(personne);
		//select all
			/*PersonnelDao ss= new PersonnelDao() ;
			ArrayList<Personnel> pp =ss.SelectAll();
			System.out.println(pp.toString());*/
		System.out.println("done");}
		catch(Exception e){
			System.out.println("not done");}
				
	}

}
