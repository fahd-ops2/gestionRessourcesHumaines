<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body>
         <form  class="" method="Post" action="Personnels">
		  <input type="hidden" class=""   name="cin"><br><br>
		  
		  <label>Pren_n_arabe: </label><br>
		  <input type="text" class=""   name="Pren_n_arabe"><br><br>
		  
		  <label>Pren_n: </label><br>
		  <input type="text" class=""   name="Pren_n"><br><br>
		  
		  
		   <label>Adresse</label><br>
		   <textarea name="adresse" rows="10" cols="30"></textarea> <br><br>
		  
		  <label>Tel: </label><br>
		  <input type="text" class=""   name="Tel"><br><br>
		  
		  <label>Nationalite marocain(e): </label><br>
		  <input type="radio" id="" name="nationalite" value="oui">
          <label for="oui">oui</label><br>
          <input type="radio" id="" name="nationalite" value="non">
          <label for="non">non</label><br><br><br>
           <label>Echelle</label><br>
		  <input type="text" class=""   name="Echelle"><br><br>
		  
		  <label>Echelon: </label><br>
		  <input type="text" class=""   name="Echelon"><br><br>
		  
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
		  <input type="text" class=""   name="NbreEnfant"><br><br>
		  
		  <label>Marieemploye</label><br>
		  <input type="radio" id="" name="Marieemploye" value="oui">
          <label for="male">oui</label><br>
          <input type="radio" id="" name="Marieemploye" value="non">
          <label for="female">non</label><br><br>
          
          <input type="submit" class="" name="actionID" value="update">
     </form>  
</body>
</html>