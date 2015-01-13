<%-- 
    Document   : empcheckstatus
    Created on : Jun 21, 2012, 3:11:17 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CHECKSTATUS</title>
        <style>
            .cs1{
                color:yellow;
                font-style:normal;
                font-family:Arial;
                font-size:20pt;
            }
            .cs2{
                color:lightgreen;
                font-style:normal;
                font-family:Arial;
                font-size:15pt;
            }
        </style>
    </head>
    <body bgcolor="black">
        <h1 class="cs1">PLEASE ENTER YOUR DETAILS FOR VERIFICATION PURPOSE</h1>
        <form action="cempcheckstatus" method="get" class="cs2" >
           <b class="cs2"> PROFILE ID : </b><input type="text" name="pid_e"><br>
           <b class="cs2"> PASSWORD : </b><input type="password" name="pwd"><br>
            <input type="submit" value="submit">
                
        </form>
    </body>
</html>
