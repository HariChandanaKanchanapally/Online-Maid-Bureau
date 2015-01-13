<%--
    Document   : login
    Created on : Jun 8, 2012, 2:52:56 PM
    Author     : Muser01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
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
        <h1 class="cs1">LOGIN!!!</h1>
         <img src="m5.jpg" align="right" height="250" width="250">
        <form action="clogine"  method="get" >
            <b class="cs2">USERNAME : </b><input align="center" type="text" name="username"><br><br>
            <b class="cs2">PASSWORD : </b><input align="center" type="password" name="pwd"><br><br>
            <input align="center" type="submit" value="LOGIN">
        </form>
    <p class="cs2"><b>New User??</b>&nbsp;&nbsp;<a href="registere.jsp"><b class="cs2">Register here!!</b></a></p>
    </body>
    </html>
