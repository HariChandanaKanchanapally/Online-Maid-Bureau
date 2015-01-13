package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.*;
import javax.servlet.*;

public final class checkrequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write(" \n");
      out.write("        <title>NOTIFICATIONS</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello USER</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         ");

  
            try{
                     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:odbc:omb","system","tiger");
            out.println("2222");
            
            String fid = request.getParameter("id");

            ResultSet rs=null;
            String query=null;

          
             query="select PID_MAID,PID_EMPLOYER where STATUS='underprocess' from placerequest";
           

            PreparedStatement ps =connection.prepareStatement(query);
            rs=ps.executeQuery();
            
      out.write("\n");
      out.write("            <form action=\"checkrequest\" method=\"get\">\n");
      out.write("            <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <th>PROFILE ID OF MAID</th>\n");
      out.write("                <th>PROFILE ID OF EMPLOYER</th>\n");
      out.write("                <th>DO YOU ACCEPT</th>\n");
      out.write("            </tr>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          ");
  while(rs.next()){ 
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
 out.println(rs.getString(1)); 
      out.write("</td>\n");
      out.write("                <td>");
 out.println(rs.getString(2)); 
      out.write("</td>\n");
      out.write("                <td><input type=\"radio\" name=\"yes\" value=\"yes\">YES&nbsp;<input type=\"radio\" name=\"no\" value=\"no\">NO</td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("            ");
}
             }
             catch (SQLException ex) {

            out.println("Err in conn");
           
            }
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
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
