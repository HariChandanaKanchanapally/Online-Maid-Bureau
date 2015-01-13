package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML Frameset DTD PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Main Page</title>\n");
      out.write("        <style>\n");
      out.write("            .one\n");
      out.write("                {\n");
      out.write("                border-style:solid;\n");
      out.write("                border-width:10px;\n");
      out.write("                border-color:navy;\n");
      out.write("                border-left-style:none;\n");
      out.write("                border-bottom-style:none;\n");
      out.write("                border-collapse:collapse;\n");
      out.write("                \n");
      out.write("                }\n");
      out.write("             .two\n");
      out.write("                {\n");
      out.write("                border-style:solid;\n");
      out.write("                border-width:10px;\n");
      out.write("                border-color:navy;\n");
      out.write("                border-left-style:none;\n");
      out.write("                border-bottom-style:none;\n");
      out.write("                border-right-style:none;\n");
      out.write("                }\n");
      out.write("          </style>\n");
      out.write("     </head>\n");
      out.write("           <frameset rows=\"35%,65%\" frameborder=\"0\">\n");
      out.write("            <frame name=\"A\" src=\"home1.jsp\" ></frame>\n");
      out.write("            <frameset cols=\"20%,80%\" frameborder=\"0\">\n");
      out.write("                <frame name=\"B\" src=\"hyper.jsp\" class=\"one\"></frame>\n");
      out.write("                 <frame name=\"C\" src=\"home.jsp\" class=\"two\" ></frame>\n");
      out.write("            </frameset>\n");
      out.write("        </frameset>\n");
      out.write("   </html>\n");
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
