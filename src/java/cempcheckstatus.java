import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.*;
import javax.servlet.*;


/**
 *
 * @author Administrator
 */
public class cempcheckstatus extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            response.setContentType("text/html;charset=UTF-8");
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:odbc:omb", "system", "tiger");
            PreparedStatement ps = null;
            ResultSet rs = null;
            ResultSet rs1 = null;
            String query = null;
            String query2 = null;
            String fpid_e = request.getParameter("pid_e");
            String fpwd = request.getParameter("pwd");
            Integer n = 0;
            Integer n1 = 0;
            Boolean srows=false;
            Boolean srows1=false;
            out.println("<html>");
            out.println("<head>");
            out.println("<title>NOTIFICATION</title>");
            out.println("<style>");
            out.println(".profiledec{color:yellow;font-style:normal;font-family:Arial;font-size:15pt;}");
            out.println(".profiledec1{color:white;font-style:normal;font-family:Arial;font-size:15pt;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body bgcolor='black'>");
            query = "select PROFILE_ID from employer where PROFILE_ID='" + fpid_e + "' and PASSWORD='" + fpwd + "'";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs!=null) {
                
                while(rs.next()){
                    srows1=true;
                query2 = "select PID_MAID,STATUS from placerequest where PID_EMPLOYER='" + fpid_e + "'";
                ps = connection.prepareStatement(query2);
                rs1 = ps.executeQuery();
                if(rs1!=null){
                    while (rs1.next()) {
                          srows=true;
                        out.println(" <h1 class='profiledec'>YOUR REQUEST FOR MAID " + rs1.getString(1) + " IS " + rs1.getString(2)+"</h1>");
                            }
                    if(!(srows))
                        out.println("<h1 class='profiledec'>YOU HAVE MADE NO REQUESTS</h1>");
                            }
                }
                if(!(srows1))
                    out.println("<h1 class='profiledec'>ENTER YOUR CORRECT DETAILS</h1>");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(cempcheckstatus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cempcheckstatus.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    }






