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
<title>notes</title>
</head>
<body>
     <%@ include file="Index.html" %>
     <h1>note administratif</h1>
     <%
         String cin= request.getParameter("cin");
         PersonnelDao per=new PersonnelDao();
         ResultSet res =per.selectby(cin);
         while (res.next()){

       %>
    <form class="" method="post" action="Notes"  >

          <br>
		  <input type="hidden" class=""   name="PersonnelID" value="<%=res.getInt("ID") %>"><br><br>
		  
		  <label>NoteAdministratif </label><br>
		  <input type="text" class=""   name="NoteAdministratif"><br><br>
		  
		  
		  
		  <input type="submit" class="" name="actionID" value="addNotea">
		  
		</form> <br>
		<h1>note prospection</h1>
		<form class="" method="post" action="Notes"  >
		<br>

          
		  <input type="hidden" class=""   name="PersonnelID" value="<%=res.getInt("ID") %>"><br><br>
		  
		  <label>NoteProspection </label><br>
		  <input type="text" class=""   name="NoteProspection"><br><br>
		  
		  <label>DateobtentionPro </label><br>
		  <input type="Date" class=""   name="DateobtentionPro"><br><br>
		  
		  
		  
		  <input type="submit" class="" name="actionID" value="addNotep">
		  
		</form> 
		<%} %>
		 <a href="ShowNotes.jsp"> <input type="submit" class="" name="actionID" value="retour"></a>
</body>
</html>