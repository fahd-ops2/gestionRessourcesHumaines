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
<body onload="check()">   
         <form  class="" method="Post" action="Personnels">
         <% String o= request.getParameter("cin");
           PersonnelDao  pes = new PersonnelDao();
           ResultSet res=pes.selectby(o);
           while(res.next()){
         %>

		  <input type="hidden" class=""   name="cin" value="<%=o%>"><br><br>
		  
		  <label>Pren_n_arabe: </label><br>
		  <input type="text" class=""   name="Pren_n_arabe" value="<%=res.getString("Pren_n_arabe")%>" ><br><br>
		  
		  <label>Pren_n: </label><br>
		  <input type="text" class=""   name="Pren_n" value="<%=res.getString("Pren_n")%>"><br><br>
		  
		   <label>Adresse</label><br>
		   <textarea name="adresse" rows="10" cols="30" value="<%=res.getString("Adresse")%>"><%=res.getString("Adresse")%></textarea> <br><br>
		  
		  <label>Tel: </label><br>
		  <input type="text" class=""   name="Tel" value="<%=res.getString("Tel")%>"><br><br>
		  
		  <label>Nationalite marocain(e): </label><br>
		  <input type="radio" id="oui" name="nationalite" value="oui">
          <label for="oui">oui</label><br>
          <input type="radio" id="non" name="nationalite" value="non">
          <label for="non">non</label><br><br><br>
           <label>Echelle</label><br>
		  <input type="text" class=""   name="Echelle" value="<%=res.getString("Echelle")%>"><br><br>
		  
		  <label>Echelon: </label><br>
		  <input type="text" class=""   name="Echelon" value="<%=res.getString("Echelon")%>"><br><br>
		  
		  <label>Situationfamiliale</label><br>
		  <input type="radio" id="" name="Situationfamiliale" value="armal">
          <label for="male">armal</label><br>
          <input type="radio" id="" name="Situationfamiliale" value="motala9">
          <label for="female">motala9</label><br>
          <input type="radio" id="" name="Situationfamiliale" value="motazawij">
          <label for="male">motazawij</label><br>
          <input type="radio" id="" name="Situationfamiliale" value="celib">
          <label for="female">celib</label><br><br>
		  
		  <label>NbreEnfant: </label><br>
		  <input type="text" class=""   name="NbreEnfant" value="<%=res.getString("NbreEnfant")%>"><br><br>
		  
		  <label>Marieemploye</label><br>
		  <input type="radio" id="" name="Marieemploye" value="oui">
          <label for="male">oui</label><br>
          <input type="radio" id="" name="Marieemploye" value="non">
          <label for="female">non</label><br><br>
          
           <label> Num_tE</label><br>
		  <input type="text" class=""   name="Num_tE" value="<%=res.getString("Num_tE")%>"><br><br>
          
          <input type="submit" class="" name="actionID" value="update">
          <%} %>
     </form>  
</body>
</html>