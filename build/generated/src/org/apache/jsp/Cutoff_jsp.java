package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Cutoff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"mystyle.css\">\n");
      out.write("         <title>W3.CSS Template</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Inconsolata\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"mystyle.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("  background:#b4b4b4;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#registration-form {\n");
      out.write("  font-family:'Open Sans Condensed', sans-serif;\n");
      out.write("  width: 400px;\n");
      out.write("  min-width:250px;\n");
      out.write("  margin: 20px auto;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#registration-form .fieldset {\n");
      out.write("  background-color:#d5d5d5;\n");
      out.write("\n");
      out.write("  border-radius: 3px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write(" #registration-form legend {\n");
      out.write("  text-align: center;\n");
      out.write("  background: #364351;\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 30px 0;\n");
      out.write("  border-radius: 3px 3px 0 0;\n");
      out.write("  color: white;\n");
      out.write("font-size:2em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fieldset form{\n");
      out.write("  border:1px solid #2f2f2f;\n");
      out.write("  margin:0 auto;\n");
      out.write("  display:block;\n");
      out.write("  width:100%;\n");
      out.write("  height: 100%;\n");
      out.write("  padding:30px 20px;\n");
      out.write("  box-sizing:border-box;\n");
      out.write("  border-radius:0 0 3px 3px;\n");
      out.write("}\n");
      out.write(".placeholder #registration-form label {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write(" .no-placeholder #registration-form label{\n");
      out.write("margin-left:5px;\n");
      out.write("  position:relative;\n");
      out.write("  display:block;\n");
      out.write("  color:grey;\n");
      out.write("  text-shadow:0 1px white;\n");
      out.write("  font-weight:bold;\n");
      out.write("}\n");
      out.write("/* all */\n");
      out.write("::-webkit-input-placeholder { text-shadow:1px 1px 1px white; font-weight:bold; }\n");
      out.write("::-moz-placeholder { text-shadow:0 1px 1px white; font-weight:bold; } /* firefox 19+ */\n");
      out.write(":-ms-input-placeholder { text-shadow:0 1px 1px white; font-weight:bold; } /* ie */\n");
      out.write("#registration-form input[type=text] {\n");
      out.write("  padding: 15px 20px;\n");
      out.write("  border-radius: 1px;\n");
      out.write("  margin:5px auto;\n");
      out.write("  background-color:#f7f7f7;\n");
      out.write("  border: 1px solid silver;\n");
      out.write("\n");
      out.write("  -webkit-box-shadow: inset 0 1px 5px rgba(0,0,0,0.2);\n");
      out.write("  box-shadow: inset 0 1px 5px rgba(0,0,0,0.2), 0 1px rgba(255,255,255,.8);\n");
      out.write("  width: 100%;\n");
      out.write("\n");
      out.write("  -webkit-box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("  -ms-box-sizing: border-box;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  -webkit-transition:background-color .5s ease;\n");
      out.write("-moz-transition:background-color .5s ease;\n");
      out.write("-o-transition:background-color .5s ease;\n");
      out.write("-ms-transition:background-color .5s ease;\n");
      out.write("transition:background-color .5s ease;\n");
      out.write("}\n");
      out.write(".no-placeholder #registration-form input[type=text] {\n");
      out.write("  padding: 10px 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#registration-form input[type=text]:active, .placeholder #registration-form input[type=text]:focus {\n");
      out.write("  outline: none;\n");
      out.write("  border-color: silver;\n");
      out.write("  background-color:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#registration-form input[type=submit] {\n");
      out.write("  font-family:'Open Sans Condensed', sans-serif;\n");
      out.write("  text-transform:uppercase;\n");
      out.write("  outline:none;\n");
      out.write("  -webkit-box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("  -ms-box-sizing: border-box;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  width: 100%;\n");
      out.write("  background-color: #5C8CA7;\n");
      out.write("  padding: 10px;\n");
      out.write("  color: white;\n");
      out.write("  border: 1px solid #3498db;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  font-size: 1.5em;\n");
      out.write("  font-weight: bold;\n");
      out.write("  margin-top: 5px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  position:relative;\n");
      out.write("  top:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#registration-form input[type=submit]:hover {\n");
      out.write("  background-color: #2980b9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#registration-form input[type=submit]:active {\n");
      out.write("background:#5C8CA7;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".parsley-error-list{\n");
      out.write("background-color:#C34343;\n");
      out.write("padding: 5px 11px;\n");
      out.write("margin: 0;\n");
      out.write("list-style: none;\n");
      out.write("border-radius: 0 0 3px 3px;\n");
      out.write("margin-top:-5px;\n");
      out.write("  margin-bottom:5px;\n");
      out.write("  color:white;\n");
      out.write("  border:1px solid #870d0d;\n");
      out.write("  border-top:none;\n");
      out.write("    -webkit-box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  position:relative;\n");
      out.write("  top:-1px;\n");
      out.write("  text-shadow:0px 1px 1px #460909;\n");
      out.write("    font-weight:700;\n");
      out.write("  font-size:12px;\n");
      out.write("}\n");
      out.write(".parsley-error{\n");
      out.write("  border-color:#870d0d!important;\n");
      out.write("  border-bottom:none;\n");
      out.write("}\n");
      out.write("#registration-form select{\n");
      out.write("  width:100%;\n");
      out.write("  padding:5px;\n");
      out.write("}\n");
      out.write("::-moz-focus-inner {\n");
      out.write("  border: 0;\n");
      out.write("  .ws1{font-size: 19px;} \n");
      out.write(".ws2{font-size: 22px;}\n");
      out.write("}\n");
      out.write("#b{\n");
      out.write("    padding: 5px 11px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#registration-form input[type=button] {\n");
      out.write("  font-family:'Open Sans Condensed', sans-serif;\n");
      out.write("  text-transform:uppercase;\n");
      out.write("  outline:none;\n");
      out.write("  -webkit-box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("  -ms-box-sizing: border-box;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  width: 100%;\n");
      out.write("  background-color: #5C8CA7;\n");
      out.write("  padding: 10px;\n");
      out.write("  color: white;\n");
      out.write("  border: 1px solid #3498db;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  font-size: 1.5em;\n");
      out.write("  font-weight: bold;\n");
      out.write("  margin-top: 5px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  position:relative;\n");
      out.write("  top:0;\n");
      out.write("}\n");
      out.write("#registration-form input[type=button]:hover {\n");
      out.write("  background-color: #2980b9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#registration-form input[type=button]:active {\n");
      out.write("background:#5C8CA7;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          \n");
      out.write("       ");

            try
                
            {
            
             Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heaps","root","");
                Statement st=con.createStatement();
                String sql="select * from stream";
                       
                ResultSet rs=st.executeQuery(sql);
                
      out.write("\n");
      out.write("                  \n");
      out.write("    <center>\n");
      out.write("        <!-- Links (sit on top) -->\n");
      out.write("<div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-row w3-padding w3-black\">\n");
      out.write("    <div class=\"w3-col s3\">\n");
      out.write("      <a href=\"#home\" class=\"w3-button w3-block w3-black ws2\">HOME</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col s3\">\n");
      out.write("      <a href=\"Adminlogin.jsp\" class=\"w3-button w3-block w3-black ws2\">Admin Login</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col s3\">\n");
      out.write("      <a href=\"Userlogin.jsp\" class=\"w3-button w3-block w3-black ws2\">User Login</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col s3\">\n");
      out.write("      <a href=\"AllColleges.jsp\" class=\"w3-button w3-block w3-black ws2\">View College</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div><br><br><br><br>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("     <h1>Higher Education Access Prediction System</h1><br>\n");
      out.write("       <div id=\"registration-form\">\n");
      out.write("  <div class='fieldset'>\n");
      out.write("    <legend>College CutOff Details</legend>\n");
      out.write("    <form action=\"Addcutoff.jsp\" method=\"post\" data-validate=\"parsley\">\n");
      out.write("    <div class='row'>\n");
      out.write("        <label for='firstname' name=\"Main\">Select Main Stream :</label>\n");
      out.write("<select  name=\"Main\" class=\"stream\">\n");
      out.write("           ");

                   
                while(rs.next())
                {
                   
      out.write("\n");
      out.write("                   <option>");
      out.print(rs.getString("Main_Stream"));
      out.write("</option>\n");
      out.write("                  \n");
      out.write("                    ");
 }

      out.write("\n");
      out.write("      </select>      </div>\n");
      out.write("      <div class='row'>\n");
      out.write("         <label for='firstname' name=\"Stream\">Select Stream :</label>\n");
      out.write("<select id=\"country\" name=\"Stream\" class=\"stream\">\n");
      out.write("         ");

              String sql2="select * from stream";
                       
                ResultSet rs2=st.executeQuery(sql);
                   
                while(rs2.next())
                {
                   
      out.write("\n");
      out.write("                   <option>");
      out.print(rs2.getString("Stream_Name"));
      out.write("</option>\n");
      out.write("                  \n");
      out.write("                    ");
 }

      out.write("\n");
      out.write("      </select>      </div>\n");
      out.write("   <div class='row'>\n");
      out.write("        <label for=\"email\" name=\"Cname\">College Name</label>\n");
      out.write("<select id=\"country\" name=\"Cname\" class=\"stream\">\n");
      out.write("         ");

              String sql3="select * from stream";
                       
                ResultSet rs3=st.executeQuery(sql);
                   
                while(rs3.next())
                {
                   
      out.write("\n");
      out.write("                   <option>");
      out.print(rs3.getString("College"));
      out.write("</option>\n");
      out.write("                  \n");
      out.write("                    ");
 }

      out.write("\n");
      out.write("      </select>      </div>\n");
      out.write("          \n");
      out.write("      <div class='row'>\n");
      out.write("        <label for=\"cemail\">College Cutoff :</label>\n");
      out.write("       \n");
      out.write("<input type=\"text\" name=\"cutoff\" value=\"\" />      </div>\n");
      out.write("      <input type=\"submit\" value=\"Register\">\n");
      out.write("     <a href=\"Adminhome1.jsp\"><input type=\"button\" value=\"Go Back\" id=\"b\"/>\n");
      out.write("    </form>\n");
      out.write("     ");

                       
con.close();

            }
                catch(Exception e)
{
e.printStackTrace();
}

      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  <footer>\n");
      out.write("    <div style=\"position: absolute;overflow: hidden; left: 500px; top:820px;width:500px; height:70px;  z-index: 2\" class=\" c\">\n");
      out.write("        Made By Sakshi Dongare\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
