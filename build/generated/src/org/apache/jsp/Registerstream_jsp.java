package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Registerstream_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"w3.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"mystyle.css\">\n");
      out.write("         <\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#d5d5d5\">\n");
      out.write("         \n");
      out.write("          \n");
      out.write("       \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        ");

            
            String c =request.getParameter("College");
            String s = request.getParameter("Stream");
            String m = request.getParameter("Main");
            String f =request.getParameter("Features");
        
            
              try
            {
                
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heaps","root","");
            Statement st=con.createStatement();
            String sql="insert into stream(College,Stream_Name,Main_Stream,Features)values('"+c+"','"+s+"','"+m+"','"+f+"')";
            st.executeUpdate(sql);
            
      out.write("\n");
      out.write("            \n");
      out.write("            <center> <h1 class=\"ws1\">Stream Successfully Updated</h1>\n");
      out.write("            ");

            con.close();
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
            
      out.write("\n");
      out.write("            <a href=\"Stream.jsp\"><input type=\"submit\" value=\"Go Back\" class=\"btn\"/></a>\n");
      out.write("            </center>\n");
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
