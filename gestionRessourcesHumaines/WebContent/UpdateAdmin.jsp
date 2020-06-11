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
<title>update</title>
</head>
<body>
      <%@ include file="Index.html" %>
      <form class="" method="post" action="Admins"  >
      <% int o= Integer.parseInt(request.getParameter("mod"));
         AdminDao ad= new AdminDao();
         ResultSet res=ad.selectby(o);
         while(res.next()){
      %>
          <input type="text" class=""  name="idA" value="<%=o %>"><br>
          <label>Email: </label><br>
		  <input type="email" class=""   name="email" value="<%=res.getString("login")%>"><br><br>
		  
		  <label>mot de passe </label><br>
		  <input type="password" class=""   name="password" value="<%=res.getString("password")%>"><br><br>
		  
		  <input type="submit" class="" name="actionID" value="update">
      <%} %>
		</form>  
</body>
</html>