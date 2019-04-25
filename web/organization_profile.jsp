<%-- 
    Document   : organization_profile
    Created on : 17 Mar, 2019, 4:02:55 PM
    Author     : GAGAN
--%>

<%@page import="dao.OrgDAO"%>
<%@page import="dto.OrgBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%
        String orgid=request.getParameter("orgid");
        OrgDAO ob=new OrgDAO();
        String ch=request.getParameter("ch");
        OrgBean org=new OrgBean();
        org=ob.getOrgDetails(orgid);        
    %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="css/style.css">  
    <title>Organization Profile</title>
        
    </head>
    <body>

         <div class="main">

        <section class="signup">
            <div class="container">
                <div class="signup-content">
                        <h2 class="form-title"><%out.print(org.getName());%></h2>
                        
 
                        <img src="GetImage?email=<%=org.getEmail()%>" height="150px" wiidth="120px" alt="IMG-BENNER">
                        <br><br>
                        <h4>About Us:</h4>
                        <%out.print(org.getInfo());%> <br><br><br></h1>
                        </div>
            </div>
        </section>                
       </div>               
                         <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main_useregister.js.js"></script>
    </body>
</html>
