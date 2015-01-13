/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


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
public class checkrequest extends HttpServlet {
   
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
            PreparedStatement ps =null;
            ResultSet rs = null;
            String query=null;
            String fpid_m=request.getParameter("pid_m");
            String fpwd=request.getParameter("pwd");
            String query2=null;
            Integer n=0;
            Integer n1=0;
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet checkrequest</title>");
            out.println("<style>");
            out.println(".profiledec{color:yellow;font-style:normal;font-family:Arial;font-size:15pt;}");
            out.println(".profiledec1{color:yellow;font-style:normal;font-family:Arial;font-size:15pt;}");

            out.println("</style>");
            out.println("</head>");
            out.println("<body bgcolor='black'>");
            out.println("<form action='checkrequest' method='get'>");
            out.println("<h2 class='profiledec'>Please Enter  the following details for verification purpose</h2>");
            out.println("<br><b class='profiledec1'>ProfileId   </b>   <input type='text' name='pid_m'>");
            out.println("<br><b class='profiledec1'>Password  </b>  <input type='password' name='pwd'>");
            out.println("<input type='submit' name='submit' value='submit'>");
           
           if(fpid_m!=null)
           {
           
              
            query="update maid  set STATUS='allocated' where PROFILE_ID='"+fpid_m+"' and PASSWORD='"+fpwd+"'";
            ps =connection.prepareStatement(query);
            n=ps.executeUpdate();

            if(n!=0 ){
            query2="update placerequest  set STATUS='allocated' where PID_MAID='"+fpid_m+"'";
            ps =connection.prepareStatement(query2);
             n1=ps.executeUpdate();
            }
            else
                out.println("<br><br><h1>Enter your correct details</h1>");
            if(n1!=0){
                out.println("<br><br><h1>YOUR REQUEST IS SUBMITTED</h1>");
            }

           }
            out.println("</body>");
            out.println("</html>");
          
        } catch (SQLException ex) {
            Logger.getLogger(checkrequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(checkrequest.class.getName()).log(Level.SEVERE, null, ex);
        }

            
        }
    
}
    
