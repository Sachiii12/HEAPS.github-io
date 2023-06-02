package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Questions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  \n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\n");
      out.write("        \"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Taking Test</title>\n");
      out.write("    <style>\n");
      out.write("          a {\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 8px 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".previous {\n");
      out.write("  background-color: black;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".round {\n");
      out.write("  border-radius: 20%;\n");
      out.write("}\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("form {border: 3px solid #f1f1f1;align-content: center}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 10px 20px;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  box-sizing: border-box;\n");
      out.write(" \n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write(" \n");
      out.write("        /* Styling the Body element i.e. Color,\n");
      out.write("        Font, Alignment */\n");
      out.write("        body {\n");
      out.write("            background-color: grey;\n");
      out.write("            font-family: Verdana;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("        /* Styling the Form (Color, Padding, Shadow) */\n");
      out.write("        form {\n");
      out.write("            background-color: #fff;\n");
      out.write("            max-width: 500px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 30px 20px;\n");
      out.write("            box-shadow: 2px 5px 10px rgba(0, 0, 0, 0.5);\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("        /* Styling form-control Class */\n");
      out.write("        .form-control {\n");
      out.write("            text-align: left;\n");
      out.write("            margin-bottom: 25px;\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("        /* Styling form-control Label */\n");
      out.write("        .form-control label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("        /* Styling form-control input,\n");
      out.write("        select, textarea */\n");
      out.write("        .form-control input,\n");
      out.write("        .form-control select,\n");
      out.write("        .form-control textarea {\n");
      out.write("            border: 1px solid #777;\n");
      out.write("            border-radius: 2px;\n");
      out.write("            font-family: inherit;\n");
      out.write("            padding: 10px;\n");
      out.write("            display: block;\n");
      out.write("            width: 95%;\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("        /* Styling form-control Radio\n");
      out.write("        button and Checkbox */\n");
      out.write("        .form-control input[type=\"radio\"],\n");
      out.write("        .form-control input[type=\"checkbox\"] {\n");
      out.write("            display: inline-block;\n");
      out.write("            width: auto;\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("        /* Styling Button */\n");
      out.write("        button {\n");
      out.write("            background-color: #05c46b;\n");
      out.write("            border: 1px solid #777;\n");
      out.write("            border-radius: 2px;\n");
      out.write("            font-family: inherit;\n");
      out.write("            font-size: 21px;\n");
      out.write("            display: block;\n");
      out.write("            width: 100%;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        a\n");
      out.write("        {\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("  \n");
      out.write("<body>\n");
      out.write("    <a href=\"Adminhome1.jsp\" class=\"previous round\">&#8249;</a><br>\n");
      out.write("\n");
      out.write("       <h1 style=\"font-size: 50px; background-color: white\"><b><u>HIGHER EDUCATION ACCESS PREDICTION SYSTEM</u></b></h1><br>\n");
      out.write("    <h1 style=\"text-align: center;\">Question Paper </h1>\n");
      out.write("  \n");
      out.write("    <!-- Create Form -->\n");
      out.write("    <form id=\"form\" action=\"Registertest.jsp\">\n");
      out.write(" \n");
      out.write("        <!-- Details -->\n");
      out.write("     \n");
      out.write("  \n");
      out.write("        <div class=\"form-control\">\n");
      out.write("            <label for=\"role\" id=\"label-role\">\n");
      out.write("                Type :\n");
      out.write("            </label>\n");
      out.write("             \n");
      out.write("            \n");
      out.write("            <select name=\"typ\">\n");
      out.write("                <option value=\"Aptitude\">Aptitude</option>\n");
      out.write("                \n");
      out.write("                <option value=\"English\">English</option>\n");
      out.write("                <option value=\"Maths\">Maths</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <div class=\"form-control\">\n");
      out.write("            Write Question<br><input type=\"text\" name=\"question\" value=\"\" />\n");
      out.write("        </div>\n");
      out.write("        Option 1 :<input type=\"text\" name=\"option1\" value=\"\" /><br>\n");
      out.write("         Option 2 :<input type=\"text\" name=\"option2\" value=\"\" /><br>\n");
      out.write("          Option 3 :<input type=\"text\" name=\"option3\" value=\"\" /><br>\n");
      out.write("           Option 4 :<input type=\"text\" name=\"option4\" value=\"\" /><br>\n");
      out.write("           Answer :<br><input type=\"text\" name=\"answer\" value=\"\" />\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("  \n");
      out.write("                 \n");
      out.write("        \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            <br>\n");
      out.write("       \n");
      out.write("  \n");
      out.write(" \n");
      out.write("         \n");
      out.write("  \n");
      out.write("   \n");
      out.write("        <button type=\"submit\" value=\"submit\">\n");
      out.write("            Submit\n");
      out.write("        </button>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("    </form>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("  \n");
      out.write("</html>");
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
