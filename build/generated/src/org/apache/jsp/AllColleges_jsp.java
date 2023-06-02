package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AllColleges_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" href=\"w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Inconsolata\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"mystyle.css\">\n");
      out.write("         <style>\n");
      out.write("                 body, html {\n");
      out.write("  height: 100%;\n");
      out.write("  font-family: \"Inconsolata\", sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bgimg {\n");
      out.write("  background-position: center;\n");
      out.write("  background-size: cover;\n");
      out.write("  background-image: url(\"/w3images/coffeehouse.jpg\");\n");
      out.write("  min-height: 75%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write(".ws1{font-size: 19px;} \n");
      out.write(".ws2{font-size: 22px;}\n");
      out.write("table, th, td {\n");
      out.write("  border: 1px solid navy;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write(".twidth{\n");
      out.write("    width: 50%;\n");
      out.write("}\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#e1e4e6\">\n");
      out.write("        <center>\n");
      out.write("       <!-- Links (sit on top) -->\n");
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
      out.write("    \n");
      out.write("        <h1>Higher Education Access Prediction System</h1><br>\n");
      out.write("        <h2>All College List</h2><br>\n");
      out.write("         \n");
      out.write("        ");

            try
            {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heaps","root","");
              Statement st=con.createStatement();
              String sql="select * from college";
              ResultSet rs=st.executeQuery(sql);
              
            
            
      out.write("\n");
      out.write("            <div class=\"twidth\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("               \n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"ws1\">College Name</th>\n");
      out.write("                            <th class=\"ws1\">City</th>\n");
      out.write("                            <th class=\"ws1\">Address</th>\n");
      out.write("                           \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                   \n");
      out.write("                <tbody>\n");
      out.write("                   \n");
      out.write("                    ");

                        while(rs.next())
                        {
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"ws1\">");
      out.print(rs.getString("College_Name"));
      out.write("</td>\n");
      out.write("                                <td class=\"ws1\">");
      out.print(rs.getString("City"));
      out.write("</td>\n");
      out.write("                                <td class=\"ws1\">");
      out.print(rs.getString("Address"));
      out.write("</td>\n");
      out.write("                              \n");
      out.write("                            </tr>\n");
      out.write("                       ");
 }
                          con.close();
                        }
                           catch(Exception e)
                       {
                           System.out.print(e);
                        
                        }
                     
      out.write("\n");
      out.write("            \n");
      out.write("                        \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("                      <a href=\"Adminhome1.jsp\"><input type=\"submit\" value=\"Go Back\" class=\"btn\"/></a>\n");
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
