/* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;

/**
 *
 * @author Administrator
 */
public class cregistere extends HttpServlet {

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
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:odbc:omb","system","tiger");

            String fname = request.getParameter("name");
            Integer fage = Integer.parseInt(request.getParameter("age"));
            String fgender = request.getParameter("gender");
            String foccupation = request.getParameter("occupation");
            String femail = request.getParameter("email");
            String fpassword = request.getParameter("password");
            String faddress = request.getParameter("address");
            String fcity = request.getParameter("city");
            String fstate = request.getParameter("state");
            String fcountry = request.getParameter("country");
            String fphone = request.getParameter("phone");
            String fmaritalstatus = request.getParameter("maritalstatus");
            String fchildren = request.getParameter("children");
            String fspecialneeds = request.getParameter("specialneeds");
            String fpets = request.getParameter("pets");
            String fmaxsalary = request.getParameter("maxsalary");
            


            PreparedStatement ps =connection.prepareStatement
                    ("insert into EMPLOYER (NAME,AGE ,GENDER ,OCCUPATION ,EMAIL,PASSWORD,ADDRESS,CITY,STATE,COUNTRY,PHONE,MARITALSTATUS ,CHILDREN,SPECIALNEEDS,PETS,MAXSALARY) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ResultSet rs=null;

            ps.setString(1,fname);
            ps.setInt(2,fage);
            ps.setString(3,fgender);
            ps.setString(4,foccupation);
            ps.setString(5,femail);
            ps.setString(6,fpassword);
            ps.setString(7,faddress);
            ps.setString(8,fcity);
            ps.setString(9,fstate);
            ps.setString(10,fcountry);
            ps.setString(11,fphone);
            ps.setString(12,fmaritalstatus);
            ps.setString(13,fchildren);
            ps.setString(14,fspecialneeds);
            ps.setString(15,fpets);
            ps.setString(16,fmaxsalary);
            
            int n=ps.executeUpdate();

            

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registeration</title>");
            out.println("<style>");
            out.println(".profiledec{color:yellow;font-style:normal;font-family:Arial;font-size:15pt;}");
            out.println(".profiledec1{color:lightgreen;font-style:normal;font-family:Arial;font-size:15pt;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body bgcolor='black'>");
            out.println("<h1 class='profiledec'>REGISTERATION COMPLETE!!!!!!</h1>");
            ps =connection.prepareStatement("select PROFILE_ID from employer where EMAIL='"+femail+"' and PASSWORD='"+fpassword+"'");
           
            rs=ps.executeQuery();
        
            while(rs.next())
                out.println("<br><p class='profiledec1'>YOUR PROFILE ID is"+rs.getInt(1)+"<br>PLEASE NOTE FOR FURTHER USE</p>");
            out.println("<br><a href='logine.jsp'><b class='profiledec1'>LOGIN</b></a>");
            out.println("</body>");
            out.println("</html>");


        } catch (SQLException ex) {
            Logger.getLogger(cregisterm.class.getName()).log(Level.SEVERE, null, ex);
            out.println("error in conn");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cregisterm.class.getName()).log(Level.SEVERE, null, ex);
            out.println("err in other");
        } finally {
            out.close();
        }
    }

}