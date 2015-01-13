/*
 * To change this template, choose Tools | Templates
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
public class cregisterm extends HttpServlet {
   
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
           ResultSet rs=null;

            String fname = request.getParameter("name");
            Integer fage = Integer.parseInt(request.getParameter("age"));
            String fgender = request.getParameter("gender");
            String freligion = request.getParameter("religion");
            String fypreference = request.getParameter("ypreference");
            String femail = request.getParameter("email");
            String fpassword = request.getParameter("password");
            String faddress = request.getParameter("address");
            String fcity = request.getParameter("city");
            String fstate = request.getParameter("state");
            String fcountry = request.getParameter("country");
            String fphone = request.getParameter("phone");
            String ftelugu = request.getParameter("telugu");
            String fhindi = request.getParameter("hindi");
            String fenglish = request.getParameter("english");
            String ftamil = request.getParameter("tamil");
            String fothers = request.getParameter("others");
            String fmaritalstatus = request.getParameter("maritalstatus");
            String feducation = request.getParameter("education");
            String fqualification = request.getParameter("qualification");
            String flive = request.getParameter("live");
            String fprevemp = request.getParameter("prevemp");
            String fcook = request.getParameter("cook");
            String fswim = request.getParameter("swim");
            String fdrive = request.getParameter("drive");
            String fsmoker = request.getParameter("smoker");
            String faboutnanny = request.getParameter("aboutnanny");
            String fexpectedsalary = request.getParameter("expectedsalary");
            String fleavespermonth = request.getParameter("leavespermonth");
            String fstatus=null;
           
            PreparedStatement ps =connection.prepareStatement
                    ("insert into MAID (NAME,AGE,GENDER,RELIGION,PURPOSE,EMAIL,PASSWORD,ADDRESS,CITY,STATE,COUNTRY,PHONE,LTELUGU,LHINDI,LENGLISH,LTAMIL,LOTHERS,MSTATUS,EDUCATION,QUALIFICATION,LIVE,PREVEMP,COOK,SWIM,DRIVE,SMOKER,ABNANNY,ESALARY,LEAVESPM,STATUS)  values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                 
         
            ps.setString(1,fname);
            ps.setInt(2,fage);
            ps.setString(3,fgender);
            ps.setString(4,freligion);
            ps.setString(5,fypreference);
            ps.setString(6,femail);
            ps.setString(7,fpassword);
            ps.setString(8,faddress);
            ps.setString(9,fcity);
            ps.setString(10,fstate);
            ps.setString(11,fcountry);
            ps.setString(12,fphone);
            ps.setString(13,ftelugu);
            ps.setString(14,fhindi);
            ps.setString(15,fenglish);
            ps.setString(16,ftamil);
            ps.setString(17,fothers);
            ps.setString(18,fmaritalstatus);
            ps.setString(19,feducation);
            ps.setString(20,fqualification);
            ps.setString(21,flive);
            ps.setString(22,fprevemp);
            ps.setString(23,fcook);
            ps.setString(24,fswim);
            ps.setString(25,fdrive);
            ps.setString(26,fsmoker);
            ps.setString(27,faboutnanny);
            ps.setString(28,fexpectedsalary);
            ps.setString(29,fleavespermonth);
            ps.setString(30,fstatus);
           
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

            ps =connection.prepareStatement("select PROFILE_ID from maid where EMAIL='"+femail+"' and PASSWORD='"+fpassword+"'");

            rs=ps.executeQuery();

            while(rs.next())
                out.println("<br><p class='profiledec1'>YOUR PROFILE ID is  "+rs.getInt(1)+"<br>PLEASE NOTE FOR FURTHER USE</p>");
            out.println("<br><a href='loginm.jsp'><b class='profiledec1'>LOGIN</b></a>");

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