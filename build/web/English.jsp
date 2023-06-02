<%-- 
    Document   : Maths
    Created on : 21 Dec, 2022, 4:26:03 PM
    Author     : 03
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="mystyle.css">
 <link rel="stylesheet" href="w3.css">
   <style>
            body{
  background:#b4b4b4;

            background-color: grey;
            font-family: Verdana;
            text-align: left;
    
           
}

#registration-form {
  font-family:'Open Sans Condensed', sans-serif;
  width: 400px;
  min-width:250px;
  margin: 20px auto;
  position: relative;
}

#registration-form .fieldset {
  background-color:#d5d5d5;

  border-radius: 3px;
  
}

 #registration-form legend {
  text-align: center;
  background: #364351;
  width: 100%;
  padding: 30px 0;
  border-radius: 3px 3px 0 0;
  color: white;
font-size:1.5em;
}

.fieldset form{
  border:1px solid #2f2f2f;
  margin:0 auto;
  display:block;
  width:100%;
  height: 50%;
  padding:30px 20px;
  box-sizing:border-box;
  border-radius:0 0 3px 3px;
  text-align: left;
  font-size: 18px;
}
.placeholder #registration-form label {
  display: none;
}
 .no-placeholder #registration-form label{
margin-left:5px;
  position:relative;
  display:block;
  color:grey;
  text-shadow:0 1px white;
  font-weight:bold;
}
/* all */
::-webkit-input-placeholder { text-shadow:1px 1px 1px white; font-weight:bold; }
::-moz-placeholder { text-shadow:0 1px 1px white; font-weight:bold; } /* firefox 19+ */
:-ms-input-placeholder { text-shadow:0 1px 1px white; font-weight:bold; } /* ie */
#registration-form input[type=text] {
  padding: 15px 20px;
  border-radius: 1px;
  margin:5px auto;
  background-color:#f7f7f7;
  border: 1px solid silver;

  -webkit-box-shadow: inset 0 1px 5px rgba(0,0,0,0.2);
  box-shadow: inset 0 1px 5px rgba(0,0,0,0.2), 0 1px rgba(255,255,255,.8);
  width: 100%;

  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  -ms-box-sizing: border-box;
  box-sizing: border-box;
  -webkit-transition:background-color .5s ease;
-moz-transition:background-color .5s ease;
-o-transition:background-color .5s ease;
-ms-transition:background-color .5s ease;
transition:background-color .5s ease;
}
.no-placeholder #registration-form input[type=text] {
  padding: 10px 15px;
}

#registration-form input[type=text]:active, .placeholder #registration-form input[type=text]:focus {
  outline: none;
  border-color: silver;
  background-color:white;
}

#registration-form input[type=submit] {
  font-family:'Open Sans Condensed', sans-serif;
  text-transform:uppercase;
  outline:none;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  -ms-box-sizing: border-box;
  box-sizing: border-box;
  width: 100%;
  background-color: #5C8CA7;
  padding: 10px;
  color: white;
  border: 1px solid #3498db;
  border-radius: 3px;
  font-size: 1.5em;
  font-weight: bold;
  margin-top: 5px;
  cursor: pointer;
  position:relative;
  top:0;
}

#registration-form input[type=submit]:hover {
  background-color: #2980b9;
}

#registration-form input[type=submit]:active {
background:#5C8CA7;
}


.parsley-error-list{
background-color:#C34343;
padding: 5px 11px;
margin: 0;
list-style: none;
border-radius: 0 0 3px 3px;
margin-top:-5px;
  margin-bottom:5px;
  color:white;
  border:1px solid #870d0d;
  border-top:none;
    -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  position:relative;
  top:-1px;
  text-shadow:0px 1px 1px #460909;
    font-weight:700;
  font-size:12px;
}
.parsley-error{
  border-color:#870d0d!important;
  border-bottom:none;
}
#registration-form select{
  width:100%;
  padding:5px;
}
::-moz-focus-inner {
  border: 0;
  .ws1{font-size: 19px;} 
.ws2{font-size: 22px;}
}
#b{
    padding: 5px 11px;
     font-size: 12px;
}

#registration-form input[type=button] {
  font-family:'Open Sans Condensed', sans-serif;
  text-transform:uppercase;
  outline:none;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  -ms-box-sizing: border-box;
  box-sizing: border-box;
  width: 100%;
  background-color: #5C8CA7;
  padding: 10px;
  color: white;
  border: 1px solid #3498db;
  border-radius: 2px;
  font-size: 1.0em;
  font-weight: bold;
  margin-top: 3px;
  cursor: pointer;
  position:relative;
  top:0;
}
#registration-form input[type=button]:hover {
  background-color: #2980b9;
}

#registration-form input[type=button]:active {
background:#5C8CA7;
}
#registration-form label{
     text-align: center;
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
        <%@page import="java.sql.*"%>
            <center>

   <%
            try
                
            {
            
             Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heaps","root","");
                Statement st=con.createStatement();     
              String sql="select * from english";
             ResultSet rs=st.executeQuery(sql);
             %>
          
            
             
           <div id="registration-form">
  <div class='fieldset'>
      <legend>ENGLISH QUESTION PAPER</legend>
      <table border="0">
                 <%
                   
                while(rs.next())
                {
                   %>
    
    <form action="Adminhome1.jsp" method="post" class="parsley">
      <div class='row'>
        <label for='firstname'> Q.     <%=rs.getString("Question")%><br></label>
<input type="radio" name="question1" value="<%=rs.getString("Option1")%>
                       " /><%=rs.getString("Option1")%><br>
                            <input type="radio" name="question1" value="<%=rs.getString("Option2")%>
                       " /><%=rs.getString("Option2")%><br>
                             <input type="radio" name="question3" value="<%=rs.getString("Option3")%>
                       " /><%=rs.getString("Option1")%><br>
                              <input type="radio" name="question4" value="<%=rs.getString("Option4")%>
                       " /><%=rs.getString("Option1")%><br>   </div><br>
      
           
            
                       
                   
               
<%
    }

con.close();

            }
                catch(Exception e)
{
e.printStackTrace();
}
%>
           </table>
           <br>
           <br>
           <br>
           <b style="font-size: 30px;"><u>
           <a href="Adminhome1.jsp"><input type="button" value="Go Back" id="b"/></a></u></b>
</form>  

          
          
           </center> <br><br> 
 <footer>
    <div >
        Made By Sakshi Dongare
    </div>
</footer>
    </body>
</html>
