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
<title>Insert title here</title>
</head>
<body>
      <%@ include file="Index.html" %>
       <%
         String cin= request.getParameter("cin");
         PersonnelDao per=new PersonnelDao();
         ResultSet res =per.selectby(cin);
         while (res.next()){

       %>
    <form class="" method="post" action="Matieres"  >

		  <input type="hidden" class=""   name="PersonnelID" value="<%=res.getInt("ID") %>"><br><br>
		  
		  <label>Matiere </label><br>
		  <input type="text" class=""   name="NomMatiere"><br><br>
		  
		  <input type="submit" class="" name="actionID" value="ajout">
	</form>
	<%} %>
</body>
</html>