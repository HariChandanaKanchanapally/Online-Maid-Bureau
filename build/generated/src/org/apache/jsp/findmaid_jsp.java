package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findmaid_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            .cs1{\n");
      out.write("                color:yellow;\n");
      out.write("                font-style:normal;\n");
      out.write("                font-family:Arial;\n");
      out.write("                font-size:15pt;\n");
      out.write("            }\n");
      out.write("           .cs2{\n");
      out.write("                color:lightgreen;\n");
      out.write("                font-style:normal;\n");
      out.write("                font-family:Arial;\n");
      out.write("                font-size:12pt;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("            <script>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                  function validateForm()\n");
      out.write("                            {\n");
      out.write("                            //alert('gender test');\n");
      out.write("                            if((fmaid.job[0].checked==false)&&(fmaid.job[1].checked==false))\n");
      out.write("                            {\n");
      out.write("                                   \n");
      out.write("                                   alert ('Select maid/nanny');\n");
      out.write("                                    fmaid.job[0].focus();\n");
      out.write("                                    fmaid.job[1].focus();\n");
      out.write("                                    return false;\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            if((fmaid.age[0].checked==false)&&(fmaid.age[1].checked==false)&&(fmaid.age[2].checked==false)&&(fmaid.age[3].checked==false))\n");
      out.write("                                    {\n");
      out.write("\n");
      out.write("                                        alert ('Select the Age');\n");
      out.write("                                        fmaid.age[0].focus();\n");
      out.write("                                        fmaid.age[1].focus();\n");
      out.write("                                        fmaid.age[2].focus();\n");
      out.write("                                        fmaid.age[3].focus();\n");
      out.write("                                        return false;\n");
      out.write("                                     }\n");
      out.write("\n");
      out.write("                            if((fmaid.gender[0].checked==false)&&(fmaid.gender[1].checked==false))\n");
      out.write("                                        {\n");
      out.write("\n");
      out.write("                                            alert ('Select the Gender');\n");
      out.write("                                           fmaid.gender[0].focus();\n");
      out.write("                                           fmaid.gender[1].focus();\n");
      out.write("                                           return false;\n");
      out.write("                                        }\n");
      out.write("                            if((fmaid.religion[0].checked==false)&&(fmaid.religion[1].checked==false)&&(fmaid.religion[2].checked==false)&&(fmaid.religion[3].checked==false))\n");
      out.write("                                            {\n");
      out.write("\n");
      out.write("                                                alert ('Select the Religion');\n");
      out.write("                                                fmaid.religion[0].focus();\n");
      out.write("                                                fmaid.religion[1].focus();\n");
      out.write("                                                fmaid.religion[2].focus();\n");
      out.write("                                                fmaid.religion[3].focus();\n");
      out.write("                                                return false;\n");
      out.write("                                            }\n");
      out.write("                            if((fmaid.telugu.checked==false)&&(fmaid.english.checked==false)&&(fmaid.hindi.checked==false)&&(fmaid.tamil.checked==false)&&(fmaid.others.checked==false))\n");
      out.write("                                            {\n");
      out.write("\n");
      out.write("                                                alert ('Select the Language');\n");
      out.write("                                                fmaid.telugu.focus();\n");
      out.write("                                                fmaid.hindi.focus();\n");
      out.write("                                                fmaid.english.focus();\n");
      out.write("                                                fmaid.tamil.focus();\n");
      out.write("                                                fmaid.others.focus();\n");
      out.write("                                                return false;\n");
      out.write("                                            }\n");
      out.write("                             if((fmaid.live[0].checked==false)&&(fmaid.live[1].checked==false))\n");
      out.write("                                        {\n");
      out.write("\n");
      out.write("                                            alert ('Select if you wish the maid/nanny to live with family');\n");
      out.write("                                            fmaid.live[0].focus();\n");
      out.write("                                            fmaid.live[1].focus();\n");
      out.write("                                           return false;\n");
      out.write("                                        }\n");
      out.write("                            else\n");
      out.write("                                {\n");
      out.write("                                  document.forms[0].action();\n");
      out.write("                                   return true;\n");
      out.write("                                }\n");
      out.write("                               \n");
      out.write("                        }\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                    </script>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"black\"  >\n");
      out.write("        <h1><font size=\"8\" color=\"#C009AB\">Fill in your requirements here!!</font></h1>\n");
      out.write("        <form name=\"fmaid\" action=\"cfindmaid\" method=\"get\" onsubmit=\"return validateForm()\">\n");
      out.write("            <b class=\"cs1\">Do you want a maid or a nanny?</b><br>\n");
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"job\" value=\"maid\"><b class=\"cs2\">  Maid</b><br>\n");
      out.write("            <input type=\"radio\" name=\"job\" value=\"nanny\"><b class=\"cs2\">Nanny</b><br><br>\n");
      out.write("\n");
      out.write("           <b class=\"cs1\">AGE:</b><br>\n");
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"age\" value=\"20-29\"><b class=\"cs2\">20-29</b><br>\n");
      out.write("            <input type=\"radio\" name=\"age\" value=\"30-39\" ><b class=\"cs2\">30-39</b><br>\n");
      out.write("            <input type=\"radio\" name=\"age\" value=\"40-49\" ><b class=\"cs2\">40-49</b><br>\n");
      out.write("            <input type=\"radio\" name=\"age\" value=\"50 and above\"><b class=\"cs2\">50 and above</b><br><br>\n");
      out.write("\n");
      out.write("             <b class=\"cs1\">GENDER:</b><br>\n");
      out.write("             <input type=\"radio\" name=\"gender\" value=\"male\"><b class=\"cs2\">Male</b><br>\n");
      out.write("             <input type=\"radio\" name=\"gender\" value=\"female\"><b class=\"cs2\">Female</b><br><br>\n");
      out.write("\n");
      out.write("             <b class=\"cs1\">RELIGION:</b><br>\n");
      out.write("             <input type=\"radio\" name=\"religion\" value=\"hindu\"><b class=\"cs2\">Hindu</b><br>\n");
      out.write("             <input type=\"radio\" name=\"religion\" value=\"muslim\"><b class=\"cs2\">Muslim</b><br>\n");
      out.write("             <input type=\"radio\" name=\"religion\" value=\"christrian\"><b class=\"cs2\">Christian</b><br>\n");
      out.write("             <input type=\"radio\" name=\"religion\" value=\"other\"><b class=\"cs2\">Other</b><br><br>\n");
      out.write("\n");
      out.write("             <b class=\"cs1\">LANGUAGES PREFERED:</b><br>\n");
      out.write("\n");
      out.write("             <input type=\"checkbox\" name=\"telugu\" value=\"telugu\"><b class=\"cs2\">Telugu</b><br>\n");
      out.write("             <input type=\"checkbox\" name=\"hindi\" value=\"hindi\"><b class=\"cs2\">Hindi</b><br>\n");
      out.write("             <input type=\"checkbox\" name=\"english\" value=\"english\"><b class=\"cs2\">English</b><br>\n");
      out.write("             <input type=\"checkbox\" name=\"tamil\" value=\"tamil\"><b class=\"cs2\">Tamil</b><br><br>\n");
      out.write("             <input type=\"checkbox\" name=\"others\" value=\"others\"><b class=\"cs2\">Others</b><br><br>\n");
      out.write("\n");
      out.write("              <b class=\"cs1\">DO YOU WANT YOUR NANNY/MAID TO LIVE WITH YOU?</b><br>\n");
      out.write("\n");
      out.write("              <input type=\"radio\" name=\"live\" value=\"yes\"><b class=\"cs2\">Yes</b><br>\n");
      out.write("              <input type=\"radio\" name=\"live\" value=\"no\"><b class=\"cs2\">No</b><br><br>\n");
      out.write("\n");
      out.write("            <b class=\"cs1\">NANNY/MAID PERSONALS:</b><br>\n");
      out.write("\n");
      out.write("            <b class=\"cs2\">COOK : </b><input type=\"radio\" name=\"cook\" value=\"yes\"><b class=\"cs2\">Yes</b>&nbsp;\n");
      out.write("            <input type=\"radio\" name=\"cook\" value=\"no\"><b class=\"cs2\">No</b>&nbsp;<br><br>\n");
      out.write("            \n");
      out.write("            <b class=\"cs2\">SWIM : </b><input type=\"radio\" name=\"swim\" value=\"yes\"><b class=\"cs2\">Yes</b>&nbsp;\n");
      out.write("            <input type=\"radio\" name=\"swim\" value=\"no\"><b class=\"cs2\">No&nbsp;</b><br><br>\n");
      out.write("           \n");
      out.write("            <b class=\"cs2\">DRIVE : </b><input type=\"radio\" name=\"drive\" value=\"yes\"><b class=\"cs2\">Yes</b>&nbsp;\n");
      out.write("            <input type=\"radio\" name=\"drive\" value=\"no\"><b class=\"cs2\">No</b>&nbsp;<br><br>\n");
      out.write("           \n");
      out.write("            <b class=\"cs2\">SMOKER : </b><input type=\"radio\" name=\"smoker\" value=\"yes\"><b class=\"cs2\">Yes</b>&nbsp;\n");
      out.write("            <input type=\"radio\" name=\"smoker\" value=\"no\"><b class=\"cs2\">No</b>&nbsp;<br><br>\n");
      out.write("          \n");
      out.write("\n");
      out.write("            \n");
      out.write("             \n");
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
