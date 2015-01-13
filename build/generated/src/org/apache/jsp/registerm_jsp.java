package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Maid Registration</title>\n");
      out.write("         <style>\n");
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
      out.write("            function validate(){\n");
      out.write("                    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\\.([a-zA-Z])+([a-zA-Z])+/;\n");
      out.write("\n");
      out.write("                    if(pattern.test(document.mlogin.email.value)){\n");
      out.write("\n");
      out.write("\n");
      out.write("                                         if(mlogin.name.value.length==0)\n");
      out.write("                                                            {\n");
      out.write("                                                               \n");
      out.write("                                                                alert ('Please enter your NAME');\n");
      out.write("                                                                mlogin.name.focus();\n");
      out.write("                                                               return false;\n");
      out.write("                                                            }\n");
      out.write("                                       if(mlogin.age.value==\"\")\n");
      out.write("                                                            {\n");
      out.write("\n");
      out.write("                                                                alert ('Please enter your AGE');\n");
      out.write("                                                                mlogin.age.focus();\n");
      out.write("                                                               return false;\n");
      out.write("                                                            }\n");
      out.write("                                       if((mlogin.gender[0].checked==false)&&(mlogin.gender[1].checked==false))\n");
      out.write("                                        {\n");
      out.write("\n");
      out.write("                                            alert ('Select the Gender');\n");
      out.write("                                            mlogin.gender[0].focus();\n");
      out.write("                                            mlogin.gender[1].focus();\n");
      out.write("                                           return false;\n");
      out.write("                                        }\n");
      out.write("                                       if(mlogin.password.value==\"\")\n");
      out.write("                                                            {\n");
      out.write("\n");
      out.write("                                                                alert ('Please enter your password');\n");
      out.write("                                                                mlogin.password.focus();\n");
      out.write("                                                               return false;\n");
      out.write("                                                            }\n");
      out.write("                                       if(mlogin.phone.value==\"\")\n");
      out.write("                                                            {\n");
      out.write("\n");
      out.write("                                                                alert ('Please enter your PHONE');\n");
      out.write("                                                                mlogin.phone.focus();\n");
      out.write("                                                               return false;\n");
      out.write("                                                            }\n");
      out.write("                                        if((mlogin.religion[0].checked==false)&&(mlogin.religion[1].checked==false)&&(mlogin.religion[2].checked==false)&&(mlogin.religion[3].checked==false))\n");
      out.write("                                            {\n");
      out.write("\n");
      out.write("                                                alert ('Select the Religion');\n");
      out.write("                                                mlogin.religion[0].focus();\n");
      out.write("                                                mlogin.religion[1].focus();\n");
      out.write("                                                mlogin.religion[2].focus();\n");
      out.write("                                                mlogin.religion[3].focus();\n");
      out.write("                                                return false;\n");
      out.write("                                            }\n");
      out.write("                                       if((mlogin.ypreference[0].checked==false)&&(mlogin.ypreference[1].checked==false)&&(mlogin.ypreference[2].checked==false))\n");
      out.write("                                        {\n");
      out.write("\n");
      out.write("                                               alert ('Select maid/nanny');\n");
      out.write("                                                mlogin.ypreference[0].focus();\n");
      out.write("                                                mlogin.ypreference[1].focus();\n");
      out.write("                                                mlogin.ypreference[2].focus();\n");
      out.write("                                                return false;\n");
      out.write("                                        }\n");
      out.write("                                       if((mlogin.telugu.checked==false)&&(mlogin.english.checked==false)&&(mlogin.hindi.checked==false)&&(mlogin.tamil.checked==false)&&(mlogin.others.checked==false))\n");
      out.write("                                            {\n");
      out.write("\n");
      out.write("                                                alert ('Select the Language');\n");
      out.write("                                                mlogin.telugu.focus();\n");
      out.write("                                                mlogin.hindi.focus();\n");
      out.write("                                                mlogin.english.focus();\n");
      out.write("                                                mlogin.tamil.focus();\n");
      out.write("                                                mlogin.others.focus();\n");
      out.write("                                                return false;\n");
      out.write("                                            }\n");
      out.write("                             if((mlogin.live[0].checked==false)&&(mlogin.live[1].checked==false))\n");
      out.write("                                        {\n");
      out.write("\n");
      out.write("                                            alert ('Select if you wish the maid/nanny to live with family');\n");
      out.write("                                            mlogin.live[0].focus();\n");
      out.write("                                            mlogin.live[1].focus();\n");
      out.write("                                           return false;\n");
      out.write("                                        }\n");
      out.write("\n");
      out.write("                        document.forms[0].action();\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                  else{\n");
      out.write("                        alert(\"Enter valid Email ID. Example:xyz123@abc.com\");\n");
      out.write("                       mlogin.email.focus();\n");
      out.write("                        return false;\n");
      out.write("                     }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"black\">\n");
      out.write("        <h1><font size=\"6\" color=\"#C009AB\">New User??? Please REGISTER</font></h1>\n");
      out.write("        <br>\n");
      out.write("            <form action=\"cregisterm\" action=\"get\" name=\"mlogin\" onsubmit=\"return validate()\">\n");
      out.write("                   <font class=\"cs1\"> NAME : </font><font size=\"4\" color=\"red\"><sup>*</sup></font>\n");
      out.write("                    <input type=\"text\" size=\"30\" name=\"name\"><br><br>\n");
      out.write("                \n");
      out.write("                <font class=\"cs1\">AGE : </font><font size=\"4\" color=\"red\"><sup>*</sup></font>\n");
      out.write("                    <input type=\"text\" size=\"4\" name=\"age\"><br><br>\n");
      out.write("                \n");
      out.write("                <font class=\"cs1\">GENDER : </font><font size=\"4\" color=\"red\"><sup>*</sup></font><br>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"male\"><b class=\"cs2\"> Male</b><br>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"female\"><b class=\"cs2\"> Female</b><br><br>\n");
      out.write("                \n");
      out.write("               <font class=\"cs1\"> RELIGION : </font><font size=\"4\" color=\"red\"><sup>*</sup></font><br>\n");
      out.write("                    <input type=\"radio\" name=\"religion\" value=\"hindu\"><b class=\"cs2\"> Hindu</b><br>\n");
      out.write("                    <input type=\"radio\" name=\"religion\" value=\"muslim\"><b class=\"cs2\"> Muslim</b><br>\n");
      out.write("                    <input type=\"radio\" name=\"religion\" value=\"christrian\"><b class=\"cs2\"> Christian</b><br>\n");
      out.write("                    <input type=\"radio\" name=\"religion\" value=\"other\"><b class=\"cs2\"> Other</b><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">YOUR PREFERNCE : </font><font size=\"4\" color=\"red\"><sup>*</sup></font><BR>\n");
      out.write("                    <input type=\"radio\" name=\"ypreference\" value=\"nanny\"><b class=\"cs2\"> Nanny</b><br>\n");
      out.write("                    <input type=\"radio\" name=\"ypreference\" value=\"maid\"><b class=\"cs2\"> Maid</b><br>\n");
      out.write("                    <input type=\"radio\" name=\"ypreference\" value=\"both\"><b class=\"cs2\"> Both</b><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">EMAIL : </font><font size=\"4\" color=\"red\"><sup>*</sup></font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"email\"><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">PASSWORD : </font><font size=\"4\" color=\"red\"><sup>*</sup></font>\n");
      out.write("                    <input type=\"password\" size=\"maxlength\" name=\"password\"><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">ADDRESS :</font><br>\n");
      out.write("                    <textarea name=\"address\" rows=\"5\" cols=\"50\"></textarea><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">CITY :</font>\n");
      out.write("                    <input type=\"text\" size=\"MAXLENGTH\" name=\"city\"><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">STATE :</font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"state\"><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">COUNTRY :</font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"country\"><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">PHONE : </font><font size=\"4\" color=\"red\"><sup>*</sup></font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"phone\"><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">LANGUAGES KNOWN : </font><font size=\"4\" color=\"red\"><sup>*</sup></font><br>\n");
      out.write("\n");
      out.write("                    <input type=\"checkbox\" name=\"telugu\" value=\"telugu\"><b class=\"cs2\"> Telugu</b><br>\n");
      out.write("                    <input type=\"checkbox\" name=\"hindi\" value=\"hindi\"><b class=\"cs2\"> Hindi</b><br>\n");
      out.write("                    <input type=\"checkbox\" name=\"english\" value=\"english\"><b class=\"cs2\"> English</b><br>\n");
      out.write("                    <input type=\"checkbox\" name=\"tamil\" value=\"tamil\"><b class=\"cs2\"> Tamil</b><br><br>\n");
      out.write("                    <input type=\"checkbox\" name=\"others\" value=\"others\"><b class=\"cs2\"> Others</b><br><br>\n");
      out.write("                 <font class=\"cs1\">MARITAL STATUS :</font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"maritalstatus\"><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">EDUCATION :</font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"education\"><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">QUALIFICATION(Child related if any) :</font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"qualification\"><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">CAN YOU LIVE WITH THE FAMILY : </font><font size=\"4\" color=\"red\"><sup>*</sup></font>\n");
      out.write("                         <input type=\"radio\" name=\"live\" value=\"yes\"><b class=\"cs2\"> Yes</b>&nbsp;\n");
      out.write("                         <input type=\"radio\" name=\"live\" value=\"no\"><b class=\"cs2\"> No</b>&nbsp;<br><BR>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">PREVIOUS EMPLOYER DETAILS(if any) :</font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"prevemp\"><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\"> PERSONAL DETAILS :</font><br>\n");
      out.write("\n");
      out.write("                  <font class=\"cs1\">COOK : </font><input type=\"radio\" name=\"cook\" value=\"yes\"><b class=\"cs2\"> Yes</b>&nbsp;\n");
      out.write("                         <input type=\"radio\" name=\"cook\" value=\"no\"><b class=\"cs2\"> No</b>&nbsp;<br>\n");
      out.write("\n");
      out.write("                  <font class=\"cs1\">SWIM : </font><input type=\"radio\" name=\"swim\" value=\"yes\"><b class=\"cs2\"> Yes</b>&nbsp;\n");
      out.write("                         <input type=\"radio\" name=\"swim\" value=\"no\"><b class=\"cs2\"> No</b>&nbsp;<br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">DRIVE : </font><input type=\"radio\" name=\"drive\" value=\"yes\"><b class=\"cs2\"> Yes</b>&nbsp;\n");
      out.write("                        <input type=\"radio\" name=\"drive\" value=\"no\"><b class=\"cs2\"> No</b>&nbsp;<br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">SMOKER : </font><input type=\"radio\" name=\"smoker\" value=\"yes\"><b class=\"cs2\"> Yes</b>&nbsp;\n");
      out.write("                         <input type=\"radio\" name=\"smoker\" value=\"no\"><b class=\"cs2\"> No</b>&nbsp;<br><br>\n");
      out.write("            \n");
      out.write("                <font class=\"cs1\">ABOUT NANNY/MAID :</font><br>\n");
      out.write("                    <textarea name=\"aboutnanny\" rows=\"5\" cols=\"50\"></textarea><br><br>\n");
      out.write("\n");
      out.write("                <font class=\"cs1\">EXPECTED SALARY  :</font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"expectedsalary\"><br><br>\n");
      out.write("\n");
      out.write("                 <font class=\"cs1\">LEAVES PER MONTH :</font>\n");
      out.write("                    <input type=\"text\" size=\"maxlength\" name=\"leavespermonth\"><br><br>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"submit\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("         </body>\n");
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
