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
<title>ShowsNotes</title>
</head>
<body>
    <%@ include file="Index.html" %>
    <form action='ShowNote.jsp' method='Get'><input type='text' name ='cin'  > <input type='submit' class='' value='search'></form></td>
    <h1>note administratif</h1>
    <%  
	NoteAdminDao p= new NoteAdminDao();
	ResultSet rs = p.selectAll();
        out.write("<table class=''>");
        out.write("<tr class=''>");
        out.write("<th>Pren_n</th>");
        out.write("<th>Pren_n_arabe</th>");
        out.write("<th>Note adminstratif</th>");

        
	while(rs.next()){
		out.write("<tr>");
		out.write("<td>"+rs.getString("Pren_n")+"</td>");
		out.write("<td>"+rs.getString("Pren_n_arabe")+"</td>");
		out.write("<td>"+rs.getFloat("NoteAdministratif")+"</td>");
		out.write("</tr><br>");
	}
	rs.close();
%>
</table>
<br>

<h1>note prospection</h1><br>
<%  
    
	NoteProspDao pa= new NoteProspDao();
	ResultSet res = pa.selectAll();
        out.write("<table class=''>");
        out.write("<tr class=''>");
        out.write("<th>Pren_n</th>");
        out.write("<th>Pren_n_arabe</th>");
        out.write("<th>Note prospection</th>");
        out.write("<th>Date obtention</th>");

        
	while(res.next()){
		out.write("<tr>");
		out.write("<td>"+res.getString("Pren_n")+"</td>");
		out.write("<td>"+res.getString("Pren_n_arabe")+"</td>");
		out.write("<td>"+res.getFloat("NoteProspection")+"</td>");
		out.write("<td>"+res.getDate("DateobtentionPro")+"</td>");
		out.write("</tr>");
		
	}
	res.close();
%>
</table>


</body>
</html>