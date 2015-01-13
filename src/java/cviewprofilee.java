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
public class cviewprofilee extends HttpServlet {


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
   

            String fid = request.getParameter("id");
            Boolean srows=false;
            ResultSet rs=null;
            String query=null;


             query="select PROFILE_ID,NAME,AGE,GENDER,OCCUPATION,EMAIL,ADDRESS,CITY,STATE,COUNTRY,PHONE,MARITALSTATUS,CHILDREN,SPECIALNEEDS,PETS,MAXSALARY FROM EMPLOYER where PROFILE_ID = '"+fid+"'";




            PreparedStatement ps =connection.prepareStatement(query);
            rs=ps.executeQuery();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cregisterm</title>");
                    out.println("<style>");
                    out.println(".profiledec{border-style:ridge;border-width:4px;border-spacing:1px;border-collapse:seperate;");
                    out.println(".profiledec1{border-style:ridge;border-width:4px;border-padding:3px;color:white;");
                    out.println("</style>");
                    out.println("</head>");
                    out.println("<body bgcolor='black'>");
            while(rs.next()){
                    srows=true;
                   
                    
                    out.println("<h1><font color='yellow'>THE FOLLOWING IS THE PROFILE OF THE EMPLOYER</font></h1>");
                    out.println("<table align='CENTER' class='profiledec'>");
                        out.println("<tr ><td class='profiledec1'>PROFILE ID IS     :"+rs.getString(1)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>NAME     :"+rs.getString(2)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>AGE      :"+rs.getString(3)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>GENDER   :"+rs.getString(4)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>OCCUPATION :"+rs.getString(5)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>EMAIL    :"+rs.getString(6)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>ADDRESS     :"+rs.getString(7)+","+rs.getString(8)+","+rs.getString(9)+","+rs.getString(10)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>PHONE    :"+rs.getString(11)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>MARITAL STATUS  :"+rs.getString(12)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>NUMBER OF CHILDREN   :"+rs.getString(13)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>SPECIAL NEEDS OF CHILDREN :"+rs.getString(14)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>PETS :"+rs.getString(15)+"</td></tr>");
                        out.println("<tr ><td class='profiledec1'>MAXIMUM SALARY OFFERED TO THE MAID/NANNY    :"+rs.getString(16)+"</td></tr>");
                        out.println("</table>");
                        
                        }
            if(!(srows))
                out.println("<h1> <font color='yellow'>Profile ID doesnt exist</font></h1>");
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


