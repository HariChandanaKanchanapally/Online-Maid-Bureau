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
public class cplacerequest extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            response.setContentType("text/html;charset=UTF-8");

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:odbc:omb","system","tiger");
            
            RequestDispatcher dispatcher;
            ResultSet rs=null;
            String fidm = request.getParameter("PIDM");
            String fide =request.getParameter("PIDE");
            String fpwd =request.getParameter("PWD");
          

            String query=null;
            out.println("<html>");
            out.println("<head>");
            out.println("<title>placerequest</title>");
            out.println("<style>");
            out.println(".profiledec{color:yellow;font-style:normal;font-family:Arial;font-size:15pt;}");
            out.println(".profiledec1{color:lightgreen;font-style:normal;font-family:Arial;font-size:15pt;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body bgcolor='black'>");
            
            out.println("<form action='cplacerequest' method='get'>");
            out.println("<h2 class='profiledec'>Please Enter your details for allocation purpose</h2>");
            out.println("<b class='profiledec1'>PROFILE ID(number) :&nbsp;&nbsp;&nbsp;</b><input type='text' name='PIDE'><br>");
            out.println("<b class='profiledec1'>PASSWORD: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b><input type='password' name='PWD'>");
            out.println("<input type='hidden' name='PIDM' value='"+fidm+"'>");
            out.println("<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='submit' value='submit'>");
            
            if(fide!=null && fidm!=null)
            {
                String query1="select PROFILE_ID from employer where password='"+fpwd+"'";
                PreparedStatement ps=connection.prepareStatement(query1);
                rs=ps.executeQuery();
                while(rs.next())
                    if(fide.equals(rs.getString(1))){
                                        String fstatus="UNDERPROCESS";
                                         ps =connection.prepareStatement
                                            ("insert into PLACEREQUEST (PID_MAID,PID_EMPLOYER,STATUS) values(?,?,?)");
                                        ps.setString(1,fidm);
                                        ps.setString(2,fide);
                                        ps.setString(3,fstatus);
                                        int n=ps.executeUpdate();
                                        dispatcher=request.getRequestDispatcher("allocation.jsp");
                                        dispatcher.forward(request, response);
                    }
                    else
                        out.println("<h1 class='profiledec'>ENTER YOUR CORRECT DETAILS</h1>");
            }
            out.println("</body>");
            out.println("</html>");
            
           


        } catch (SQLException ex) {
            Logger.getLogger(cplacerequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cplacerequest.class.getName()).log(Level.SEVERE, null, ex);
        } finally { 
            out.close();
        }
    } 


}
