package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Adminlogin1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"mystyle.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            h1{\n");
      out.write("                color: white;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            html {\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("  margin:0;\n");
      out.write("  padding:0;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("  background: linear-gradient(#141e30, #243b55);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("   width: 400px;\n");
      out.write("  padding: 40px;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  background: rgba(0,0,0,.5);\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  box-shadow: 0 15px 25px rgba(0,0,0,.6);\n");
      out.write("  border-radius: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box h2 {\n");
      out.write("  margin: 0 0 30px;\n");
      out.write("  padding: 0;\n");
      out.write("  color: #fff;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box .user-box {\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box .user-box input {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 10px 0;\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: #fff;\n");
      out.write("  margin-bottom: 30px;\n");
      out.write("  border: none;\n");
      out.write("  border-bottom: 1px solid #fff;\n");
      out.write("  outline: none;\n");
      out.write("  background: transparent;\n");
      out.write("}\n");
      out.write(".login-box .user-box label {\n");
      out.write("  position: absolute;\n");
      out.write("  top:0;\n");
      out.write("  left: 0;\n");
      out.write("  padding: 10px 0;\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: #fff;\n");
      out.write("  pointer-events: none;\n");
      out.write("  transition: .5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box .user-box input:focus ~ label,\n");
      out.write(".login-box .user-box input:valid ~ label {\n");
      out.write("  top: -20px;\n");
      out.write("  left: 0;\n");
      out.write("  color: #03e9f4;\n");
      out.write("  font-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box form a {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 10px 20px;\n");
      out.write("  color: #03e9f4;\n");
      out.write("  font-size: 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  overflow: hidden;\n");
      out.write("  transition: .5s;\n");
      out.write("  margin-top: 40px;\n");
      out.write("  letter-spacing: 4px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box a:hover {\n");
      out.write("  background: #03e9f4;\n");
      out.write("  color: #fff;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  box-shadow: 0 0 5px #03e9f4,\n");
      out.write("              0 0 25px #03e9f4,\n");
      out.write("              0 0 50px #03e9f4,\n");
      out.write("              0 0 100px #03e9f4;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box a span {\n");
      out.write("  position: absolute;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box a span:nth-child(1) {\n");
      out.write("  top: 0;\n");
      out.write("  left: -100%;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 2px;\n");
      out.write("  background: linear-gradient(90deg, transparent, #03e9f4);\n");
      out.write("  animation: btn-anim1 1s linear infinite;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes btn-anim1 {\n");
      out.write("  0% {\n");
      out.write("    left: -100%;\n");
      out.write("  }\n");
      out.write("  50%,100% {\n");
      out.write("    left: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box a span:nth-child(2) {\n");
      out.write("  top: -100%;\n");
      out.write("  right: 0;\n");
      out.write("  width: 2px;\n");
      out.write("  height: 100%;\n");
      out.write("  background: linear-gradient(180deg, transparent, #03e9f4);\n");
      out.write("  animation: btn-anim2 1s linear infinite;\n");
      out.write("  animation-delay: .25s\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes btn-anim2 {\n");
      out.write("  0% {\n");
      out.write("    top: -100%;\n");
      out.write("  }\n");
      out.write("  50%,100% {\n");
      out.write("    top: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box a span:nth-child(3) {\n");
      out.write("  bottom: 0;\n");
      out.write("  right: -100%;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 2px;\n");
      out.write("  background: linear-gradient(270deg, transparent, #03e9f4);\n");
      out.write("  animation: btn-anim3 1s linear infinite;\n");
      out.write("  animation-delay: .5s\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes btn-anim3 {\n");
      out.write("  0% {\n");
      out.write("    right: -100%;\n");
      out.write("  }\n");
      out.write("  50%,100% {\n");
      out.write("    right: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box a span:nth-child(4) {\n");
      out.write("  bottom: -100%;\n");
      out.write("  left: 0;\n");
      out.write("  width: 2px;\n");
      out.write("  height: 100%;\n");
      out.write("  background: linear-gradient(360deg, transparent, #03e9f4);\n");
      out.write("  animation: btn-anim4 1s linear infinite;\n");
      out.write("  animation-delay: .75s\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes btn-anim4 {\n");
      out.write("  0% {\n");
      out.write("    bottom: -100%;\n");
      out.write("  }\n");
      out.write("  50%,100% {\n");
      out.write("    bottom: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("#b{\n");
      out.write("     padding: 0.2px 5px;\n");
      out.write("    border:  solid white;\n");
      out.write("    background-color:black;\n");
      out.write("    color: white;\n");
      out.write("    margin: 0.5px;\n");
      out.write("    font-size: 1.5rem;\n");
      out.write("    border-radius: 1rem;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("            \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>W3.CSS Template</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Inconsolata\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"mystyle.css\">\n");
      out.write("\n");
      out.write("</head>\n");
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
      out.write("<div>\n");
      out.write("     <h1>Higher Education Access Prediction System</h1><br>\n");
      out.write("   <div style=\"position: absolute;overflow: hidden;left:450px;top:41px;width:640px; height:700px; z-index: 0\"> \n");
      out.write("              \n");
      out.write("     <div class=\"login-box\">\n");
      out.write("  <h2>Admin Login</h2>\n");
      out.write(" \n");
      out.write("   <form action=\"Adminhome.jsp\">\n");
      out.write("    <div class=\"user-box\">\n");
      out.write("        <input type=\"text\" name=\"name\" value=\"\" />\n");
      out.write("      <label>Username</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"user-box\">\n");
      out.write("        <input type=\"text\" name=\"password\" value=\"\" />\n");
      out.write("      <label>Password</label>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("       <a href=\"Adminhome.jsp\" ><input type=\"submit\" value=\"Submit\" id=\"b\"/></a>\n");
      out.write("         <a href=\"Homepage.jsp\"><input type=\"button\" value=\"Go Back\" id=\"b\"/></a>\n");
      out.write("        </form>\n");
      out.write("     \n");
      out.write("   \n");
      out.write("\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("               \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>   \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("   <div style=\"position: absolute;overflow: hidden;left:00px;top:700px;width:100%; height:20px; z-index: 0\"> \n");
      out.write("\n");
      out.write("<footer class=\"w3-center w3-grey w3-padding\">\n");
      out.write("  <p>Made by Sakshi Dongare</a></p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
