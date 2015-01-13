<%-- 
    Document   : viewprofilem1
    Created on : Jun 13, 2012, 6:15:19 PM
    Author     : Muser01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Viewing Profile</title>
        <style>
            .cs1{
                color:yellow;
                font-style:normal;
                font-family:Arial;
                font-size:15pt;
            }

        </style>
    </head>
    <body bgcolor="black">
     
        <form action="cviewprofilem" method="get">
            <b class="cs1">PLEASE ENTER THE PROFILE ID OF THE MAID/NANNY  :  </b><input type="text" name="id">
            <input type="submit" value="View Profile">
        </form>

    </body>
</html>
