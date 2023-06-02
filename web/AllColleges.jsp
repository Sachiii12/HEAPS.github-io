<%-- 
    Document   : AllColleges
    Created on : 25 Nov, 2022, 9:55:23 AM
    Author     : 03
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inconsolata">
 <link rel="stylesheet" href="mystyle.css">
         <style>
                 body, html {
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
.ws1{font-size: 19px;} 
.ws2{font-size: 22px;}
table, th, td {
  border: 1px solid navy;
}

table {
  width: 100%;
}
.twidth{
    width: 50%;
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

<div>
    
        <h1>Higher Education Access Prediction System</h1><br>
        <h2>All College List</h2><br>
         <%@page import="java.sql.*" %>
        <%
            try
            {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heaps","root","");
              Statement st=con.createStatement();
              String sql="select * from college";
              ResultSet rs=st.executeQuery(sql);
              
            
            %>
            <div class="twidth">
            <table border="1">
               
                    <thead>
                        <tr>
                            <th class="ws1">College Name</th>
                            <th class="ws1">City</th>
                            <th class="ws1">Address</th>
                           
                        </tr>
                    </thead>
                   
                <tbody>
                   
                    <%
                        while(rs.next())
                        {
                            %>
                            <tr>
                                <td class="ws1"><%=rs.getString("College_Name")%></td>
                                <td class="ws1"><%=rs.getString("City")%></td>
                                <td class="ws1"><%=rs.getString("Address")%></td>
                              
                            </tr>
                       <% }
                          con.close();
                        }
                           catch(Exception e)
                       {
                           System.out.print(e);
                        
                        }
                     %>
            
                        
                </tbody>
            </table>
            </div>
                      <a href="Adminhome1.jsp"><input type="submit" value="Go Back" class="btn"/></a>
    </body>
</html>
