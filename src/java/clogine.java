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
public class clogine extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher dispatcher;
        try {

                //Class.forName("oracle.jdbc.driver.OracleDriver");
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

                Connection connection= DriverManager.getConnection("jdbc:odbc:omb","system","tiger");
                       // ("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
                String uname=request.getParameter("username");
                String pass=request.getParameter("pwd");
                PreparedStatement ps=connection.prepareStatement("select EMAIL,PASSWORD from EMPLOYER");
                ResultSet rs=ps.executeQuery();
                int flag=0;
                while(rs.next())
                {
                   String userName=rs.getString("EMAIL");
                   String passwrd=rs.getString("PASSWORD");
                   if((userName.equals(uname))&&(passwrd.equals(pass))){

                        dispatcher=request.getRequestDispatcher("logindirecte.jsp");
                        dispatcher.forward(request, response);
                           flag=1;
                   }
                }
                   if(flag==0){


                        dispatcher=request.getRequestDispatcher("logine2.jsp");
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