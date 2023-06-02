<%-- 
    Document   : Homepage
    Created on : 18 Dec, 2022, 9:07:23 AM
    Author     : 03
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inconsolata">
 <link rel="stylesheet" href="mystyle.css">
        <style>
              body, html {
                background : url(Images/img1.jpeg) no-repeat center center/cover;
  height: 100%;
  font-family: "Inconsolata", sans-serif;
}

.bgimg {
  background-position: center;
  background-size: cover;
  background-image: url("/w3images/coffeehouse.jpg");
  min-height: 75%;
}

.menu {
  display: none;
}
.ws1{font-size: 19px;

} 
.ws2{font-size: 22px;}
.c{
    color: white;
    font-size: 16px
}
        </style>
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

<div > <div style="position: absolute;overflow: hidden;left:100px;top:100px;width:700px; height:500px;  z-index: 2">
     <h1>Higher Education Access Prediction System</h1><br>
        
              
        <h3 class="ws2"><b>Description</b></h3><br>
                
                <p class="ws1">This system helps students to perform for the admission test online and provides college list according
            to the marks. System main objective is to offer a quick and easy way to appear the exam and it also
            provides result immediately after the exam.  Multiple choice examination is conducted to provide special
            advantages to the students that can’t be found anywhere else.<br> </p><br><br>
                 <a href="Adminlogin.jsp"><input type="submit" value="Admin Login" class="btn"/></a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <a href="Userlogin.jsp"><input type="submit" value="User Login" class="btn" /></a>
    </div>
                
             <!-- Footer -->
<footer>
    <div style="position: absolute;overflow: hidden; left: 500px; top:700px;width:500px; height:70px;  z-index: 2" class=" c">
        Made By Sakshi Dongare
    </div>
</footer>
               
         
            </center>
</div>


</body>
</html>

    </body>
</html>
