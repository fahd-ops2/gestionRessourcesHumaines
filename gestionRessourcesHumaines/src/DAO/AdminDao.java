/**
 * 
 */
package DAO;

import java.sql.*;

import classes.*;



/**
 * @author private
 *
 */
public class AdminDao {
	private Connection cna=null;
	/**
	 * 
	 */
	public AdminDao() {
		cna=Singleton.getConnect().getCn();
	}
	public int insertAdmin(Admin a){
		
		
		try {
			
			
             String req ="INSERT INTO `admin`( `Login`, `Password`, `nomA`, `prenomA`) VALUES ( ?, ?,?,?) ";
             PreparedStatement pst= cna.prepareStatement(req);
             pst.setString(1,a.getLogin());
             pst.setString(2,a.getPassword());
             pst.setString(3,a.getNomA());
             pst.setString(4,a.getPrenomA());
             return pst.executeUpdate();       
		} catch (SQLException e) {
			e.getMessage();
		}
		return -1; 

}
	public int deleteAdmin(int i){
		try{
			String req ="DELETE FROM `Admin` WHERE `ID`=? ";
	        PreparedStatement pst= cna.prepareStatement(req);
	        pst.setInt(1,i);
	        return pst.executeUpdate(); 
		}catch(Exception e ){
			System.out.println("Admin");
		}
		return 0;
	}
	

	 public static void main(String[]args){
		 try{
		 Admin ad=new Admin( "fahda@gmail.com", "fahda122", "bouacherine", "fahd");
		 AdminDao ado=new AdminDao();
		 ado.deleteAdmin(3);
		 System.out.println(ad.toString());
	      }catch(Exception e ){System.out.println("non");}
		 }

}
