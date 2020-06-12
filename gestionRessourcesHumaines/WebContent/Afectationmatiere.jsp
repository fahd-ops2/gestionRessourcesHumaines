<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*" %>
    <%@ page import="classes.*"%>
    <%@ page import="DAO.*"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>afectation de matiere</title>
</head>
<body>
      <%@ include file="Index.html" %>
            <form action="" methode="">
			  <label for="matiere">Matiere:</label>
			  <select name="matiere" id="matiere">
      
           <% 	Connection cna=null;	
           String req=" SELECT * FROM `Matiere`";
           cna=Singleton.getConnect().getCn();
   		  PreparedStatement pst= cna.prepareStatement(req);
   		  ResultSet res =pst.executeQuery();
					while (res.next()){
						System.out.println(res.getObject(1));
           %>	
			 
			      <option value="<%=res.getObject(1)%>"><%=res.getObject(2)%></option>;
              <%} %>
			  </select>
			  <br><br>
			  <input type="submit" value="Submit">
			</form>
			
</body>
</html>