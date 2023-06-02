package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"mystyle.css\">\n");
      out.write("        <style>\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Raleway:wght@400;700&display=swap');\n");
      out.write("*{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    height: 100vh;\n");
      out.write("    background: #050801;\n");
      out.write("    font-family: 'Raleway', sans-serif;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: 25px 30px;\n");
      out.write("    margin:30px 0;\n");
      out.write("    color: #03e9f4;\n");
      out.write("    text-decoration: none;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    transition: 0.5s;\n");
      out.write("    letter-spacing: 4px;\n");
      out.write("    overflow: hidden;\n");
      out.write("    margin-right: 50px;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("a:hover{\n");
      out.write("    background: #03e9f4;\n");
      out.write("    color: #050801;\n");
      out.write("    box-shadow: 0 0 5px #03e9f4,\n");
      out.write("                0 0 25px #03e9f4,\n");
      out.write("                0 0 50px #03e9f4,\n");
      out.write("                0 0 200px #03e9f4;\n");
      out.write("     -webkit-box-reflect:below 1px linear-gradient(transparent, #0005);\n");
      out.write("}\n");
      out.write("a:nth-child(1){\n");
      out.write("    filter: hue-rotate(270deg);\n");
      out.write("}\n");
      out.write("a:nth-child(2){\n");
      out.write("    filter: hue-rotate(110deg);\n");
      out.write("}\n");
      out.write("a span{\n");
      out.write("    position: absolute;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("a span:nth-child(1){\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 2px;\n");
      out.write("    background: linear-gradient(90deg,transparent,#03e9f4);\n");
      out.write("    animation: animate1 1s linear infinite;\n");
      out.write("}\n");
      out.write("@keyframes animate1{\n");
      out.write("    0%{\n");
      out.write("        left: -100%;\n");
      out.write("    }\n");
      out.write("    50%,100%{\n");
      out.write("        left: 100%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("a span:nth-child(2){\n");
      out.write("    top: -100%;\n");
      out.write("    right: 0;\n");
      out.write("    width: 2px;\n");
      out.write("    height: 100%;\n");
      out.write("    background: linear-gradient(180deg,transparent,#03e9f4);\n");
      out.write("    animation: animate2 1s linear infinite;\n");
      out.write("    animation-delay: 0.25s;\n");
      out.write("}\n");
      out.write("@keyframes animate2{\n");
      out.write("    0%{\n");
      out.write("        top: -100%;\n");
      out.write("    }\n");
      out.write("    50%,100%{\n");
      out.write("        top: 100%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("a span:nth-child(3){\n");
      out.write("    bottom: 0;\n");
      out.write("    right: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 2px;\n");
      out.write("    background: linear-gradient(270deg,transparent,#03e9f4);\n");
      out.write("    animation: animate3 1s linear infinite;\n");
      out.write("    animation-delay: 0.50s;\n");
      out.write("}\n");
      out.write("@keyframes animate3{\n");
      out.write("    0%{\n");
      out.write("        right: -100%;\n");
      out.write("    }\n");
      out.write("    50%,100%{\n");
      out.write("        right: 100%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("a span:nth-child(4){\n");
      out.write("    bottom: -100%;\n");
      out.write("    left: 0;\n");
      out.write("    width: 2px;\n");
      out.write("    height: 100%;\n");
      out.write("    background: linear-gradient(360deg,transparent,#03e9f4);\n");
      out.write("    animation: animate4 1s linear infinite;\n");
      out.write("    animation-delay: 0.75s;\n");
      out.write("}\n");
      out.write("@keyframes animate4{\n");
      out.write("    0%{\n");
      out.write("        bottom: -100%;\n");
      out.write("    }\n");
      out.write("    50%,100%{\n");
      out.write("        bottom: 100%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("*{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("#navbar{\n");
      out.write("    display: flex;\n");
      out.write("    position: absolute;\n");
      out.write("   top: 0%;  \n");
      out.write("}\n");
      out.write("/*\n");
      out.write("#navbar{\n");
      out.write("    position: absolute;\n");
      out.write("}\n");
      out.write("*/\n");
      out.write("#navbar ul{\n");
      out.write("    display: flex;\n");
      out.write("    top: 0%;\n");
      out.write("    align-items: center;\n");
      out.write("    padding: 3px 15px;\n");
      out.write("}\n");
      out.write("#navbar::before{\n");
      out.write("content: \"\";\n");
      out.write("background-color: #00004d;\n");
      out.write("position: absolute;\n");
      out.write("height: 100%;\n");
      out.write("width: 122.5%;\n");
      out.write("z-index: -1;\n");
      out.write("opacity: 0.4;\n");
      out.write("}\n");
      out.write("#navbar ul li{\n");
      out.write("    list-style: none;\n");
      out.write("    font-size: 1.2rem;\n");
      out.write("}\n");
      out.write("#navbar ul li a{\n");
      out.write("    color:white;\n");
      out.write("    display: block;\n");
      out.write("    padding: 3px 22px;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("#navbar ul li a:hover{\n");
      out.write("    color: black;\n");
      out.write("   background-color:white;\n");
      out.write("}\n");
      out.write(".c{\n");
      out.write("    color: white;\n");
      out.write("    font-size: 16px\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <!-- Links (sit on top) -->\n");
      out.write("\n");
      out.write("      \n");
      out.write(" <div>\n");
      out.write("         <nav id=\"navbar\">\n");
      out.write("        \n");
      out.write("        <ul>\n");
      out.write("            <li class=\"item\"><a href=\"Homepage.jsp\" target=\"_blank\"> Home</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"Adminlogin.jsp\">Admin Login</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"Userlogin.jsp\">User Login</a></li>\n");
      out.write("           <li class=\"item\"><a href=\"AllColleges.jsp\"> View College</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"AllCutoff.jsp\"> View Cutoff</a></li>\n");
      out.write("\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("        </div><br><br><br>\n");
      out.write("  ");

          String name=request.getParameter("name");
          String pass=request.getParameter("password");
          
          if(name.equals("JKAdmin")&& pass.equals("jk123"))
          {
              
      out.write("\n");
      out.write("   \n");
      out.write("  \n");
      out.write("      \n");
      out.write("              <h1>Higher Education Access Prediction System</h1><br>\n");
      out.write("              <h1>Admin Home</h1><br><br>\n");
      out.write("              \n");
      out.write("              <div>\n");
      out.write("                  <a href=\"Stream.jsp\">\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        Stream Details\n");
      out.write("    </a>\n");
      out.write("    <a href=\"College.jsp\">\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        College Details\n");
      out.write("    </a>\n");
      out.write("    <a href=\"AllColleges.jsp\">\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        View College\n");
      out.write("    </a>\n");
      out.write("              </div>\n");
      out.write("                       <div>\n");
      out.write("                  <a href=\"Cutoff.jsp\">\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        College Cutoff\n");
      out.write("    </a>\n");
      out.write("    <a href=\"Test.jsp\">\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("       Question Paper Generator\n");
      out.write("    </a>\n");
      out.write("    <a href=\"Registertest.jsp\">\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("       Question Papers\n");
      out.write("    </a>\n");
      out.write("    <a href=\"Adminlogin.jsp\">\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        Go Back\n");
      out.write("    </a>\n");
      out.write("              </div>\n");
      out.write("             \n");
      out.write("                ");

          }
          else
          {
              out.print("<h1>"+"Invalid User"+"</h1>");
          }
        
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write(" \n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div style=\"position: absolute;overflow: hidden; left: 700px; top:700px;width:500px; height:70px;  z-index: 2\" class=\" c\">\n");
      out.write("        Made By Sakshi Dongare\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
