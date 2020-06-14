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
<title>show note</title>
</head>
<body>
    <%@ include file="Index.html" %>
    <form action='ShowNote.jsp' method='Get'><input type='text' name ='cin'  > <input type='submit' class='' value='search'></form></td>
    <h1>note administratif</h1>
<% 
    String cin =request.getParameter("cin");
    if (cin=="")this.getServletContext().getRequestDispatcher("/ShowNotes.jsp").forward(request, response);
	NoteAdminDao pea= new NoteAdminDao();
	ResultSet reas = pea.selectAllbycin(cin);
        out.write("<table class=''>");
        out.write("<tr class=''>");
        out.write("<th>Pren_n</th>");
        out.write("<th>Pren_n_arabe</th>");
        out.write("<th>Note adminstratif</th>");

        
	while(reas.next()){
		out.write("<tr>");
		out.write("<td>"+reas.getString("Pren_n")+"</td>");
		out.write("<td>"+reas.getString("Pren_n_arabe")+"</td>");
		out.write("<td>"+reas.getFloat("NoteAdministratif")+"</td>");
		out.write("</tr>");
	}
%>
</table><br>
<h1>note prospection</h1>
<%  

if (cin=="")this.getServletContext().getRequestDispatcher("/ShowNotes.jsp").forward(request, response);
	NoteProspDao pee=new NoteProspDao();
	ResultSet rees = pee.selectAllbycin(cin);
        out.write("<table class=''>");
        out.write("<tr class=''>");
        out.write("<th>Pren_n</th>");
        out.write("<th>Pren_n_arabe</th>");
        out.write("<th>Note prospection</th>");
        out.write("<th>Date obtention</th>");

        
	while(rees.next()){
		out.write("<tr>");
		out.write("<td>"+rees.getString("Pren_n")+"</td>");
		out.write("<td>"+rees.getString("Pren_n_arabe")+"</td>");
		out.write("<td>"+rees.getFloat("NoteProspection")+"</td>");
		out.write("<td>"+rees.getDate("DateobtentionPro")+"</td>");
		out.write("</tr>");
	}
%>
</table>
<br>

<form action="NoteAdmin.jsp" >
   <input type ="hidden" name="cin" value="<%=request.getParameter("cin")%>">
   <input type="submit" class="" name="actionID" value="ajouter note les notes"></form>
</body>
</html>