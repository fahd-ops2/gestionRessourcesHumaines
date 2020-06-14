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
<title>showCadre</title>
</head>
<body>
     <%@ include file="Index.html" %>
    <form action='showCadre.jsp' method='Get'><input type='text' name ='cin'  > <input type='submit' class='' value='search'></form></td>
    
<%  String cin =request.getParameter("cin");
    if (cin=="")this.getServletContext().getRequestDispatcher("/ShowCadres.jsp").forward(request, response);
    
    CadreDao p= new CadreDao();
	ResultSet rs = p.selectbycin(cin);
        out.write("<table class=''>");
        out.write("<tr class=''>");
        out.write("<th>Pren_n</th>");
        out.write("<th>Pren_n_arabe</th>");
        out.write("<th>Cadre</th>");

        
	while(rs.next()){
		out.write("<tr>");
		out.write("<td>"+rs.getString("Pren_n")+"</td>");
		out.write("<td>"+rs.getString("Pren_n_arabe")+"</td>");
		out.write("<td>"+rs.getString("Cadre")+"</td>");
		out.write("</tr>");
	}
	
%>
</table>
<% while(rs.next()){
	if (request.getParameter("cin")!=rs.getString("cin"))
		this.getServletContext().getRequestDispatcher("/ShowCadres.jsp").forward(request, response);}
 %>
   <form action="Addcadre.jsp">
   <input type ="hidden" name="cin" value="<%=request.getParameter("cin")%>">
   <input type="submit" class="" name="actionID" value="ajouter un cadre">
   </form>
</body>
</html>