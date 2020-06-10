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
<title>plus d'info</title>
</head>
<body>
       <%@ include file="Index.html" %>
<h1>plus d'information</h1>
<%   String o= request.getParameter("cin");
	PersonnelDao p= new PersonnelDao();
	ResultSet rs = p.selectby(o);

	while(rs.next()){
		out.write("<ul>");
		out.write("<li>Pren_n_arabe:"+rs.getString("Pren_n_arabe")+"</li>");
		out.write("<li>Pren_n:"+rs.getString("Pren_n")+"</li>");
		out.write("<li> CIN:"+rs.getString("cin")+"</li>");
		out.write("<li>Num_p:"+rs.getString("Num_p")+"</li>");
		out.write("<li>Date de naissance:"+rs.getString("Datenaissance")+"</li>");
		out.write("<li> Adresse:"+rs.getString("Adresse")+"</li>");
		out.write("<li>Tel::"+rs.getString("Tel")+"</li>");
		out.write("<li>Nationalite marocaine:"+rs.getString("Nationalite")+"</li>");
		out.write("<li> Sexe:"+rs.getString("Sexe")+"</li>");
		out.write("<li>Dateembauche:"+rs.getString("Dateembauche")+"</li>");
		out.write("<li>Echelle:"+rs.getString("Echelle")+"</li>");
		out.write("<li> Echelon:"+rs.getString("Echelon")+"</li>");
		out.write("<li>Situationfamiliale:"+rs.getString("Situationfamiliale")+"</li>");
		out.write("<li>NbreEnfant:"+rs.getString("NbreEnfant")+"</li>");
		out.write("<li> Marieemploye:"+rs.getString("Marieemploye")+"</li>");
		out.write("<li>Num_tE:"+rs.getString("Num_tE")+"</li>");
		out.write("<li>DateDésignation:"+rs.getString("DateDésignation")+"</li>");
		
		out.write("</ul>");
	}
%>
			<a href="ShowPersonnel.jsp"> <input type="submit" class="" name="actionID" value="retour"></a>

</body>
</html>