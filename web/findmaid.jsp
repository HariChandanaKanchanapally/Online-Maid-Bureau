<%-- 
    Document   : findmaid
    Created on : Jun 8, 2012, 3:39:19 PM
    Author     : Muser01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Maid</title>
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

                
                  function validateForm()
                            {
                            //alert('gender test');
                            if((fmaid.job[0].checked==false)&&(fmaid.job[1].checked==false))
                            {
                                   
                                   alert ('Select maid/nanny');
                                    fmaid.job[0].focus();
                                    fmaid.job[1].focus();
                                    return false;
                            }

                            if((fmaid.age[0].checked==false)&&(fmaid.age[1].checked==false)&&(fmaid.age[2].checked==false)&&(fmaid.age[3].checked==false))
                                    {

                                        alert ('Select the Age');
                                        fmaid.age[0].focus();
                                        fmaid.age[1].focus();
                                        fmaid.age[2].focus();
                                        fmaid.age[3].focus();
                                        return false;
                                     }

                            if((fmaid.gender[0].checked==false)&&(fmaid.gender[1].checked==false))
                                        {

                                            alert ('Select the Gender');
                                           fmaid.gender[0].focus();
                                           fmaid.gender[1].focus();
                                           return false;
                                        }
                            if((fmaid.religion[0].checked==false)&&(fmaid.religion[1].checked==false)&&(fmaid.religion[2].checked==false)&&(fmaid.religion[3].checked==false))
                                            {

                                                alert ('Select the Religion');
                                                fmaid.religion[0].focus();
                                                fmaid.religion[1].focus();
                                                fmaid.religion[2].focus();
                                                fmaid.religion[3].focus();
                                                return false;
                                            }
                            if((fmaid.telugu.checked==false)&&(fmaid.english.checked==false)&&(fmaid.hindi.checked==false)&&(fmaid.tamil.checked==false)&&(fmaid.others.checked==false))
                                            {

                                                alert ('Select the Language');
                                                fmaid.telugu.focus();
                                                fmaid.hindi.focus();
                                                fmaid.english.focus();
                                                fmaid.tamil.focus();
                                                fmaid.others.focus();
                                                return false;
                                            }
                             if((fmaid.live[0].checked==false)&&(fmaid.live[1].checked==false))
                                        {

                                            alert ('Select if you wish the maid/nanny to live with family');
                                            fmaid.live[0].focus();
                                            fmaid.live[1].focus();
                                           return false;
                                        }
                            else
                                {
                                  document.forms[0].action();
                                   return true;
                                }
                               
                        }


                

                    </script>
    </head>
    <body bgcolor="black"  >
        <h1><font size="8" color="#C009AB">Fill in your requirements here!!</font></h1>
        <form name="fmaid" action="cfindmaid" method="get" onsubmit="return validateForm()">
            <b class="cs1">Do you want a maid or a nanny?</b><br>

            <input type="radio" name="job" value="maid"><b class="cs2">  Maid</b><br>
            <input type="radio" name="job" value="nanny"><b class="cs2">Nanny</b><br><br>

           <b class="cs1">AGE:</b><br>

            <input type="radio" name="age" value="20-29"><b class="cs2">20-29</b><br>
            <input type="radio" name="age" value="30-39" ><b class="cs2">30-39</b><br>
            <input type="radio" name="age" value="40-49" ><b class="cs2">40-49</b><br>
            <input type="radio" name="age" value="50 and above"><b class="cs2">50 and above</b><br><br>

             <b class="cs1">GENDER:</b><br>
             <input type="radio" name="gender" value="male"><b class="cs2">Male</b><br>
             <input type="radio" name="gender" value="female"><b class="cs2">Female</b><br><br>

             <b class="cs1">RELIGION:</b><br>
             <input type="radio" name="religion" value="hindu"><b class="cs2">Hindu</b><br>
             <input type="radio" name="religion" value="muslim"><b class="cs2">Muslim</b><br>
             <input type="radio" name="religion" value="christrian"><b class="cs2">Christian</b><br>
             <input type="radio" name="religion" value="other"><b class="cs2">Other</b><br><br>

             <b class="cs1">LANGUAGES PREFERED:</b><br>

             <input type="checkbox" name="telugu" value="telugu"><b class="cs2">Telugu</b><br>
             <input type="checkbox" name="hindi" value="hindi"><b class="cs2">Hindi</b><br>
             <input type="checkbox" name="english" value="english"><b class="cs2">English</b><br>
             <input type="checkbox" name="tamil" value="tamil"><b class="cs2">Tamil</b><br><br>
             <input type="checkbox" name="others" value="others"><b class="cs2">Others</b><br><br>

              <b class="cs1">DO YOU WANT YOUR NANNY/MAID TO LIVE WITH YOU?</b><br>

              <input type="radio" name="live" value="yes"><b class="cs2">Yes</b><br>
              <input type="radio" name="live" value="no"><b class="cs2">No</b><br><br>

            <b class="cs1">NANNY/MAID PERSONALS:</b><br>

            <b class="cs2">COOK : </b><input type="radio" name="cook" value="yes"><b class="cs2">Yes</b>&nbsp;
            <input type="radio" name="cook" value="no"><b class="cs2">No</b>&nbsp;<br><br>
            
            <b class="cs2">SWIM : </b><input type="radio" name="swim" value="yes"><b class="cs2">Yes</b>&nbsp;
            <input type="radio" name="swim" value="no"><b class="cs2">No&nbsp;</b><br><br>
           
            <b class="cs2">DRIVE : </b><input type="radio" name="drive" value="yes"><b class="cs2">Yes</b>&nbsp;
            <input type="radio" name="drive" value="no"><b class="cs2">No</b>&nbsp;<br><br>
           
            <b class="cs2">SMOKER : </b><input type="radio" name="smoker" value="yes"><b class="cs2">Yes</b>&nbsp;
            <input type="radio" name="smoker" value="no"><b class="cs2">No</b>&nbsp;<br><br>
          

            
             
             <input type="submit" value="submit">

           </form>
    </body>
</html>
