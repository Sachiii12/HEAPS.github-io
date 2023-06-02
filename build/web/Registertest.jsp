<html>
    <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inconsolata">
 <link rel="stylesheet" href="mystyle.css">
 <link rel="stylesheet" href="w3.css">
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

    <body bgcolor="#e1e4e6">
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
        
    <center>
        <%@page import="java.sql.*"  %>
        
        <%
             String typ =request.getParameter("typ");
            String q = request.getParameter("question");
            String o1 = request.getParameter("option1");
            String o2 =request.getParameter("option2");
             String o3 =request.getParameter("option3");
               String o4 =request.getParameter("option4");
                 String a =request.getParameter("answer");
            
            try
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heaps","root","");
            Statement st=con.createStatement();
            if(typ.equals("Aptitude"))
            {
            
            
            String sql="insert into aptitude(Question,Option1,Option2,Option3,Option4,Answer)values('"+q+"','"+o1+"','"+o2+"','"+o3+"','"+o4+"','"+a+"')";
            st.executeUpdate(sql);
            
            out.print("Aptitude TestPaper Successfully Uploaded");
            }
            
            else if(typ.equals("English"))
            {
                 String sql="insert into english(Question,Option1,Option2,Option3,Option4,Answer)values('"+q+"','"+o1+"','"+o2+"','"+o3+"','"+o4+"','"+a+"')";
            st.executeUpdate(sql);
            
            out.print("English TestPaper Successfully Uploaded");
            }
            
            else
            {
                String sql="insert into maths(Question,Option1,Option2,Option3,Option4,Answer)values('"+q+"','"+o1+"','"+o2+"','"+o3+"','"+o4+"','"+a+"')";
            st.executeUpdate(sql);
            
            out.print("Maths TestPaper Successfully Uploaded");
            }
            
            con.close();
            }
            catch(Exception e)
            {
                System.out.print(e);
                System.out.print("Not uploaded");
            }
           
            %>
             <div>
                  <a href="Aptitude.jsp">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
        Aptitude Question Paper
    </a>
    <a href="Maths.jsp">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
            Maths Question Paper
    </a>
    <a href="English.jsp">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
        English Question Paper
    </a>
              </div>
          
        
    <div >
        Made By Sakshi Dongare
    </div>
</footer>
</body>
</html>