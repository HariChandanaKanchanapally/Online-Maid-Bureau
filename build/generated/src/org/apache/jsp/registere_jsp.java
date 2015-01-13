package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registere_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .cs1{\n");
      out.write("                color:yellow;\n");
      out.write("                font-style:normal;\n");
      out.write("                font-family:Arial;\n");
      out.write("                font-size:15pt;\n");
      out.write("            }\n");
      out.write("            .cs2{\n");
      out.write("                color:lightgreen;\n");
      out.write("                font-style:normal;\n");
      out.write("                font-family:Arial;\n");
      out.write("                font-size:12pt;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function vali(){\n");
      out.write("                    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\\.([a-zA-Z])+([a-zA-Z])+/;\n");
      out.write("\n");
      out.write("                    if(pattern.test(document.elogin.email.value)){\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                                         if((elogin.name.value.length==0))\n");
      out.write("                                                            {\n");
      out.write("                                                                \n");
      out.write("                                                                alert ('Please enter your NAME');\n");
      out.write("                                                                elogin.name.focus();\n");
      out.write("                                                               return false;\n");
      out.write("                                                            }\n");
      out.write("                                       if((elogin.age.value==\"\"))\n");
      out.write("                                                            {\n");
      out.write("\n");
      out.write("                                                                alert ('Please enter your AGE');\n");
      out.write("                                                                elogin.age.focus();\n");
      out.write("                                                               return false;\n");
      out.write("                                                            }\n");
      out.write("                                       if((elogin.gender[0].checked==false)&&(elogin.gender[1].checked==false))\n");
      out.write("                                        {\n");
      out.write("\n");
      out.write("                                            alert ('Select the Gender');\n");
      out.write("                                            elogin.gender[0].focus();\n");
      out.write("                                            elogin.gender[1].focus();\n");
      out.write("                                           return false;\n");
      out.write("                                        }\n");
      out.write("                                       if((elogin.password.value==\"\"))\n");
      out.write("                                                            {\n");
      out.write("\n");
      out.write("                                                                alert ('Please enter your password');\n");
      out.write("                                                                elogin.password.focus();\n");
      out.write("                                                               return false;\n");
      out.write("                                                            }\n");
      out.write("                                       if((elogin.phone.value==\"\"))\n");
      out.write("                                                            {\n");
      out.write("\n");
      out.write("                                                                alert ('Please enter your PHONE');\n");
      out.write("                                                                elogin.phone.focus();\n");
      out.write("                                                               return false;\n");
      out.write("                                                            }\n");
      out.write("                                      \n");
      out.write("                        document.forms[0].action();\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                  else{\n");
      out.write("                        alert(\"Enter valid Email ID. Example:xyz123@abc.com\");\n");
      out.write("                       elogin.email.focus();\n");
      out.write("                        return false;\n");
      out.write("                     }\n");
      out.write("            }\n");
      out.write("                    \n");
      out.write("\n");
      out.write("         \n");
      out.write("              \n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"black\">\n");
      out.write("       <h1><font size=\"6\" color=\"#C009AB\">New User??? Please REGISTER</font></h1>\n");
      out.write("        <br>\n");
      out.write("            <form name=\"elogin\" action=\"cregistere\" action=\"get\" onsubmit=\"return vali()\">\n");
      out.write("                <font class=\"cs1\">NAME : </font><font size=\"4\" color=\"red\"><sup>*</sup></font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"name\"><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">AGE : </font><font size=\"4\" color=\"red\"><sup>*</sup></font>\n");
      out.write("                    <input type=\"text\" size=\"4\" name=\"age\"><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">GENDER : </font><font size=\"4\" color=\"red\"><sup>*</sup></font>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"male\"><b class=\"cs2\"> Male</b><br>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"female\"><b class=\"cs2\"> Female</b><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">OCCUPATION :</font>\n");
      out.write("                    <input type=\"text\" name=\"occupation\"><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">EMAIL : </font> <font size=\"4\" color=\"red\" id=\"iemail\"><sup>*</sup></font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"email\"><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">PASSWORD : </font> <font size=\"4\" color=\"red\"><sup>*</sup></font>\n");
      out.write("                    <input type=\"password\" size=\"maxlength\" name=\"password\"><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">ADDRESS :  </font><br>\n");
      out.write("                    <textarea name=\"address\" rows=\"5\" cols=\"50\"></textarea><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">CITY : </font>\n");
      out.write("                    <input type=\"text\" size=\"MAXLENGTH\" name=\"city\"><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">STATE : </font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"state\"><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">COUNTRY : </font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"country\"><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">PHONE :  </font><font size=\"4\" color=\"red\"><sup>*</sup></font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"phone\"><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">MARITAL STATUS : </font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"maritalstatus\"><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">HOW MANY CHILDREN DO YOU HAVE : </font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"children\"><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">DO ANY OF THE CHILDREN HAVE SPECIAL NEEDS : </font><BR>\n");
      out.write("                         <textarea name=\"specialneeds\" rows=\"5\" cols=\"50\"></textarea><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">DO YOU HAVE PETS : </font>\n");
      out.write("                         <input type=\"radio\" name=\"pets\" value=\"yes\"><b class=\"cs2\"> Yes</b>&nbsp;\n");
      out.write("                         <input type=\"radio\" name=\"pets\" value=\"no\"><b class=\"cs2\"> No</b>&nbsp;<br><BR>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <font class=\"cs1\">MAXIMUM SALARY YOU WISH TO OFFER : </font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"maxsalary\"><br><br>\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"submit\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("         </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
