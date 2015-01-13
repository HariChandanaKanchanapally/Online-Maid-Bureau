<%-- 
    Document   : hyper
    Created on : Jun 7, 2012, 5:08:17 PM
    Author     : Muser01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>details</title>
        <style>

            .cs1{
                color:#0000FF;
                font-style:normal;
                font-family:Arial;
                font-size:20pt;
               }

           html
            {
                overflow:hidden;

            }
            </style>
              <script type="text/javascript">
               <!--
                var image1=new Image()
                image1.src="m1.jpg"
                var image2=new Image()
                image2.src="m2.jpg"
                var image3=new Image()
                image3.src="m3.jpg"
                var image4=new Image()
                image4.src="m4.jpg"
                //-->
         </script>
        </head>
    <body bgcolor="black" >


          <img src="m1.jpg" name="slide" width="250" height="170" align="left"/>
        <script type="text/javascript">
        <!--
        //variable that will increment through the images
        var step=1
        function slideit(){
        //if browser does not support the image object, exit.
        if (!document.images)return
        document.images.slide.src=eval("image"+step+".src")
        if (step<4)
          step++
        else
            step=1
        //call function "slideit()" every 2.5 seconds
        setTimeout("slideit()",1500)
                            }
        slideit()
        //-->
        </script>
        <br><br><br><br><br>
        <p align="center" >
            <br><br><br><br><br>
            <a href="home.jsp" target="C" style="text-decoration:none">
            <font size="4" color="#0000FF"><b><fieldset><center>HOME</center></fieldset></b></font></a><br>
             <a href="employer.jsp" target="C" style="text-decoration:none">
            <font size="4" color="#0000FF"><b><fieldset><center>EMPLOYER</center></fieldset></b></font></a><br>
             <a href="maid.jsp" target="C" style="text-decoration:none">
            <font size="4" color="blue"><b><fieldset><center>MAID</center></fieldset></b></font></a><br>
             <a href="visitor.jsp" target="C" style="text-decoration:none">
            <font size="4" color="#0000FF"><b><fieldset><center>VISITOR</center></fieldset></b></font></a>
        
           </p>
    </body>
</html>
