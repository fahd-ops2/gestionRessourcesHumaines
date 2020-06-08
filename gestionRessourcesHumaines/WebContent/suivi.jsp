<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta content="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      
      <form action="Personnels" method="Post">
      <% Object o= request.getAttribute("cin"); %>
      <input type="text" class=""   name ="cin" value="<%=o%>"><br><br>
          <label> Dateembauche</label><br>
		  <input type="date" class=""   name="Dateembauche"><br><br>
		  
		  <label>Echelle</label><br>
		  <input type="text" class=""   name="Echelle"><br><br>
		  
		  <label>Echelon: </label><br>
		  <input type="text" class=""   name="Echelon"><br><br>
		  
		  <label>Situationfamiliale</label><br>
		  <input type="radio" id="" name="Situationfamiliale" value="oui">
          <label for="male">armal</label><br>
          <input type="radio" id="" name="Situationfamiliale" value="non">
          <label for="female">motala9</label><br>
          <input type="radio" id="" name="Situationfamiliale" value="oui">
          <label for="male">motazawij</label><br>
          <input type="radio" id="" name="Situationfamiliale" value="non">
          <label for="female">celib</label><br><br><br>
		  
		  <label>NbreEnfant: </label><br>
		  <input type="text" class=""   name="NbreEnfant"><br><br>
		  
		  <label>Marieemploye</label><br>
		  <input type="radio" id="" name="Marieemploye" value="oui">
          <label for="male">oui</label><br>
          <input type="radio" id="" name="Marieemploye" value="non">
          <label for="female">non</label><br><br><br>
		  
		  <label> Num_tE</label><br>
		  <input type="text" class=""   name="Num_tE"><br><br>
		  
		   <label>DateDésignation</label><br>
		   <input type="date" class=""   name="DateDesignation"><br><br> 
		   
		   <input type="submit" value="suivre" name="actionID">
       </form>
</body>
</html>