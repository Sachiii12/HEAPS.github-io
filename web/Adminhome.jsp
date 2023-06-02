<%-- 
    Document   : Adminhome
    Created on : 18 Dec, 2022, 11:06:44 AM
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
@import url('https://fonts.googleapis.com/css2?family=Raleway:wght@400;700&display=swap');
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
body{
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    background: #050801;
    font-family: 'Raleway', sans-serif;
    font-weight: bold;
}
a{
    position: relative;
    display: inline-block;
    padding: 25px 30px;
    margin:30px 0;
    color: #03e9f4;
    text-decoration: none;
    text-transform: uppercase;
    transition: 0.5s;
    letter-spacing: 4px;
    overflow: hidden;
    margin-right: 50px;
   
}
a:hover{
    background: #03e9f4;
    color: #050801;
    box-shadow: 0 0 5px #03e9f4,
                0 0 25px #03e9f4,
                0 0 50px #03e9f4,
                0 0 200px #03e9f4;
     -webkit-box-reflect:below 1px linear-gradient(transparent, #0005);
}
a:nth-child(1){
    filter: hue-rotate(270deg);
}
a:nth-child(2){
    filter: hue-rotate(110deg);
}
a span{
    position: absolute;
    display: block;
}
a span:nth-child(1){
    top: 0;
    left: 0;
    width: 100%;
    height: 2px;
    background: linear-gradient(90deg,transparent,#03e9f4);
    animation: animate1 1s linear infinite;
}
@keyframes animate1{
    0%{
        left: -100%;
    }
    50%,100%{
        left: 100%;
    }
}
a span:nth-child(2){
    top: -100%;
    right: 0;
    width: 2px;
    height: 100%;
    background: linear-gradient(180deg,transparent,#03e9f4);
    animation: animate2 1s linear infinite;
    animation-delay: 0.25s;
}
@keyframes animate2{
    0%{
        top: -100%;
    }
    50%,100%{
        top: 100%;
    }
}
a span:nth-child(3){
    bottom: 0;
    right: 0;
    width: 100%;
    height: 2px;
    background: linear-gradient(270deg,transparent,#03e9f4);
    animation: animate3 1s linear infinite;
    animation-delay: 0.50s;
}
@keyframes animate3{
    0%{
        right: -100%;
    }
    50%,100%{
        right: 100%;
    }
}


a span:nth-child(4){
    bottom: -100%;
    left: 0;
    width: 2px;
    height: 100%;
    background: linear-gradient(360deg,transparent,#03e9f4);
    animation: animate4 1s linear infinite;
    animation-delay: 0.75s;
}
@keyframes animate4{
    0%{
        bottom: -100%;
    }
    50%,100%{
        bottom: 100%;
    }
}
*{
    margin: 0;
    padding: 0;
}
#navbar{
    display: flex;
    position: absolute;
   top: 0%;  
}
/*
#navbar{
    position: absolute;
}
*/
#navbar ul{
    display: flex;
    top: 0%;
    align-items: center;
    padding: 3px 15px;
}
#navbar::before{
content: "";
background-color: #00004d;
position: absolute;
height: 100%;
width: 122.5%;
z-index: -1;
opacity: 0.4;
}
#navbar ul li{
    list-style: none;
    font-size: 1.2rem;
}
#navbar ul li a{
    color:white;
    display: block;
    padding: 3px 22px;
    border-radius: 20px;
    text-decoration: none;
}
#navbar ul li a:hover{
    color: black;
   background-color:white;
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
      <!-- Links (sit on top) -->

      
 <div>
         <nav id="navbar">
        
        <ul>
            <li class="item"><a href="Homepage.jsp" target="_blank"> Home</a></li>
            <li class="item"><a href="Adminlogin.jsp">Admin Login</a></li>
            <li class="item"><a href="Userlogin.jsp">User Login</a></li>
           <li class="item"><a href="AllColleges.jsp"> View College</a></li>
            <li class="item"><a href="AllCutoff.jsp"> View Cutoff</a></li>

          
        </ul>
    </nav>
        </div><br><br><br>
  <%
          String name=request.getParameter("name");
          String pass=request.getParameter("password");
          
          if(name.equals("JKAdmin")&& pass.equals("jk123"))
          {
              %>
   
  
      
              <h1>Higher Education Access Prediction System</h1><br>
              <h1>Admin Home</h1><br><br>
              
              <div>
                  <a href="Stream.jsp">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
        Stream Details
    </a>
    <a href="College.jsp">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
        College Details
    </a>
    <a href="AllColleges.jsp">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
        View College
    </a>
              </div>
                       <div>
                  <a href="Cutoff.jsp">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
        College Cutoff
    </a>
    <a href="Test.jsp">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
       Question Paper Generator
    </a>
    <a href="Registertest.jsp">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
       Question Papers
    </a>
    <a href="Adminlogin.jsp">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
        Go Back
    </a>
              </div>
             
                <%
          }
          else
          {
              out.print("<h1>"+"Invalid User"+"</h1>");
          }
        %>
        <!-- Footer -->
 

<footer>
    <div style="position: absolute;overflow: hidden; left: 700px; top:700px;width:500px; height:70px;  z-index: 2" class=" c">
        Made By Sakshi Dongare
    </div>
</footer>
    </body>
    
</html>
