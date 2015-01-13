package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vfindmaid_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Find Maid</title>\n");
      out.write("        <style>\n");
      out.write("            .fm{\n");
      out.write("                color:black;\n");
      out.write("                font-style:normal;\n");
      out.write("                font-family:normal;\n");
      out.write("                font-size:10pt;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("            <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                  function validateForm()\n");
      out.write("                            {\n");
      out.write("                            //alert('gender test');\n");
      out.write("                            if((vfmaid.job[0].checked==false)&&(vfmaid.job[1].checked==false))\n");
      out.write("                            {\n");
      out.write("\n");
      out.write("                                   alert ('Select Your job');\n");
      out.write("                                    document.forms[0].reset();\n");
      out.write("                                    return false;\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            if((vfmaid.age[0].checked==false)&&(vfmaid.age[1].checked==false)&&(vfmaid.age[2].checked==false)&&(vfmaid.age[3].checked==false))\n");
      out.write("                                    {\n");
      out.write("\n");
      out.write("                                        alert ('Select Your Age');\n");
      out.write("                                        document.forms[0].reset();\n");
      out.write("                                        return false;\n");
      out.write("                                     }\n");
      out.write("\n");
      out.write("                            if((vfmaid.gender[0].checked==false)&&(vfmaid.gender[1].checked==false))\n");
      out.write("                                        {\n");
      out.write("\n");
      out.write("                                            alert ('Select Your Gender');\n");
      out.write("                                            document.forms[0].reset();\n");
      out.write("                                           return false;\n");
      out.write("                                        }\n");
      out.write("                            if((vfmaid.religion[0].checked==false)&&(vfmaid.religion[1].checked==false)&&(vfmaid.religion[2].checked==false)&&(vfmaid.religion[3].checked==false))\n");
      out.write("                                            {\n");
      out.write("\n");
      out.write("                                                alert ('Select Your Religion');\n");
      out.write("                                                document.forms[0].reset();\n");
      out.write("                                                return false;\n");
      out.write("                                            }\n");
      out.write("                            if((vfmaid.telugu.checked==false)&&(vfmaid.english.checked==false)&&(vfmaid.hindi.checked==false)&&(vfmaid.tamil.checked==false)&&(vfmaid.others.checked==false))\n");
      out.write("                                            {\n");
      out.write("\n");
      out.write("                                                alert ('Select Your Language');\n");
      out.write("                                                document.forms[0].reset();\n");
      out.write("                                                return false;\n");
      out.write("                                            }\n");
      out.write("                             if((vfmaid.live[0].checked==false)&&(vfmaid.live[1].checked==false))\n");
      out.write("                                        {\n");
      out.write("\n");
      out.write("                                            alert ('Select if you wish to live with family');\n");
      out.write("                                            document.forms[0].reset();\n");
      out.write("                                           return false;\n");
      out.write("                                        }\n");
      out.write("                            else\n");
      out.write("                                {\n");
      out.write("                                  document.forms[0].action();\n");
      out.write("                                   return true;\n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </script>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"lightgreen\">\n");
      out.write("        <h1>Fill in your requirements here!!</h1>\n");
      out.write("        <form action=\"cvfindmaid\" method=\"get\" class=\"fm\" name=\"vfmaid\" onsubmit=\"return validateForm()\">\n");
      out.write("            <b>Do you want a maid or a nanny?</b><br>\n");
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"job\" value=\"maid\">Maid<br>\n");
      out.write("            <input type=\"radio\" name=\"job\" value=\"nanny\">Nanny<br><br>\n");
      out.write("\n");
      out.write("           <b>AGE:</b><br>\n");
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"age\" value=\"20-29\">20-29<br>\n");
      out.write("            <input type=\"radio\" name=\"age\" value=\"30-39\">30-39<br>\n");
      out.write("            <input type=\"radio\" name=\"age\" value=\"40-49\">40-49<br>\n");
      out.write("            <input type=\"radio\" name=\"age\" value=\"50 and above\">50 and above<br><br>\n");
      out.write("\n");
      out.write("             <b>GENDER:</b><br>\n");
      out.write("             <input type=\"radio\" name=\"gender\" value=\"male\">Male<br>\n");
      out.write("             <input type=\"radio\" name=\"gender\" value=\"female\">Female<br><br>\n");
      out.write("\n");
      out.write("             <b>RELIGION:</b><br>\n");
      out.write("             <input type=\"radio\" name=\"religion\" value=\"hindu\">Hindu<br>\n");
      out.write("             <input type=\"radio\" name=\"religion\" value=\"muslim\">Muslim<br>\n");
      out.write("             <input type=\"radio\" name=\"religion\" value=\"christrian\">Christian<br>\n");
      out.write("             <input type=\"radio\" name=\"religion\" value=\"other\">Other<br><br>\n");
      out.write("\n");
      out.write("             <b>LANGUAGES PREFERED:</b><br>\n");
      out.write("\n");
      out.write("             <input type=\"checkbox\" name=\"telugu\" value=\"telugu\">Telugu<br>\n");
      out.write("             <input type=\"checkbox\" name=\"hindi\" value=\"hindi\">Hindi<br>\n");
      out.write("             <input type=\"checkbox\" name=\"english\" value=\"english\">English<br>\n");
      out.write("             <input type=\"checkbox\" name=\"tamil\" value=\"tamil\">Tamil<br><br>\n");
      out.write("             <input type=\"checkbox\" name=\"others\" value=\"others\">Others<br><br>\n");
      out.write("\n");
      out.write("              <b>DO YOU WANT YOUR NANNY/MAID TO LIVE WITH YOU?</b><br>\n");
      out.write("\n");
      out.write("              <input type=\"radio\" name=\"live\" value=\"yes\">Yes<br>\n");
      out.write("              <input type=\"radio\" name=\"live\" value=\"no\">No<br><br>\n");
      out.write("\n");
      out.write("            <b>NANNY/MAID PERSONALS:</b><br>\n");
      out.write("\n");
      out.write("            COOK : <input type=\"radio\" name=\"cook\" value=\"yes\">Yes&nbsp;\n");
      out.write("            <input type=\"radio\" name=\"cook\" value=\"no\">No&nbsp;<br><br>\n");
      out.write("            \n");
      out.write("            SWIM : <input type=\"radio\" name=\"swim\" value=\"yes\">Yes&nbsp;\n");
      out.write("            <input type=\"radio\" name=\"swim\" value=\"no\">No&nbsp;<br><br>\n");
      out.write("            \n");
      out.write("            DRIVE : <input type=\"radio\" name=\"drive\" value=\"yes\">Yes&nbsp;\n");
      out.write("            <input type=\"radio\" name=\"drive\" value=\"no\">No&nbsp;<br><br>\n");
      out.write("            \n");
      out.write("            SMOKER : <input type=\"radio\" name=\"smoker\" value=\"yes\">Yes&nbsp;\n");
      out.write("            <input type=\"radio\" name=\"smoker\" value=\"no\">No&nbsp;<br><br>\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("             <input type=\"submit\" value=\"submit\">\n");
      out.write("\n");
      out.write("           </form>\n");
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
