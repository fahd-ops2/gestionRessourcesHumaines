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
     
   
    
<%  String cin =request.getParameter("cin");
  
    
    CadreDao p= new CadreDao();
	ResultSet rsn = p.selectbycin(cin);
        out.write("<table class=''>");
        out.write("<tr class=''>");
        out.write("<th>Pren_n</th>");
        out.write("<th>Pren_n_arabe</th>");
        out.write("<th>Cadre</th>");

        
	while(rsn.next()){
		out.write("<tr>");
		out.write("<td>"+rsn.getString("Pren_n")+"</td>");
		out.write("<td>"+rsn.getString("Pren_n_arabe")+"</td>");
		out.write("<td>"+rsn.getString("Cadre")+"</td>");
		out.write("</tr>");
	}
	
%>
</table>
<% while(rsn.next()){
	if (request.getParameter("cin")!=rsn.getString("cin"))
		this.getServletContext().getRequestDispatcher("/ShowCadres.jsp").forward(request, response);}
 %>
   <form action="Addcadre.jsp">
   <input type ="hidden" name="cin" value="<%=request.getParameter("cin")%>">
   <input type="submit" class="" name="actionID" value="ajouter un cadre">
   </form>
</body>
</html>