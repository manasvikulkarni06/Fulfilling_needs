<%-- 
    Document   : user_register.jsp
    Created on : Mar 14, 2019, 4:26:04 PM
    Author     : Lenovo
--%>

<%@page import="dto.OrgBean"%>
<%@page import="dao.OrgDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTER HERE</title>
    </head>
    <body>-->
                    <!DOCTYPE html>
<html lang="en">
<head>
    <%
        String orgid=request.getParameter("orgid");
        OrgDAO ob=new OrgDAO();
        String ch=request.getParameter("ch");
        OrgBean org=new OrgBean();
        org=ob.getOrgDetails(orgid);        
    %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <title>Donate Here!!!</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap-theme.min.css">
    <!-- Main css -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
     
    <div class="main">

        <section class="signup">
            <div class="container">
                <div class="signup-content">
                    <form action="UserDonation" method="POST" id="signup-form" class="signup-form" enctype="multipart/form-data">
                        <h2 class="form-title"><%out.print(org.getName());%></h2>
                        
 
                        <img src="GetImage?email=<%=org.getEmail()%>" height="150px" wiidth="120px" alt="IMG-BENNER">
                        <br><br>
                        <h4>About Us:</h4>
                        <%out.print(org.getInfo());%> <br><br><br></h1> 
                        
                        <!--<div class="form-group">
                            <input type="text" class="form-input" name="userid" id="userid" placeholder="Your User Id"/>
                        </div>-->
                    
                        Please upload the picture of COMMODITY to be donated<br></h3>
                       <div class="form-group">
                           <input type="file" class="form-input" name="com_img" id="pic" placeholder="Please upload pic of commodity to  be donated" required/>
                        </div>
                        
                        * Please make sure you upload the correct picture. If the picture does not match with the commodity to be donated PICKUP WILL BE CANCELLED AT THAT MOMENT OF TIME. <br><br>
                         <div class="form-group">
                             <input type="text" class="form-input" name="rec_date" id="pickup_date" placeholder="yyyy-mm-dd" required/>
                        </div>
                        
                         <div class="form-group">
                             <input type="text" class="form-input" name="rec_time" id="pickup_time" placeholder="hh:mm::ss" required/>
                        </div>
                       
                        <div class="form-group">
                            <input type="submit" name="DONATE" id="submit" class="form-submit" value="DONATE"/>
                        </div>
                        <input type="hidden" value="<%=ch%>" name="ch">
                        <input type="hidden" value="<%=orgid%>" name="orgid">
                    </form>
                    
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main_useregister.js.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>
    </body>
</html>
