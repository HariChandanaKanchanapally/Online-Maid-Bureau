<%-- 
    Document   : registere
    Created on : Jun 13, 2012, 3:04:22 PM
    Author     : Muser01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .cs1{
                color:yellow;
                font-style:normal;
                font-family:Arial;
                font-size:15pt;
            }
            .cs2{
                color:lightgreen;
                font-style:normal;
                font-family:Arial;
                font-size:12pt;
            }
        </style>
        <script>
            function vali(){
                    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;

                    if(pattern.test(document.elogin.email.value)){

                       
                                         if((elogin.name.value.length==0))
                                                            {
                                                                
                                                                alert ('Please enter your NAME');
                                                                elogin.name.focus();
                                                               return false;
                                                            }
                                       if((elogin.age.value==""))
                                                            {

                                                                alert ('Please enter your AGE');
                                                                elogin.age.focus();
                                                               return false;
                                                            }
                                       if((elogin.gender[0].checked==false)&&(elogin.gender[1].checked==false))
                                        {

                                            alert ('Select the Gender');
                                            elogin.gender[0].focus();
                                            elogin.gender[1].focus();
                                           return false;
                                        }
                                       if((elogin.password.value==""))
                                                            {

                                                                alert ('Please enter your password');
                                                                elogin.password.focus();
                                                               return false;
                                                            }
                                       if((elogin.phone.value==""))
                                                            {

                                                                alert ('Please enter your PHONE');
                                                                elogin.phone.focus();
                                                               return false;
                                                            }
                                      
                        document.forms[0].action();
                        return true;
                    }

                  else{
                        alert("Enter valid Email ID. Example:xyz123@abc.com");
                       elogin.email.focus();
                        return false;
                     }
            }
                    

         
              
    </script>
    </head>
    <body bgcolor="black">
       <h1><font size="6" color="#C009AB">New User??? Please REGISTER</font></h1>
        <br>
            <form name="elogin" action="cregistere" action="get" onsubmit="return vali()">
                <font class="cs1">NAME : </font><font size="4" color="red"><sup>*</sup></font>
                    <input type="text" size="maxlength" name="name"><br><br>

                <font class="cs1">AGE : </font><font size="4" color="red"><sup>*</sup></font>
                    <input type="text" size="4" name="age"><br><br>

                <font class="cs1">GENDER : </font><font size="4" color="red"><sup>*</sup></font>
                    <input type="radio" name="gender" value="male"><b class="cs2"> Male</b><br>
                    <input type="radio" name="gender" value="female"><b class="cs2"> Female</b><br><br>


                <font class="cs1">OCCUPATION :</font>
                    <input type="text" name="occupation"><br><br>


                <font class="cs1">EMAIL : </font> <font size="4" color="red" id="iemail"><sup>*</sup></font>
                    <input type="text" size="maxlength" name="email"><br><br>

                <font class="cs1">PASSWORD : </font> <font size="4" color="red"><sup>*</sup></font>
                    <input type="password" size="maxlength" name="password"><br><br>

                <font class="cs1">ADDRESS :  </font><br>
                    <textarea name="address" rows="5" cols="50"></textarea><br><br>

                <font class="cs1">CITY : </font>
                    <input type="text" size="MAXLENGTH" name="city"><br><br>

                 <font class="cs1">STATE : </font>
                    <input type="text" size="maxlength" name="state"><br><br>

                <font class="cs1">COUNTRY : </font>
                    <input type="text" size="maxlength" name="country"><br><br>

                 <font class="cs1">PHONE :  </font><font size="4" color="red"><sup>*</sup></font>
                    <input type="text" size="maxlength" name="phone"><br><br>


                 <font class="cs1">MARITAL STATUS : </font>
                    <input type="text" size="maxlength" name="maritalstatus"><br><br>

                 <font class="cs1">HOW MANY CHILDREN DO YOU HAVE : </font>
                    <input type="text" size="maxlength" name="children"><br><br>

                 <font class="cs1">DO ANY OF THE CHILDREN HAVE SPECIAL NEEDS : </font><BR>
                         <textarea name="specialneeds" rows="5" cols="50"></textarea><br><br>

                 <font class="cs1">DO YOU HAVE PETS : </font>
                         <input type="radio" name="pets" value="yes"><b class="cs2"> Yes</b>&nbsp;
                         <input type="radio" name="pets" value="no"><b class="cs2"> No</b>&nbsp;<br><BR>

                
                <font class="cs1">MAXIMUM SALARY YOU WISH TO OFFER : </font>
                    <input type="text" size="maxlength" name="maxsalary"><br><br>

                

                <input type="submit" value="submit">


            </form>
         </body>
</html>

