



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.*;
import javax.servlet.*;

/**
 *
 * @author Muser01
 */
public class cfindmaid extends HttpServlet {


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            response.setContentType("text/html;charset=UTF-8");
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:odbc:omb","system","tiger");
          
            String fjob = request.getParameter("job");
            String fage = request.getParameter("age");
            String fgender = request.getParameter("gender");
            String freligion = request.getParameter("religion");
            String ftelugu = request.getParameter("telugu");
            String fhindi = request.getParameter("hindi");
            String fenglish = request.getParameter("english");
            String ftamil = request.getParameter("tamil");
            String fothers = request.getParameter("others");
            String flive = request.getParameter("live");
            String fcook = request.getParameter("cook");
            String fswim = request.getParameter("swim");
            String fdrive = request.getParameter("drive");
            String fsmoker = request.getParameter("smoker");
            String fpolice = request.getParameter("police");
            Boolean srows=false;
            ResultSet rs=null;
            String query=null;
         
            if(fjob.equals("maid"))
            {
             
                if(fage.equals("20-29"))
                    query="select PROFILE_ID,NAME,AGE,GENDER,RELIGION,EMAIL,ADDRESS,CITY,STATE,COUNTRY,PHONE,LTELUGU,LHINDI,LENGLISH,LTAMIL,LOTHERS,MSTATUS,EDUCATION,QUALIFICATION,LIVE,COOK,SWIM,DRIVE,PREVEMP,ABNANNY,ESALARY,LEAVESPM from maid where GENDER = '"+fgender+"' and (AGE between 20 and 29) and RELIGION = '"+freligion+"' and (PURPOSE='maid' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"' or  LENGLISH = '"+fenglish+"'or  LOTHERS = '"+fothers+"') and (COOK = '"+fcook+"' or LIVE = '"+flive+"'or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"'or SMOKER = '"+fsmoker+"') and STATUS!='allocated'";

                else   if(fage.equals("30-39"))
                    query="select PROFILE_ID,NAME,AGE,GENDER,RELIGION,EMAIL,ADDRESS,CITY,STATE,COUNTRY,PHONE,LTELUGU,LHINDI,LENGLISH,LTAMIL,LOTHERS,MSTATUS,EDUCATION,QUALIFICATION,LIVE,COOK,SWIM,DRIVE,PREVEMP,ABNANNY,ESALARY,LEAVESPM from maid where GENDER = '"+fgender+"' and (AGE between 30 and 39) and RELIGION = '"+freligion+"' and (PURPOSE='maid' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"' or  LENGLISH = '"+fenglish+"'or  LOTHERS = '"+fothers+"') and (COOK = '"+fcook+"' or LIVE = '"+flive+"'or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"'or SMOKER = '"+fsmoker+"') and STATUS!='allocated'";

               else  if(fage.equals("40-49"))
                     query="select PROFILE_ID,NAME,AGE,GENDER,RELIGION,EMAIL,ADDRESS,CITY,STATE,COUNTRY,PHONE,LTELUGU,LHINDI,LENGLISH,LTAMIL,LOTHERS,MSTATUS,EDUCATION,QUALIFICATION,LIVE,COOK,SWIM,DRIVE,PREVEMP,ABNANNY,ESALARY,LEAVESPM from maid where GENDER = '"+fgender+"' and (AGE between 40 and 49) and RELIGION = '"+freligion+"'and (PURPOSE='maid' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"'or LENGLISH = '"+fenglish+"'or LOTHERS = '"+fothers+"') and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"' or SMOKER = '"+fsmoker+"') and STATUS!='allocated'";

               else   if(fage.equals("50 and above"))
                    query="select PROFILE_ID,NAME,AGE,GENDER,RELIGION,EMAIL,ADDRESS,CITY,STATE,COUNTRY,PHONE,LTELUGU,LHINDI,LENGLISH,LTAMIL,LOTHERS,MSTATUS,EDUCATION,QUALIFICATION,LIVE,COOK,SWIM,DRIVE,PREVEMP,ABNANNY,ESALARY,LEAVESPM from maid where  GENDER = '"+fgender+"' and (AGE between 50 and 80) and RELIGION = '"+freligion+"'and  (PURPOSE='maid' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"'or LENGLISH = '"+fenglish+"'or LOTHERS = '"+fothers+"') and (COOK = '"+fcook+"'  or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"' or SMOKER = '"+fsmoker+"') and STATUS!='allocated'";
            }

            else if(fjob.equals("nanny"))
            {
                if(fage.equals("20-29"))
                    query="select PROFILE_ID,NAME,AGE,GENDER,RELIGION,EMAIL,ADDRESS,CITY,STATE,COUNTRY,PHONE,LTELUGU,LHINDI,LENGLISH,LTAMIL,LOTHERS,MSTATUS,EDUCATION,QUALIFICATION,LIVE,COOK,SWIM,DRIVE,PREVEMP,ABNANNY,ESALARY,LEAVESPM from maid where GENDER = '"+fgender+"' and (AGE between 20 and 29)  and RELIGION = '"+freligion+"' and (PURPOSE='nanny' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"'or LENGLISH = '"+fenglish+"'or LOTHERS = '"+fothers+"') and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"'or SMOKER = '"+fsmoker+"') and STATUS!='allocated'";

                else   if(fage.equals("30-39"))
                    query="select PROFILE_ID,NAME,AGE,GENDER,RELIGION,EMAIL,ADDRESS,CITY,STATE,COUNTRY,PHONE,LTELUGU,LHINDI,LENGLISH,LTAMIL,LOTHERS,MSTATUS,EDUCATION,QUALIFICATION,LIVE,COOK,SWIM,DRIVE,PREVEMP,ABNANNY,ESALARY,LEAVESPM from maid where GENDER = '"+fgender+"'and (AGE between 30 and 39) and  RELIGION = '"+freligion+"'and (PURPOSE='nanny' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"'or LENGLISH = '"+fenglish+"'or LOTHERS = '"+fothers+"')  and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"'or SMOKER = '"+fsmoker+"') and STATUS!='allocated'";

               else  if(fage.equals("40-49"))
                     query="select PROFILE_ID,NAME,AGE,GENDER,RELIGION,EMAIL,ADDRESS,CITY,STATE,COUNTRY,PHONE,LTELUGU,LHINDI,LENGLISH,LTAMIL,LOTHERS,MSTATUS,EDUCATION,QUALIFICATION,LIVE,COOK,SWIM,DRIVE,PREVEMP,ABNANNY,ESALARY,LEAVESPM from maid where  GENDER = '"+fgender+"' and (AGE between 40 and 49) and  RELIGION = '"+freligion+"'and (PURPOSE='nanny' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"'or LENGLISH = '"+fenglish+"'or LOTHERS = '"+fothers+"') and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"'or SMOKER = '"+fsmoker+"') and STATUS!='allocated'";

               else   if(fage.equals("50 and above"))
                    query="select PROFILE_ID,NAME,AGE,GENDER,RELIGION,EMAIL,ADDRESS,CITY,STATE,COUNTRY,PHONE,LTELUGU,LHINDI,LENGLISH,LTAMIL,LOTHERS,MSTATUS,EDUCATION,QUALIFICATION,LIVE,COOK,SWIM,DRIVE,PREVEMP,ABNANNY,ESALARY,LEAVESPM from maid where GENDER = '"+fgender+"' and (AGE between 50 and 80) and  RELIGION = '"+freligion+"'and  (PURPOSE='nanny' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"'or LENGLISH = '"+fenglish+"'or LOTHERS = '"+fothers+"') and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"'or SMOKER = '"+fsmoker+"') and STATUS!='allocated'";
            }

           
         
            PreparedStatement ps =connection.prepareStatement(query);
            rs=ps.executeQuery();
            
                    int flag=1;
                  
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet cregisterm</title>");
                    out.println("<style>");
                    out.println(".profiledec{border-style:ridge;border-width:4px;border-spacing:1px;border-collapse:seperate;");
                    out.println(".profiledec1{border-style:ridge;border-width:4px;border-padding:3px;color:white;");
                    
                    out.println("</style>");
                    out.println("</head>");
                    out.println("<body bgcolor='black'>");
                    out.println("<h1><font color='yellow'>THE REQUESTED PROFILES OF MAID/NANNY ARE</font></h1>");
                    
                    while(rs.next())
                      {
                        srows=true;
                        
                        if(flag==1)
                            out.println("<br><br><table align='left' class='profiledec'>");
                        if(flag==2){
                            out.println("<br><table align='center' class='profiledec'>");
                            flag=0;
                                }
                         out.println("<form action='cplacerequest' method='get'>");
                        out.println("<tr ><td class='profiledec1'>PROFILE ID IS     :"+rs.getString(1)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>NAME     :"+rs.getString(2)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>AGE      :"+rs.getString(3)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>GENDER   :"+rs.getString(4)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>RELIGION :"+rs.getString(5)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>EMAIL    :"+rs.getString(6)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>ADDRESS     :"+rs.getString(7)+","+rs.getString(8)+","+rs.getString(9)+","+rs.getString(10)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>PHONE    :"+rs.getString(11)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>LANGUAGES KNOWN ARE    :");
                       
                        String a=rs.getString(12);
                        if(rs.wasNull())
                           out.println("");
                         else
                            out.println("telugu");

                       String b=rs.getString(13);
                        if(rs.wasNull())
                           out.println("");
                         else
                            out.println("hindi");
                       String c=rs.getString(14);
                        if(rs.wasNull())
                           out.println("");
                         else
                            out.println("english");
                       String d=rs.getString(15);
                        if(rs.wasNull())
                           out.println("");
                         else
                            out.println("tamil");
                       
                        out.println("<tr ><td class='profiledec1'>MARITAL STATUS  :"+rs.getString(17)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>EDUCATION   :"+rs.getString(18)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>QUALIFICATION :"+rs.getString(19)+"</td></tr>");
                        if(rs.getString(20).endsWith("yes"))
                            out.println("<tr ><td class='profiledec1'>He/She can live with the family</td></tr>");
                        out.println("<tr ><td class='profiledec1'>COOK     :"+rs.getString(21)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>SWIM      :"+rs.getString(22)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>DRIVE   :"+rs.getString(23)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>PREVEMP :"+rs.getString(24)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>ABOUT NANNY    :"+rs.getString(25)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>EXPECTED SALARY OF THE MAID/NANNY    :"+rs.getString(26)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>EXPECTED LEAVES PER MONTH :"+rs.getString(27)+"</td></tr>");
                        out.println("<input type='hidden' name='PIDM' value='"+rs.getString(1)+"'>");
                        out.println("<input type='submit' name='placerequest' value='Place Request'>");
                        out.println("</table>");
                        flag++;
                      }
                    if(!(srows))
                            out.println("<H1><font color='yellow'>NOT AVAILABLE </font></H1>");
                    out.println("</body>");
                    out.println("</html>");
            

            

        } catch (SQLException ex) {
            Logger.getLogger(cfindmaid.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            out.println("Err in conn");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cfindmaid.class.getName()).log(Level.SEVERE, null, ex);
            out.println("Err in other");
        }

}
}






