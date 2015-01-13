package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logine_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>LOGIN</title>\n");
      out.write("        <style>\n");
      out.write("            .cs1{\n");
      out.write("                color:yellow;\n");
      out.write("                font-style:normal;\n");
      out.write("                font-family:Arial;\n");
      out.write("                font-size:20pt;\n");
      out.write("            }\n");
      out.write("            .cs2{\n");
      out.write("                color:lightgreen;\n");
      out.write("                font-style:normal;\n");
      out.write("                font-family:Arial;\n");
      out.write("                font-size:15pt;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"black\">\n");
      out.write("        <h1 class=\"cs1\">LOGIN!!!</h1>\n");
      out.write("         \n");
      out.write("        <form action=\"clogine\"  method=\"get\" >\n");
      out.write("            <b class=\"cs2\">USERNAME : </b><input align=\"center\" type=\"text\" name=\"username\"><br><br>\n");
      out.write("            <b class=\"cs2\">PASSWORD : </b><input align=\"center\" type=\"password\" name=\"pwd\"><br><br>\n");
      out.write("            <input align=\"center\" type=\"submit\" value=\"LOGIN\"><img src=\"m5.jpg\" align=\"center\" height=\"250\" width=\"250\">\n");
      out.write("        </form>\n");
      out.write("    <p class=\"cs2\"><b>New User??</b>&nbsp;&nbsp;<a href=\"registere.jsp\"><b class=\"cs2\">Register here!!</b></a></p>\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
