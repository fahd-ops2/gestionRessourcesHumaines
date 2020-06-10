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
<table class="">
<tr class="">
<th>Nom Francais</th>
<th>Nom Ar</th>
<th>CIN</th>
<% 
	PersonnelDao p= new PersonnelDao();
	ResultSet rs = p.SelectAll();

	while(rs.next()){
		out.write("<tr>");
		out.write("<td>"+rs.getString(5)+"</td>");
		out.write("<td>"+rs.getString(4)+"</td>");
		out.write("<td>"+rs.getString(3)+"</td>");
		
		out.write("<td><form action='updatePersonnel.jsp' method='POST'><input type='hidden' name ='cin' value='"+rs.getString(3)+"' Style=' visibility: hidden;'> <input type='submit' class='' value='modifier'></form></td>");
		out.write("<td><form action='Personnels' method='Get'><input type='hidden' name ='delete'value='"+rs.getString(3)+"' Style=' visibility: hidden;'> <input type='submit' class='' value='supprimer'></form></td>");
		out.write("<td><form action='showmore.jsp' method='POST'><input type='hidden'name ='cin' value='"+rs.getString(3)+"' Style=' visibility: hidden;'> <input type='submit' class='' value='showmore'></form></td>");
		out.write("</tr>");
	}
%>
</table>
   <a href="AjoutPersonnel.jsp"><input type="submit" class="" name="actionID" value="ajouter un nouveau personnel"></></a>
</body>
</html>