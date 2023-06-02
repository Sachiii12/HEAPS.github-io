<%-- 
    Document   : Stream
    Created on : 18 Dec, 2022, 2:54:50 PM
    Author     : 03
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="mystyle.css">
         <title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inconsolata">
 <link rel="stylesheet" href="mystyle.css">
        <style>
            body{
  background:#b4b4b4;
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
font-size:2em;
}

.fieldset form{
  border:1px solid #2f2f2f;
  margin:0 auto;
  display:block;
  width:100%;
  height: 100%;
  padding:30px 20px;
  box-sizing:border-box;
  border-radius:0 0 3px 3px;
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
#registration-form input[type=button]:hover {
  background-color: #2980b9;
}

#registration-form input[type=button]:active {
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
}
        </style>
    </head>
    <body>
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
       <div id="registration-form">
  <div class='fieldset'>
    <legend>College Details</legend>
    <form action="Registercollege.jsp" method="post" data-validate="parsley">
      <div class='row'>
        <label for='firstname'>College Name</label>
        <select name="College" class="stream">
                            <option>Brijlal Biyani Science College</option>
                            <option>Panjabrao Deshmush college</option>
                            <option>Vidharbh Mahavidyalay</option>
                            <option>Sardar Patel College Of Engineering </option>
                            <option>Maharashtra Institude of Technology</option>
                            <option> Government College of Engineering </option>
                            <option> Singgad College of Engineering </option>
                            <option>P. R. Pote Patil Group Of Education</option>
                            <option>Sipna College of Engineering and Management</option>
                            <option>Dr Rajendra Gode Institute of Technology And Research</option>
                        </select>

      </div>
      <div class='row'>
        <label for="email">City</label>
        <select name="City" class="stream">
                            <option>Amravati</option>
                            <option>Nagpur</option>
                            <option>Nashik</option>
                            <option>Hyderabad</option>
                            <option>Wardha</option>
                            <option>Akola</option>
                            <option>Washim</option>
                            <option>Mumbai</option>
                            <option>Kolhapur</option>
                            <option>Thane</option>
                        </select>
      </div>
         <div class='row'>
        
      <div class='row'>
        <label for="cemail">Address</label>
        <textarea name="Address" rows="4" cols="20" class="stream">
                        </textarea>
       
      </div>
      <input type="submit" value="Register">
       <a href="Adminhome1.jsp"><input type="button" value="Go Back" id="b"/>
     
    </form>
     
  </div>
       
</div>
           <footer>
    <div style="position: absolute;overflow: hidden; left: 10px; top:630px;width:400px; height:50px;  z-index: 2" class=" c">
        Made By Sakshi Dongare
    </div>
</footer>
    </center>
    </body>
</html>
