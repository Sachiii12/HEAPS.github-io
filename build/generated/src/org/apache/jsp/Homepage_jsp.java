package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>W3.CSS Template</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Inconsolata\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"mystyle.css\">\n");
      out.write("        <style>\n");
      out.write("              body, html {\n");
      out.write("                background : url(Images/img1.jpeg) no-repeat center center/cover;\n");
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
      out.write(".ws1{font-size: 19px;\n");
      out.write("\n");
      out.write("} \n");
      out.write(".ws2{font-size: 22px;}\n");
      out.write(".c{\n");
      out.write("    color: white;\n");
      out.write("    font-size: 16px\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body bgcolor=\"#a4a1ab\">\n");
      out.write("<center>\n");
      out.write("<!-- Links (sit on top) -->\n");
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
      out.write("<div > <div style=\"position: absolute;overflow: hidden;left:100px;top:100px;width:700px; height:500px;  z-index: 2\">\n");
      out.write("     <h1>Higher Education Access Prediction System</h1><br>\n");
      out.write("        \n");
      out.write("              \n");
      out.write("        <h3 class=\"ws2\"><b>Description</b></h3><br>\n");
      out.write("                \n");
      out.write("                <p class=\"ws1\">This system helps students to perform for the admission test online and provides college list according\n");
      out.write("            to the marks. System main objective is to offer a quick and easy way to appear the exam and it also\n");
      out.write("            provides result immediately after the exam.  Multiple choice examination is conducted to provide special\n");
      out.write("            advantages to the students that can’t be found anywhere else.<br> </p><br><br>\n");
      out.write("                 <a href=\"Adminlogin.jsp\"><input type=\"submit\" value=\"Admin Login\" class=\"btn\"/></a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <a href=\"Userlogin.jsp\"><input type=\"submit\" value=\"User Login\" class=\"btn\" /></a>\n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("             <!-- Footer -->\n");
      out.write("<footer>\n");
      out.write("    <div style=\"position: absolute;overflow: hidden; left: 500px; top:700px;width:500px; height:70px;  z-index: 2\" class=\" c\">\n");
      out.write("        Made By Sakshi Dongare\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("               \n");
      out.write("         \n");
      out.write("            </center>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
