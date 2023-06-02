<%-- 
    Document   : Adminlogin
    Created on : 18 Dec, 2022, 9:55:30 AM
    Author     : 03
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="mystyle.css">

        <style>
            h1{
                color: white;
               
            }
            html {
  height: 100%;
}
body {
  margin:0;
  padding:0;
  font-family: sans-serif;
  background: linear-gradient(#141e30, #243b55);
}

.login-box {
  position: absolute;
  top: 50%;
  left: 50%;
   width: 400px;
  padding: 40px;
  transform: translate(-50%, -50%);
  background: rgba(0,0,0,.5);
  box-sizing: border-box;
  box-shadow: 0 15px 25px rgba(0,0,0,.6);
  border-radius: 10px;
}

.login-box h2 {
  margin: 0 0 30px;
  padding: 0;
  color: #fff;
  text-align: center;
}

.login-box .user-box {
  position: relative;
}

.login-box .user-box input {
  width: 100%;
  padding: 10px 0;
  font-size: 16px;
  color: #fff;
  margin-bottom: 30px;
  border: none;
  border-bottom: 1px solid #fff;
  outline: none;
  background: transparent;
}
.login-box .user-box label {
  position: absolute;
  top:0;
  left: 0;
  padding: 10px 0;
  font-size: 16px;
  color: #fff;
  pointer-events: none;
  transition: .5s;
}

.login-box .user-box input:focus ~ label,
.login-box .user-box input:valid ~ label {
  top: -20px;
  left: 0;
  color: #03e9f4;
  font-size: 12px;
}

.login-box form a {
  position: relative;
  display: inline-block;
  padding: 10px 20px;
  color: #03e9f4;
  font-size: 16px;
  text-decoration: none;
  text-transform: uppercase;
  overflow: hidden;
  transition: .5s;
  margin-top: 40px;
  letter-spacing: 4px
}

.login-box a:hover {
  background: #03e9f4;
  color: #fff;
  border-radius: 5px;
  box-shadow: 0 0 5px #03e9f4,
              0 0 25px #03e9f4,
              0 0 50px #03e9f4,
              0 0 100px #03e9f4;
}

.login-box a span {
  position: absolute;
  display: block;
}

.login-box a span:nth-child(1) {
  top: 0;
  left: -100%;
  width: 100%;
  height: 2px;
  background: linear-gradient(90deg, transparent, #03e9f4);
  animation: btn-anim1 1s linear infinite;
}

@keyframes btn-anim1 {
  0% {
    left: -100%;
  }
  50%,100% {
    left: 100%;
  }
}

.login-box a span:nth-child(2) {
  top: -100%;
  right: 0;
  width: 2px;
  height: 100%;
  background: linear-gradient(180deg, transparent, #03e9f4);
  animation: btn-anim2 1s linear infinite;
  animation-delay: .25s
}

@keyframes btn-anim2 {
  0% {
    top: -100%;
  }
  50%,100% {
    top: 100%;
  }
}

.login-box a span:nth-child(3) {
  bottom: 0;
  right: -100%;
  width: 100%;
  height: 2px;
  background: linear-gradient(270deg, transparent, #03e9f4);
  animation: btn-anim3 1s linear infinite;
  animation-delay: .5s
}

@keyframes btn-anim3 {
  0% {
    right: -100%;
  }
  50%,100% {
    right: 100%;
  }
}

.login-box a span:nth-child(4) {
  bottom: -100%;
  left: 0;
  width: 2px;
  height: 100%;
  background: linear-gradient(360deg, transparent, #03e9f4);
  animation: btn-anim4 1s linear infinite;
  animation-delay: .75s
}

@keyframes btn-anim4 {
  0% {
    bottom: -100%;
  }
  50%,100% {
    bottom: 100%;
  }
}

#b{
     padding: 0.2px 5px;
    border:  solid white;
    background-color:black;
    color: white;
    margin: 0.5px;
    font-size: 1.5rem;
    border-radius: 1rem;
    cursor: pointer;
}
.c{
    color: white;
    font-size: 16px
}
        </style>
    </head>


        
        </style>
            
    </head>
    <body>
       <!DOCTYPE html>
<html>
<head>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="w3.css">

 <link rel="stylesheet" href="mystyle.css">

</head>
<body bgcolor="#a4a1ab">
<center>
<!-- Links (sit on top) -->
<div class="w3-top">
  <div class="w3-row w3-padding w3-black">
    <div class="w3-col s3">
      <a href="#home" class="w3-button w3-block w3-black ws2">HOME</a>
    </div>
    <div class="w3-col s3">
      <a href="Adminlogin.jsp" class="w3-button w3-block w3-black ws2">Admin Login</a>
    </div>
    <div class="w3-col s3">
      <a href="Userlogin.jsp" class="w3-button w3-block w3-black ws2">User Login</a>
    </div>
    <div class="w3-col s3">
      <a href="AllColleges.jsp" class="w3-button w3-block w3-black ws2">View College</a>
    </div>
  </div>
</div><br><br><br><br>

<div>
     <h1>Higher Education Access Prediction System</h1><br>
   <div style="position: absolute;overflow: hidden;left:450px;top:41px;width:640px; height:700px; z-index: 0"> 
              
     <div class="login-box">
  <h2>Admin Login</h2>
 
   <form action="Adminhome.jsp">
    <div class="user-box">
        <input type="text" name="name" value="" />
      <label>Username</label>
    </div>
    <div class="user-box">
        <input type="text" name="password" value="" />
      <label>Password</label>
    </div>

       
       <a href="Adminhome.jsp" ><input type="submit" value="Submit" id="b"/></a>
         <a href="Homepage.jsp"><input type="button" value="Go Back" id="b"/></a>
        </form>
     
   

    
</div>
        
               
</div>

</div>   


<!-- Footer -->
 

<footer>
    <div style="position: absolute;overflow: hidden; left: 500px; top:700px;width:500px; height:70px;  z-index: 2" class=" c">
        Made By Sakshi Dongare
    </div>
</footer>


</body>
</html>

    </body>
</html>











