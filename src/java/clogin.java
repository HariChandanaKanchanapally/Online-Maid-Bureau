/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


/**
 *
 * @author Muser01
 */
public class clogin extends HttpServlet {
   
    
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher dispatcher;
        try {
                
            
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          
                Connection connection= DriverManager.getConnection("jdbc:odbc:omb","system","tiger");
           
                String uname=request.getParameter("username");
                String pass=request.getParameter("pwd");
                Boolean srows=false;
                PreparedStatement ps=connection.prepareStatement("select PROFILE_ID,EMAIL,PASSWORD from MAID");
                ResultSet rs=ps.executeQuery();
                int flag=0;
                int n=1;
                while(rs.next())
                {
                   String userName=rs.getString("EMAIL");
                   String passwrd=rs.getString("PASSWORD");
                   String profileid=rs.getString("PROFILE_ID");
                   if((userName.equals(uname))&&(passwrd.equals(pass))){
                          flag=1;
                         out.println("<html>");
                         out.println("<head>");
                         out.println("<title>NOTIFICATION</title>");
                         out.println("<style>");

                         out.println(".profiledec{color:yellow;font-style:normal;font-family:Arial;font-size:15pt;}");
                         out.println(".profiledec1{color:white;font-style:normal;font-family:Arial;font-size:15pt;}");

                         out.println("</style>");
                         out.println("</head>");
                         out.println("<body bgcolor='black'>");
                         out.println("<h1 class='profiledec'>WELCOME USER!!!!</h1>");
                     
                         ps=connection.prepareStatement("select PID_MAID,PID_EMPLOYER from placerequest where PID_MAID='"+profileid+"' and STATUS='underprocess'");
                 
                         ResultSet rs1=ps.executeQuery();
                       
                        while(rs1.next()){
                                srows=true;
                                if(n==1){
                                        n++;
                                        out.println("<form action='checkrequest' method='get'>");
                                       
                                        out.println("<table align='center' border='3px' width='80%'class='profiledec1'>");
                                        out.println("<tr>");
                                        out.println("<th>PROFILE ID OF MAID</th>");
                                        out.println("<th>PROFILE ID OF EMPLOYER</th>");
                                        out.println(" <th>DO YOU ACCEPT</th>");
                                        out.println("</tr>");
                                       }

                           
                                out.println("<tr>");
                                out.println("<td>"+rs1.getString(1)+"</td>");
                             
                                out.println("<td>"+rs1.getString(2)+"</td>");
                                out.println("<td><input type='submit' value='OK'></td>");
                                out.println("</tr>");
                                out.println("</table>");
                                out.println("</form>");

                        }
                        if(!(srows))
                             out.println("<h1 class='profiledec'>YOU HAVE NO NEW NOTIFICATIONS</h1>");
                        
                      }
                     
                }
                        out.println("<p class='profiledec1'>TO VIEW THE PROFILES OF EMPLOYERS.PLEASE CLICK HERE</p>");
                        out.println("<a href='viewprofilee.jsp'><font color='lightgreen'>VIEW PROFILE OF EMPLOYER</font></a>");
                        out.println("</body>");
                        out.println("</html>");
                         
                        
                          
                 
                
                   if(flag==0){

                              dispatcher=request.getRequestDispatcher("loginm2.jsp");
                              dispatcher.forward(request, response);
                              }
                  
                



            } catch (ClassNotFoundException ex) {
            Logger.getLogger(clogin.class.getName()).log(Level.SEVERE, null, ex);
            out.println("Err in conn");
        } catch (SQLException ex) {
                Logger.getLogger(clogin.class.getName()).log(Level.SEVERE, null, ex);
                 out.println("Err in other");

           }
        finally {
            out.close();
        }
    }
}