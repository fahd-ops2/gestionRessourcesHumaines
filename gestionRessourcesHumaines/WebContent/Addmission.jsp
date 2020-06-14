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
<title>affectation de mission</title>
</head>
<body> 
<%@ include file="Index.html" %>
<h1>afectation de mission</h1>
       <%
         String cin= request.getParameter("cin");
         PersonnelDao per=new PersonnelDao();
         ResultSet res =per.selectby(cin);
         while (res.next()){

       %>
    <form class="" method="post" action="Missions"  >
          
		  <input type="text" class=""   name="PersonnelID" value="<%=res.getInt("ID") %>"><br><br>
		  
          
          <label>la mission: </label><br>
		  <input type="text" class=""   name="Mission"><br><br>
		  
		  <label>Date debut</label><br>
		  <input type="date" class=""   name="Date_debut"><br><br>
		  
		  <label>Date fin </label><br>
		  <input type="date" class=""   name="Date_fin"><br><br>
		  
		  <label>Etablissement et ville </label><br>
		  <input type="text" class=""   name="Etablissement_ville"><br><br>
		  
		  <label>code mission </label><br>
		  <input type="text" class=""   name="CodeLM"><br><br>

		  <input type="submit" class="" name="actionID" value="affecter">
		  <%} %>
		</form>  



</body>
</html>