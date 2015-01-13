<%-- 
    Document   : index
    Created on : Jun 6, 2012, 2:45:59 PM
    Author     : Muser01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML Frameset DTD PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
        <style>
            .one
                {
                border-style:ridge;
                border-width:7px;
                border-color:silver;
                border-top-style:none;
                border-bottom-style:none;

                
                border-right-style:none;
                }
             .two
                {
                border-style:ridge;
                border-width:7px;
                border-color:silver;


                border-right-style:none;
                border-bottom-style:none;
                
                }
                
          </style>
     </head>
           <frameset cols="20%,80%" frameborder="0">
            <frame name="A" src="hyper.jsp"  ></frame>
            <frameset rows="30%,70%" frameborder="1">
                <frame name="B" src="home1.jsp" class="one"></frame>
                 <frame name="C" src="home.jsp" class="two" ></frame>
            </frameset>
        </frameset>
   <body bgcolor="blue"></body>
   </html>

