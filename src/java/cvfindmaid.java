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
public class cvfindmaid extends HttpServlet {


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

            ResultSet rs=null;
            String query=null;

            if(fjob.equals("maid"))
            {
                if(fage.equals("20-29"))
                    query="select PROFILE_ID from maid where GENDER = '"+fgender+"' and (AGE between 20 and 29) and  RELIGION = '"+freligion+"' and (PURPOSE='maid' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'OR LHINDI = '"+fhindi+"'OR LENGLISH = '"+fenglish+"'OR LOTHERS = '"+fothers+"')   and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"' or SMOKER = '"+fsmoker+"') and STATUS!='allocated'";

                else   if(fage.equals("30-39"))
                    query="select PROFILE_ID from maid where GENDER = '"+fgender+"' and (AGE between 30 and 39) and  RELIGION = '"+freligion+"' and (PURPOSE='maid' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'OR LHINDI = '"+fhindi+"'OR LENGLISH = '"+fenglish+"'OR LOTHERS = '"+fothers+"')   and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"' or SMOKER = '"+fsmoker+"') and STATUS!='allocated'";

               else  if(fage.equals("40-49"))
                     query="select PROFILE_ID from maid where GENDER = '"+fgender+"' and (AGE between 40 and 49) and  RELIGION = '"+freligion+"' and (PURPOSE='maid' or PURPOSE='both')  and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"'or LENGLISH = '"+fenglish+"'or LOTHERS = '"+fothers+"')  and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"' or SMOKER = '"+fsmoker+"')and STATUS!='allocated'";

               else   if(fage.equals("50 and above"))
                    query="select PROFILE_ID from maid where GENDER = '"+fgender+"'and (AGE between 50 and 80) and  RELIGION = '"+freligion+"' and  (PURPOSE='maid' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"'or LENGLISH = '"+fenglish+"'or LOTHERS = '"+fothers+"')  and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"' or SMOKER = '"+fsmoker+"')and STATUS!='allocated'";
            }

            else if(fjob.equals("nanny"))
            {
                if(fage.equals("20-29"))
                    query="select PROFILE_ID from maid where GENDER = '"+fgender+"'and (AGE between 20 and 29) and  RELIGION = '"+freligion+"' and (PURPOSE='nanny' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'OR LHINDI = '"+fhindi+"'OR LENGLISH = '"+fenglish+"'OR LOTHERS = '"+fothers+"')  and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"' or SMOKER = '"+fsmoker+"')and STATUS!='allocated'";

                else   if(fage.equals("30-39"))
                    query="select PROFILE_ID from maid where GENDER = '"+fgender+"'and (AGE between 30 and 39) and  RELIGION = '"+freligion+"'and (PURPOSE='nanny' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"'or LENGLISH = '"+fenglish+"'or LOTHERS = '"+fothers+"')  and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"' or SMOKER = '"+fsmoker+"')and STATUS!='allocated'";

               else  if(fage.equals("40-49"))
                     query="select PROFILE_ID from maid where GENDER = '"+fgender+"' and (AGE between 40 and 49) and  RELIGION = '"+freligion+"'and (PURPOSE='nanny' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"'or LENGLISH = '"+fenglish+"'or LOTHERS = '"+fothers+"')  and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"' or SMOKER = '"+fsmoker+"')and STATUS!='allocated'";

               else   if(fage.equals("50 and above"))
                    query="select PROFILE_ID from maid where GENDER = '"+fgender+"' and (AGE between 50 and 80) and RELIGION = '"+freligion+"'and  (PURPOSE='nanny' or PURPOSE='both') and (LTELUGU = '"+ftelugu+"'or LHINDI = '"+fhindi+"'or LENGLISH = '"+fenglish+"'or LOTHERS = '"+fothers+"')  and (COOK = '"+fcook+"' or LIVE = '"+flive+"' or SWIM = '"+fswim+"' or DRIVE = '"+fdrive+"' or SMOKER = '"+fsmoker+"')and STATUS!='allocated'";
            }

           

            PreparedStatement ps =connection.prepareStatement(query);
            rs=ps.executeQuery();
           
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registeration</title>");
            out.println("<style>");
            out.println(".profiledec{color:yellow;font-style:normal;font-family:Arial;font-size:15pt;}");
            out.println(".profiledec1{color:lightgreen;font-style:normal;font-family:Arial;font-size:15pt;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body bgcolor='black'>");
            int fcheck=0;
            out.println("<h1 class='profiledec'>The nanny/maid available are<br></h1>");

            while(rs.next()){
                fcheck=1;
                out.println("<h1 class='profiledec'><br>->"+rs.getString(1)+"</h1>");
                   }
            if(fcheck==1)
                 out.println("<p class='profiledec1'><br><br>The above are the profile id's of the maid/nanny.To view the profiles Please get Registered!!!<br><br>" );
                         
            else
               out.println("<h1 class='profiledec'>none.</h1>");
               out.println("<p class='profiledec1'>Please register to view other profiles of maids</p>");

            out.println("<a href='registere.jsp'><font color='blue' size='4'>Register</font></a>");
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






