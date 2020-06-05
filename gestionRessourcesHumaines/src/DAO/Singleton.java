package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;



public class Singleton {
	private Connection cn=null;
	private static Singleton cnx;
    private  Singleton(){
       try{
    	   Class.forName("com.mysql.jdbc.Driver"); 
    	   String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            this.cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/presonneldb"+unicode,"root","");
       }catch(SQLException e ){JOptionPane.showMessageDialog(null,e.getMessage());} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }

public static Singleton getConnect(){
   if (cnx==null)cnx= new  Singleton();
   return  cnx;
}
	
	public Connection getCn() {
	return cn;
}

public void setCn(Connection cn) {
	this.cn = cn;
}

}
