<%-- 
    Document   : Registerstream
    Created on : 18 Dec, 2022, 9:18:44 PM
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
            
            String c =request.getParameter("Main");
            String s = request.getParameter("Stream");
            String m = request.getParameter("Cname");
            String f =request.getParameter("cutoff");
        
            
              try
            {
                
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heaps","root","");
            Statement st=con.createStatement();
            String sql="insert into college_cutoff(Main_Stream,Stream,College,Cutoff)values('"+c+"','"+s+"','"+m+"','"+f+"')";
            st.executeUpdate(sql);
            %>
            
            <center> <h1 class="ws1">Cutoff Successfully Updated</h1>
            <%
            con.close();
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
            %>
            <a href="Cutoff.jsp"><input type="submit" value="Go Back" class="btn"/></a>
            </center>
    </body>
</html>
