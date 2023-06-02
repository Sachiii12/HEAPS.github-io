<%-- 
    Document   : RegisterCollege
    Created on : 25 Nov, 2022, 9:34:03 AM
    Author     : 03
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="mystyle.css">
    </head>
    <body bgcolor="#d5d5d5">
         
           <%@page import="java.sql.*"%>
    
       
        <%
            
            
            String s = request.getParameter("College");
            String m = request.getParameter("City");
            String f =request.getParameter("Address");
                  
            
              try
            {
                
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heaps","root","");
            Statement st=con.createStatement();
            String sql="insert into college(College_Name,City,Address)values('"+s+"','"+m+"','"+f+"')";
            st.executeUpdate(sql);
            %>
            
           <center> <h1>College Successfully Updated</h1>
            <a href="College.jsp"><input type="submit" value="Go Back" class="btn"/></a>
           </center>
            <%
            con.close();
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
            %>
   
    </body>
</html>
