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
            <form action="Mps" method="Post">
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
		out.write("<input type='text' name='idp' value='"+res.getInt(1) +"'");
		out.write("</tr>");
	}}%>
	</table>
           <label for="matiere">Matiere:</label>
			  <select name="matiere" id="matiere">
           <% 	
           Connection cna=null;	
           String req=" SELECT * FROM `Matiere`";
           cna=Singleton.getConnect().getCn();
   		  PreparedStatement pst= cna.prepareStatement(req);
   		  ResultSet res =pst.executeQuery();
					while (res.next()){
						
           %>	
			      <option value="<%=res.getInt(1)%>"><%=res.getString(2)%></option>
			      
              <%} 
				%>
			  </select>
			  <br><br>
			  <input type="submit" name="actionID" value="mpsAjout">
			</form>
			
</body>
</html>