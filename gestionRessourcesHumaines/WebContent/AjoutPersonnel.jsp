<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=utf-8 >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <form  class="" method="Post" action="Personnels">
          <label> num_p</label><br>
		  <input type="text" class=""   name="num_p"><br><br>
		  
		  <label>CIN</label><br>
		  <input type="text" class=""   name="cin"><br><br>
		  
		  <label>Pren_n_arabe: </label><br>
		  <input type="text" class=""   name="Pren_n_arabe"><br><br>
		  
		  <label>Pren_n: </label><br>
		  <input type="text" class=""   name="Pren_n"><br><br>
		  
		  <label> Datenaissance</label><br>
		  <input type="date" class=""   name="Datenaissance"><br><br>
		  
		   <label>Adresse</label><br>
		   <textarea name="adresse" rows="10" cols="30"></textarea> <br><br>
		  
		  <label>Tel: </label><br>
		  <input type="text" class=""   name="Tel"><br><br>
		  
		  <label>Nationalite marocain(e): </label><br>
		  <input type="radio" id="" name="nationalite" value="oui">
          <label for="oui">oui</label><br>
          <input type="radio" id="" name="nationalite" value="non">
          <label for="non">non</label><br><br><br>
		  
		  <label>Sexe: </label><br>
		  <input type="radio" id="male" name="sexe" value="male">
          <label for="male">Male</label><br>
          <input type="radio" id="female" name="sexe" value="female">
          <label for="female">Female</label><br>
		  
		  
		  <input type="submit" class="" name="actionID" value="ajouter">
      
      
      
      </form>

</body>
</html>