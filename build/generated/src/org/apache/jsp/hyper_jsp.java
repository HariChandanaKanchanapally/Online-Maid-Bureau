package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hyper_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>details</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .cs1{\n");
      out.write("                color:#0000FF;\n");
      out.write("                font-style:normal;\n");
      out.write("                font-family:Arial;\n");
      out.write("                font-size:20pt;\n");
      out.write("               }\n");
      out.write("\n");
      out.write("           html\n");
      out.write("            {\n");
      out.write("                overflow:hidden;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("              <script type=\"text/javascript\">\n");
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
      out.write("        </head>\n");
      out.write("    <body bgcolor=\"black\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("          <img src=\"m1.jpg\" name=\"slide\" width=\"250\" height=\"170\" align=\"left\"/>\n");
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
      out.write("        <br><br><br><br><br><br><br><br>\n");
      out.write("        <p align=\"center\" class=\"cs1\">\n");
      out.write("            <br><br><br><br><br>\n");
      out.write("            <a href=\"home.jsp\" target=\"C\" style=\"text-decoration:none\">\n");
      out.write("            <font size=\"4\" color=\"yellow\"><b><fieldset><center>HOME</center></fieldset></b></font></a><br>\n");
      out.write("             <a href=\"employer.jsp\" target=\"C\" style=\"text-decoration:none\">\n");
      out.write("            <font size=\"4\" color=\"yellow\"><fieldset><center>EMPLOYER</center></fieldset></font></a><br>\n");
      out.write("             <a href=\"maid.jsp\" target=\"C\" style=\"text-decoration:none\">\n");
      out.write("            <font size=\"4\" color=\"yellow\"><fieldset><center>MAID</center></fieldset></font></a><br>\n");
      out.write("             <a href=\"visitor.jsp\" target=\"C\" style=\"text-decoration:none\">\n");
      out.write("            <font size=\"4\" color=\"yellow\"><fieldset><center>VISITOR</center></fieldset></font></a>\n");
      out.write("        \n");
      out.write("           </p>\n");
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
