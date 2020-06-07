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
			
			
             String req ="INSERT INTO `diplomesu`( `PersonnelID`, `SpecialiteID`, `DiplomeSU`, `DateobtentionSu`, `Faculte`) VALUES ( ?, ?,?,?,?) ";
             PreparedStatement pst= cna.prepareStatement(req);
             pst.setInt(1,dsu.getPersonnelID());
             pst.setInt(2,dsu.getSpecialiteID());
             pst.setString(3,dsu.getDiplomeSU());
             pst.setDate(4,dsu.getDateobtentionSu());
             pst.setString(5,dsu.getFaculte());
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
		
		String req=" SELECT * FROM `diplomesu` ";
			PreparedStatement pst= cna.prepareStatement(req);
			ResultSet res =pst.executeQuery();
			return res;
		}catch(Exception e){
			System.out.println("selectby of personnel");
			return null;
		}}
public ResultSet selectbyId(int id){
	try{
		
		String req=" SELECT * FROM `diplomesu` where PersonnelID = ? ";
			PreparedStatement pst= cna.prepareStatement(req);
			pst.setInt(1, id);
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
	 ResultSet res =ado.selectbyId(1);
	 while (res.next()){
			System.out.println(res.getObject(1)+" "+res.getObject(2)+" "+res.getObject(3)+" "+res.getObject(4)+" "+res.getObject(5)+" "+res.getObject(6));
		}
     }catch(Exception e ){System.out.println("non");}
	 }
}
