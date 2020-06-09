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
<table class="">
<tr class="">
<th>Nom Francais</th>
<th>Nom Ar</th>
<th>CIN</th>
<%
	PersonnelDao p= new PersonnelDao();
	ResultSet rs = p.SelectAll();
	String named,type,action,nameU,methodeGet,methodePost,update,Delete ;
	named="delete";
	//nameU="update";
	action="Personnels";
	type="submit";
	methodeGet="Get";
	methodePost="Post";
	update="UpdatePersonnel.jsp";
	Delete ="Delete";
	while(rs.next()){
		out.write("<tr>");
		out.write("<td>"+rs.getString(2)+"</td>");
		out.write("<td>"+rs.getString(4)+"</td>");
		out.write("<td>"+rs.getString(3)+"</td>");
		out.write("<td><form action='UpdatePersonnel' method='POST'><input type='text' value='"+rs.getString(3)+"' Style=' visibility: hidden;'> <input type='button' class='' value='Update'></form></td");
		out.write("<td><form action='DeletePersonnel' method='POST'><input type='text' value='"+rs.getString(3)+"' Style=' visibility: hidden;'> <input type='button' class='' value='Delete'></form></td");
		out.write("<td><form action='' method='POST'><input type='text' value='"+rs.getString(3)+"' Style=' visibility: hidden;'> <input type='button' class='' value=''></form></td");
		out.write("</tr>");
		
	}

%>
</table>
</body>
</html>