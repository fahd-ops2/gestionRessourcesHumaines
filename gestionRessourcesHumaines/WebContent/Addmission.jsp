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
         String cin= request.getParameter("idp");
         PersonnelDao per=new PersonnelDao();
         ResultSet res =per.selectby(cin);
         while (res.next()){

       %>
    <form class="" method="post" action="Absences"  >
          
		  <input type="hidden" class=""   name="idperso" value="<%=res.getInt("ID") %>"><br><br>
		  
          <label>duree par jour : </label><br>
		  <input type="text" class=""   name="duree"><br><br>
		  
		  <label>Date d'absence </label><br>
		  <input type="date" class=""   name="DateAbsence"><br><br>
		  
		  <label>justification: </label><br>
		  <input type="radio" id="justifie" name="justification" value="justifie">
          <label for="justifie">justifie</label><br>
          <input type="radio" id="non justifie" name="justification" value="non justifie">
          <label for="non justifie">non justifiee</label><br>

		  <input type="submit" class="" name="actionID" value="ajouterAb">
		  <%} %>
		</form>  
<h1>afectation de mission</h1>


</body>
</html>