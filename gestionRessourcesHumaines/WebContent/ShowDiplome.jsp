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
<title>show diplome</title>
</head>
<body>
    <%@ include file="Index.html" %>
    <form action='ShowDiplome.jsp' method='Get'><input type='text' name ='cin'  > <input type='submit' class='' value='search'></form>
    <h1>Diplome professionnel</h1>
    <%  
    String cin =request.getParameter("cin");
    if (cin=="")this.getServletContext().getRequestDispatcher("/ShowDiplomes.jsp").forward(request, response);
	DiplomePDao p= new DiplomePDao();
	ResultSet rs = p.selectbycin(cin);
        out.write("<table class=''>");
        out.write("<tr class=''>");
        out.write("<th>Pren_n</th>");
        out.write("<th>Pren_n_arabe</th>");
        out.write("<th>Diplome</th>");
        out.write("<th>Specialitee</th>");

        
	while(rs.next()){
		out.write("<tr>");
		out.write("<td>"+rs.getString("Pren_n")+"</td>");
		out.write("<td>"+rs.getString("Pren_n_arabe")+"</td>");
		out.write("<td>"+rs.getString("Diplomep")+"</td>");
		out.write("<td>"+rs.getString("Specialitee")+"</td>");
		out.write("</tr><br>");
	}
	rs.close();
%>
</table>
<br>

<h1>Diplome scolaire et universitaire</h1><br>
<%  

if (cin=="")this.getServletContext().getRequestDispatcher("/ShowDiplomes.jsp").forward(request, response);
    
	DiplomeSuDao pa= new DiplomeSuDao();
	ResultSet res = pa.selectbycin(cin);
        out.write("<table class=''>");
        out.write("<tr class=''>");
        out.write("<th>Pren_n</th>");
        out.write("<th>Pren_n_arabe</th>");
        out.write("<th>diplome</th>");
        out.write("<th>Specialitee</th>");

        
	while(res.next()){
		out.write("<tr>");
		out.write("<td>"+res.getString("Pren_n")+"</td>");
		out.write("<td>"+res.getString("Pren_n_arabe")+"</td>");
		out.write("<td>"+res.getString("DiplomeSU")+"</td>");
		out.write("<td>"+res.getString("Specialitee")+"</td>");
		out.write("</tr>");
		
	}
	res.close();
%>
</table>
 <form action="addDiplomes.jsp" >
   <input type ="hidden" name="cin" value="<%=request.getParameter("cin")%>">
   <input type="submit" class="" name="actionID" value="affecter un diplome"></form>
</body>
</html>