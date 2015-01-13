package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>HOME</title>\n");
      out.write("    <style>\n");
      out.write("            .heading\n");
      out.write("            {\n");
      out.write("                color:navy;\n");
      out.write("                font-style:normal;\n");
      out.write("                font-family:Lucida Calligraphy;\n");
      out.write("                font-size:30pt;\n");
      out.write("             }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("               <!--\n");
      out.write("                var image1=new Image()\n");
      out.write("                image1.src=\"m1.jpg\"\n");
      out.write("                var image2=new Image()\n");
      out.write("                image2.src=\"m2.jpg\"\n");
      out.write("                var image3=new Image()\n");
      out.write("                image3.src=\"m3.jpg\"\n");
      out.write("                var image4=new Image()\n");
      out.write("                image4.src=\"m4.jpg\"\n");
      out.write("                //-->\n");
      out.write("         </script>\n");
      out.write("    </head>\n");
      out.write("        <body bgcolor=\"silver\">\n");
      out.write("       <img src=\"m1.jpg\" name=\"slide\" width=\"280\" height=\"170\" align=\"left\"  />\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        <!--\n");
      out.write("        //variable that will increment through the images\n");
      out.write("        var step=1\n");
      out.write("        function slideit(){\n");
      out.write("        //if browser does not support the image object, exit.\n");
      out.write("        if (!document.images)return\n");
      out.write("        document.images.slide.src=eval(\"image\"+step+\".src\")\n");
      out.write("        if (step<4)\n");
      out.write("          step++\n");
      out.write("        else\n");
      out.write("            step=1\n");
      out.write("        //call function \"slideit()\" every 2.5 seconds\n");
      out.write("        setTimeout(\"slideit()\",1500)\n");
      out.write("                            }\n");
      out.write("        slideit()\n");
      out.write("        //-->\n");
      out.write("        </script>\n");
      out.write("        <h1 align=\"center\" class=\"heading\"><font size=\"100\">ONLINE MAID BUREAU</font></h1>\n");
      out.write("         <br>\n");
      out.write("         <p align=\"right\" >\n");
      out.write("             <a href=\"home.jsp\" style=\"text-decoration:none\" target=\"C\"><font color=\"navy\" size=\"5\">HOME</font></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("             <a href=\"login.jsp\" style=\"text-decoration:none\" target=\"C\" ><font color=\"navy\" size=\"5\">LOGIN</font></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("             <a href=\"findmaid.jsp\" style=\"text-decoration:none\" target=\"C\" ><font color=\"navy\" size=\"5\">FIND MAID</font></a>\n");
      out.write("         </p>\n");
      out.write("         \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
