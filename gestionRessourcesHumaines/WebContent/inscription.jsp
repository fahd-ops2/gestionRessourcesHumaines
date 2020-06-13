<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/Style.css">
   
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="fontawsome/css/all.min.css">
<title>Insert title here</title>
</head>
<body>
     <img class="wave1" src="Images/background2.png" >
    <div class="container1">
        
    <div class="container my-container login-container">
      
        <div class="row my-row align-content-center">
        
            <div class="col col-lg my-col " id="containers">
                <form method="post" action="Admins" id="myForm" novalidate onsubmit="return validateForm()" >
                    <div class="col-md-12 mb-6">
                        <div class="form-group row">
                        <label for="email">Email</label>
                        <input type="email" name="email"  class="form-control" id="email" required onfocusout="validateEmail()">
                        <span class="valid-feedback"></span>
                    </div>
                      </div>
                      <div class="col-md-12 mb-6">
                        <div class="form-group row">
                        <label for="password">Password</label>
                        <input type="password" name="password"  class="form-control" id="password" required onfocusout="validatePassword()">
                        <span class="valid-feedback"></span>
                        </div>
                      </div>
                    
                      <div class="col-md-12 mb-6">
                        <div class="form-group row">
                        <label for="confirmPassword">Confirm Password </label>
                        <input type="password"  name="confirmPassword" class="form-control" id="confirmPassword" required onfocusout="validateConfirmPassword()">
                        <span class="valid-feedback"></span>
                        </div>
                      </div>
                    
                      <div class="col-md-12 mb-6">
                        <div class="form-group row">
                        <label for="nom">Nom</label>
                        <input type="text" name="nom"  class="form-control" id="nom" required onfocusout="validateNom()">
                        <span class="valid-feedback"></span>
                        </div>
                      </div>
                    
                      <div class="col-md-12 mb-6">
                        <div class="form-group row">
                        <label for="prenom">Prenom</label>
                        <input type="text" name="prenom"  class="form-control" id="prenom" required onfocusout="validatePrenom()">
                        <span class="valid-feedback"></span>
                       

                        </div>
                      </div>
                    
                    
                    <div class="btn-container">
                        <input type="submit" class="btn btn-success" name="actionID" value="ajouter">
                    </div>
                </form>
            
               
            </div>
        
        </div>
    <div class="img img1">
        <img src="Images/insc.svg"  >
    </div>    
    </div>
    
   
    </div>
    <script src="js/formvalidation.js"></script>
    <script src="js/login.js"></script>
    
</body>
</html>