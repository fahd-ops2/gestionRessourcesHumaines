<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Fontawsome makhdmch liya f telachargement jreb 3ndk -->
    <link rel="stylesheet" href="css/Style.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="https://kit.fontawesome.com/577de7cc37.js" ></script>
<title>Insert title here</title>
</head>
<body>
 <img class="wave" src="Images/background.png" >
    <div class="container">
        <div class="img">
            <img src="Images/backgroundlogin.svg"  >
        </div>
 <div class="login-container">
                  <form method="Post" action="Admins">
                <% Object x =request.getAttribute("email");
                if (x==null)x="";
                Object y =request.getAttribute("password");
                if (y==null)y="";
                %>
                <h2>BIENVENEU</h2>
                <div class="input-div one ">
                    <div class="i">
                        <i class="fas fa-user"></i>
                    </div>
                    <div>
                        <h5>username</h5>
                        <input type="text" class="input" value="<%=x %>"  name="email">
                    </div>
                </div>
                <div class="input-div tow ">
                    <div class="i">
                        <i class="fas fa-lock"></i>
                    </div>
                    <div>
                        <h5>Password</h5>
                        <input type="password" class="input" name="password" value="<%=y %>">
                    </div>
                </div>
                <a href="#" > Forget password</a>
                <div class="btn-container">
                <input type="submit" class="btn btn-success" name="actionID" value="login">
              <button class="btn btn-danger"><a href="inscription.jsp">Inscription</a></button>
            </div>
            </form>
            </div>
            </div>
 <script type="text/javascript" src="js/main.js"></script>
</body>
</html>