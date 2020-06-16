<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="classes.*"%>
    <%@ page import="DAO.*"%>
    <%@ page import="java.sql.*"%>
    
<%    String o= request.getParameter("cin");
	PersonnelDao p2= new PersonnelDao();
	ResultSet rs2 = p2.selectby(o);
	while(rs2.next()){
		
		  out.write("<div class='row'>");
          out.write("<p class='col-4'>Nom :</p>");
          out.write("<p class='col'>"+rs2.getString("Pren_n")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>الاسم بالعربية :</p>");
          out.write("<p class='col'>"+rs2.getString("Pren_n_arabe")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>C.I.N :</p>");
          out.write("<p class='col'>"+rs2.getString("cin")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>Numbre de personnel :</p>");
          out.write("<p class='col'>"+rs2.getString("Num_p")+"</p>");
          out.write("</div>");
          
          out.write("<div class='row'>");
          out.write("<p class='col-4'>Numero de personnel :</p>");
          out.write("<p class='col'>"+rs2.getString("Num_p")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>Date de Naissance :</p>");
          out.write("<p class='col'>"+rs2.getString("Datenaissance")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>Adress :</p>");
          out.write("<p class='col'>"+rs2.getString("Adresse")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>Tel :</p>");
          out.write("<p class='col'>"+rs2.getString("Tel")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>Nationalite Marocaine :</p>");
          out.write("<p class='col'>"+rs2.getString("Nationalite")+"</p>");
          out.write("</div>");
    
          out.write("<div class='row'>");
          out.write("<p class='col-4'>Sexe :</p>");
          out.write("<p class='col'>"+rs2.getString("Sexe")+"</p>");
          out.write("</div>");
     
          out.write("<div class='row'>");
          out.write("<p class='col-4'>Date Embauche :</p>");
          out.write("<p class='col'>"+rs2.getString("Dateembauche")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>Echelle :</p>");
          out.write("<p class='col'>"+rs2.getString("Echelle")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>Echelon :</p>");
          out.write("<p class='col'>"+rs2.getString("Echelon")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>Situation familiale :</p>");
          out.write("<p class='col'>"+rs2.getString("Situationfamiliale")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>Numbre D'Enfant :</p>");
          out.write("<p class='col'>"+rs2.getString("NbreEnfant")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>Marie Employe :</p>");
          out.write("<p class='col'>"+rs2.getString("Marieemploye")+"</p>");
          out.write("</div>");
           
          out.write("<div class='row'>");
          out.write(" <p class='col-4'>Numero D'Employe de Marie :</p>");
          out.write("<p class='col'>"+rs2.getString("Num_tE")+"</p>");
          out.write("</div>");

          out.write("<div class='row'>");
          out.write("<p class='col-4'>Date Désignation :</p>");
          out.write("<p class='col'>"+rs2.getString("DateDésignation")+"</p>");
          out.write("</div>");
	}
	rs2.close();
%>
			
