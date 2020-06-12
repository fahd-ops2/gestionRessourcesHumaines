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
<title>affecter</title>
</head>
<body> 
        <form  method="Post" action="Matieres">
        <label>matiere: </label><br>

           <% 	
           int id =Integer.parseInt(request.getParameter("id"));
           Connection cna=null;	
           String req=" SELECT * FROM `Matiere`";
           cna=Singleton.getConnect().getCn();
   		  PreparedStatement pst= cna.prepareStatement(req);
   		  ResultSet res =pst.executeQuery();
					while (res.next()){
						
           %>	
			      <input type="radio" id="<%=res.getInt(1)%>" name="matiere" value="<%=res.getInt(1)%>">
                  <label for="<%=res.getInt(1)%>"><%=res.getString(2)%></label><br>  
              <%} 
				%>
			  <input type='text' name ='idp' value=<%=id %>> 
			  <br><br>
			  <input type="submit" name="aff" value="mpsAjout">
			</form>
</body>
</html>