package classes;

import java.sql.Connection;




import DAO.Singleton;

public class Admin {
 private int ID;
 private String Password,Login,nomA,prenomA;
/**
 * @param iD
 * @param password
 * @param login
 * @param nomA
 * @param prenomA
 */
 
public Admin( int id,String login, String password , String nomA, String prenomA) {
	ID=id;
	Password = password;
	Login = login;
	this.nomA = nomA;
	this.prenomA = prenomA;
}
/**
 * @param iD
 * @param password
 * @param login
 */
public Admin(int iD, String login, String password) {
	super();
	ID = iD;
	Password = password;
	Login = login;
}
public Admin( String login, String password , String nomA, String prenomA) {
	
	Password = password;
	Login = login;
	this.nomA = nomA;
	this.prenomA = prenomA;
}


/**
 * @return the iD
 */
public int getID() {
	return ID;
}
/**
 * @param iD the iD to set
 */
public void setID(int iD) {
	ID = iD;
}
/**
 * @return the password
 */
public String getPassword() {
	return Password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	Password = password;
}
/**
 * @return the login
 */
public String getLogin() {
	return Login;
}
/**
 * @param login the login to set
 */
public void setLogin(String login) {
	Login = login;
}
/**
 * @return the nomA
 */
public String getNomA() {
	return nomA;
}
/**
 * @param nomA the nomA to set
 */
public void setNomA(String nomA) {
	this.nomA = nomA;
}
/**
 * @return the prenomA
 */
public String getPrenomA() {
	return prenomA;
}
/**
 * @param prenomA the prenomA to set
 */
public void setPrenomA(String prenomA) {
	this.prenomA = prenomA;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Admin [ID=" + ID + ", Password=" + Password + ", Login=" + Login
			+ ", nomA=" + nomA + ", prenomA=" + prenomA + "]";
}
 public static void main(String[]args){
	 Connection cn;
	 try{
	 cn=Singleton.getConnect().getCn();
	 System.out.println("oui");
      }catch(Exception e ){System.out.println("non");}
	 }
}
