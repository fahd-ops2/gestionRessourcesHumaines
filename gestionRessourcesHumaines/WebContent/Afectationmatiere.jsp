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
      <form action='Afectationmatiere.jsp' method='Get'><input type='text' name ='cin'  > <input type='submit' class='' value='search'></form>
            
            <table class="">
			<tr class="">
			<th>Nom Francais</th>
			<th>Nom Ar</th>
			<th>CIN</th>
      <%  String cin =request.getParameter("cin");
    if (cin!=""){
	PersonnelDao pe= new PersonnelDao();
	ResultSet res = pe.selectby(cin);
	while(res.next()){
		out.write("<tr>");
		out.write("<td>"+res.getString(5)+"</td>");
		out.write("<td>"+res.getString(4)+"</td>");
		out.write("<td>"+res.getString(3)+"</td>");
		out.write("<td><form action='affecter.jsp' method='POST'><input type='text' name ='id' value='"+res.getInt(1)+"'> <input type='submit' class='' value='affecter'></form></td>");
		out.write("</tr>");
	}}%>
	</table>
          
			
</body>
</html>