<%-- 
    Document   : registere
    Created on : Jun 8, 2012, 3:33:41 PM
    Author     : Muser01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Maid Registration</title>
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
            function validate(){
                    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;

                    if(pattern.test(document.mlogin.email.value)){


                                         if(mlogin.name.value.length==0)
                                                            {
                                                               
                                                                alert ('Please enter your NAME');
                                                                mlogin.name.focus();
                                                               return false;
                                                            }
                                       if(mlogin.age.value=="")
                                                            {

                                                                alert ('Please enter your AGE');
                                                                mlogin.age.focus();
                                                               return false;
                                                            }
                                       if((mlogin.gender[0].checked==false)&&(mlogin.gender[1].checked==false))
                                        {

                                            alert ('Select the Gender');
                                            mlogin.gender[0].focus();
                                            mlogin.gender[1].focus();
                                           return false;
                                        }
                                       if(mlogin.password.value=="")
                                                            {

                                                                alert ('Please enter your password');
                                                                mlogin.password.focus();
                                                               return false;
                                                            }
                                       if(mlogin.phone.value=="")
                                                            {

                                                                alert ('Please enter your PHONE');
                                                                mlogin.phone.focus();
                                                               return false;
                                                            }
                                        if((mlogin.religion[0].checked==false)&&(mlogin.religion[1].checked==false)&&(mlogin.religion[2].checked==false)&&(mlogin.religion[3].checked==false))
                                            {

                                                alert ('Select the Religion');
                                                mlogin.religion[0].focus();
                                                mlogin.religion[1].focus();
                                                mlogin.religion[2].focus();
                                                mlogin.religion[3].focus();
                                                return false;
                                            }
                                       if((mlogin.ypreference[0].checked==false)&&(mlogin.ypreference[1].checked==false)&&(mlogin.ypreference[2].checked==false))
                                        {

                                               alert ('Select maid/nanny');
                                                mlogin.ypreference[0].focus();
                                                mlogin.ypreference[1].focus();
                                                mlogin.ypreference[2].focus();
                                                return false;
                                        }
                                       if((mlogin.telugu.checked==false)&&(mlogin.english.checked==false)&&(mlogin.hindi.checked==false)&&(mlogin.tamil.checked==false)&&(mlogin.others.checked==false))
                                            {

                                                alert ('Select the Language');
                                                mlogin.telugu.focus();
                                                mlogin.hindi.focus();
                                                mlogin.english.focus();
                                                mlogin.tamil.focus();
                                                mlogin.others.focus();
                                                return false;
                                            }
                             if((mlogin.live[0].checked==false)&&(mlogin.live[1].checked==false))
                                        {

                                            alert ('Select if you wish the maid/nanny to live with family');
                                            mlogin.live[0].focus();
                                            mlogin.live[1].focus();
                                           return false;
                                        }

                        document.forms[0].action();
                        return true;
                    }

                  else{
                        alert("Enter valid Email ID. Example:xyz123@abc.com");
                       mlogin.email.focus();
                        return false;
                     }
            }




    </script>
    </head>
    <body bgcolor="black">
        <h1><font size="6" color="#C009AB">New User??? Please REGISTER</font></h1>
        <br>
            <form action="cregisterm" action="get" name="mlogin" onsubmit="return validate()">
                   <font class="cs1"> NAME : </font><font size="4" color="red"><sup>*</sup></font>
                    <input type="text" size="30" name="name"><br><br>
                
                <font class="cs1">AGE : </font><font size="4" color="red"><sup>*</sup></font>
                    <input type="text" size="4" name="age"><br><br>
                
                <font class="cs1">GENDER : </font><font size="4" color="red"><sup>*</sup></font><br>
                    <input type="radio" name="gender" value="male"><b class="cs2"> Male</b><br>
                    <input type="radio" name="gender" value="female"><b class="cs2"> Female</b><br><br>
                
               <font class="cs1"> RELIGION : </font><font size="4" color="red"><sup>*</sup></font><br>
                    <input type="radio" name="religion" value="hindu"><b class="cs2"> Hindu</b><br>
                    <input type="radio" name="religion" value="muslim"><b class="cs2"> Muslim</b><br>
                    <input type="radio" name="religion" value="christrian"><b class="cs2"> Christian</b><br>
                    <input type="radio" name="religion" value="other"><b class="cs2"> Other</b><br><br>

                <font class="cs1">YOUR PREFERNCE : </font><font size="4" color="red"><sup>*</sup></font><BR>
                    <input type="radio" name="ypreference" value="nanny"><b class="cs2"> Nanny</b><br>
                    <input type="radio" name="ypreference" value="maid"><b class="cs2"> Maid</b><br>
                    <input type="radio" name="ypreference" value="both"><b class="cs2"> Both</b><br>

                <font class="cs1">EMAIL : </font><font size="4" color="red"><sup>*</sup></font>
                    <input type="text" size="maxlength" name="email"><br><br>

                <font class="cs1">PASSWORD : </font><font size="4" color="red"><sup>*</sup></font>
                    <input type="password" size="maxlength" name="password"><br><br>

                <font class="cs1">ADDRESS :</font><br>
                    <textarea name="address" rows="5" cols="50"></textarea><br><br>

                <font class="cs1">CITY :</font>
                    <input type="text" size="MAXLENGTH" name="city"><br><br>

                 <font class="cs1">STATE :</font>
                    <input type="text" size="maxlength" name="state"><br><br>

                <font class="cs1">COUNTRY :</font>
                    <input type="text" size="maxlength" name="country"><br><br>

                 <font class="cs1">PHONE : </font><font size="4" color="red"><sup>*</sup></font>
                    <input type="text" size="maxlength" name="phone"><br><br>

                 <font class="cs1">LANGUAGES KNOWN : </font><font size="4" color="red"><sup>*</sup></font><br>

                    <input type="checkbox" name="telugu" value="telugu"><b class="cs2"> Telugu</b><br>
                    <input type="checkbox" name="hindi" value="hindi"><b class="cs2"> Hindi</b><br>
                    <input type="checkbox" name="english" value="english"><b class="cs2"> English</b><br>
                    <input type="checkbox" name="tamil" value="tamil"><b class="cs2"> Tamil</b><br><br>
                    <input type="checkbox" name="others" value="others"><b class="cs2"> Others</b><br><br>
                 <font class="cs1">MARITAL STATUS :</font>
                    <input type="text" size="maxlength" name="maritalstatus"><br><br>

                 <font class="cs1">EDUCATION :</font>
                    <input type="text" size="maxlength" name="education"><br><br>

                 <font class="cs1">QUALIFICATION(Child related if any) :</font>
                    <input type="text" size="maxlength" name="qualification"><br><br>

                 <font class="cs1">CAN YOU LIVE WITH THE FAMILY : </font><font size="4" color="red"><sup>*</sup></font>
                         <input type="radio" name="live" value="yes"><b class="cs2"> Yes</b>&nbsp;
                         <input type="radio" name="live" value="no"><b class="cs2"> No</b>&nbsp;<br><BR>

                 <font class="cs1">PREVIOUS EMPLOYER DETAILS(if any) :</font>
                    <input type="text" size="maxlength" name="prevemp"><br><br>

                <font class="cs1"> PERSONAL DETAILS :</font><br>

                  <font class="cs1">COOK : </font><input type="radio" name="cook" value="yes"><b class="cs2"> Yes</b>&nbsp;
                         <input type="radio" name="cook" value="no"><b class="cs2"> No</b>&nbsp;<br>

                  <font class="cs1">SWIM : </font><input type="radio" name="swim" value="yes"><b class="cs2"> Yes</b>&nbsp;
                         <input type="radio" name="swim" value="no"><b class="cs2"> No</b>&nbsp;<br>

                <font class="cs1">DRIVE : </font><input type="radio" name="drive" value="yes"><b class="cs2"> Yes</b>&nbsp;
                        <input type="radio" name="drive" value="no"><b class="cs2"> No</b>&nbsp;<br>

                <font class="cs1">SMOKER : </font><input type="radio" name="smoker" value="yes"><b class="cs2"> Yes</b>&nbsp;
                         <input type="radio" name="smoker" value="no"><b class="cs2"> No</b>&nbsp;<br><br>
            
                <font class="cs1">ABOUT NANNY/MAID :</font><br>
                    <textarea name="aboutnanny" rows="5" cols="50"></textarea><br><br>

                <font class="cs1">EXPECTED SALARY  :</font>
                    <input type="text" size="maxlength" name="expectedsalary"><br><br>

                 <font class="cs1">LEAVES PER MONTH :</font>
                    <input type="text" size="maxlength" name="leavespermonth"><br><br>

                <input type="submit" value="submit">


            </form>
         </body>
</html>
