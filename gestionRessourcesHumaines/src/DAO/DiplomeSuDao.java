package DAO;

import java.sql.*;

import classes.Admin;
import classes.DiplomeSu;
public class DiplomeSuDao {
     private Connection cna=null;
	/**
	 * 
	 */
	public DiplomeSuDao() {
		cna=Singleton.getConnect().getCn();
	}
public int insertDiplomeSu(DiplomeSu dsu){
		
		
		try {
			
			
             String req ="INSERT INTO `diplomesu`( `PersonnelID`, `DiplomeSU`, `DateobtentionSu`, `Faculte`, `Specialitee`, `CodeS`) VALUES  ( ?, ?,?,?,?,?) ";
             PreparedStatement pst= cna.prepareStatement(req);
             pst.setInt(1,dsu.getPersonnelID());
             pst.setString(2,dsu.getDiplomeSU());
             pst.setString(3,dsu.getDateobtentionSu());
             pst.setString(4,dsu.getFaculte());
             pst.setString(5,dsu.getSpecialitee());
             pst.setInt(6,dsu.getCodeS());
             return pst.executeUpdate();       
		} catch (SQLException e) {
			e.getMessage();
		}
		return -1; 

}
public int deleteDiplomeSu(int i){
	try{
		String req ="DELETE FROM `diplomesu` WHERE`ID`=? ";
        PreparedStatement pst= cna.prepareStatement(req);
        pst.setInt(1,i);
        return pst.executeUpdate(); 
	}catch(Exception e ){
		System.out.println("Admin");
	}
	return 0;
}
public ResultSet selectAll(){
	try{
		
		String req="   SELECT Pren_n,Pren_N_arabe,`DiplomeSU`,Specialitee,cin FROM `diplomesu`dipsu,personnel p where p.Id=dipsu.personnelID  ";
			PreparedStatement pst= cna.prepareStatement(req);
			ResultSet res =pst.executeQuery();
			return res;
		}catch(Exception e){
			System.out.println("selectall of personnel");
			return null;
		}}
public ResultSet selectbycin(String cin){
	try{
		
		String req="  SELECT Pren_n,Pren_N_arabe,`DiplomeSU`,Specialitee,cin FROM `diplomesu`dipsu,personnel p where p.Id=dipsu.personnelID and p.cin= ? ";
			PreparedStatement pst= cna.prepareStatement(req);
			pst.setString(1, cin);
			ResultSet res =pst.executeQuery();
			return res;
		}catch(Exception e){
			System.out.println("selectby of personnel");
			
		}
		return null;}
public static void main(String[]args){
	 try{
		 //Date d= new Date(0);
	 //DiplomeSu ad=new DiplomeSu( 1, 1, "aaaa", "aaa",d);
	 DiplomeSuDao ado=new DiplomeSuDao();
	 ResultSet res =ado.selectAll();
	 while (res.next()){
			System.out.println(res.getObject(1));
		}
     }catch(Exception e ){System.out.println("non");}
	 }
}
