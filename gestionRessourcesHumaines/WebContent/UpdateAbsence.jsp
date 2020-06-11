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

       <%@ include file="Index.html" %><br>
      
     
       <form class="" method="post" action="Absences"  >
       <% 
         int o= Integer.parseInt(request.getParameter("id"));
         AbsenceDao ad= new AbsenceDao();
         ResultSet res=ad.selectbyid(o);
         while(res.next()){
      %>
          
		  <input type="hidden" class=""   name="id" value="<%=res.getInt("ID") %>"><br><br>
		  
          <label>duree par jour : </label><br>
		  <input type="text" class=""   name="duree" value="<%=res.getInt("duree") %>"><br><br>
		  
		  <label>justification: </label><br>
		  <input type="radio" id="justifie" name="justification" value="justifie">
          <label for="justifie">justifie</label><br>
          <input type="radio" id="non justifie" name="justification" value="non justifie">
          <label for="non justifie">non justifiee</label><br>
         
		  <input type="submit" class="" name="actionID" value="updateAb">
		   <%} %>
        
		</form>  
		
</body>
</html>