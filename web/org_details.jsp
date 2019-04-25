<%-- 
    Document   : org_grid
    Created on : 15 Mar, 2019, 7:47:41 PM
    Author     : GAGAN
--%>

<%@page import="java.util.List"%>
<%@page import="dao.OrgDAO"%>
<%@page import="dto.OrgBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <title>Organizations</title>
    </head>
    <body style="background-color:  whitesmoke;">
        
        <div class="alert alert-primary" role="alert">
 <h1><center><u><font color='black'>FULFILLING_NEEDS</font></u></center></h1>
</div>
       <center> Fulfilling Needs provides you a platform to donate the commodities which are no longer required by you, but can prove to be of vital importance in someone's life.
 <br><b>Choose the organization where you want to donate the commodities</b></center>
        <div class="container" style=" margin-top: 10px; align-self: center; padding-top: 30px; background-color:white ; height: auto;">   
        
     <%
       OrgBean ob=new OrgBean();
       OrgDAO org=new OrgDAO();
       List<OrgBean>org_list=null;
       org_list=org.getOrganizations();
       
     %>
    <center>
    <div class="col-12 col-sm-8 offset-sm-2">            
       <h2 class="ml-3 col-autos"><b><u><font color='black'>All Trustworthy Organizations!!!</font></u></b></h2>
    </div>
    <br><br>
    <div class="banner bgwhite p-t-40 p-b-40">
		<div class="container">
			<div class="row">
     <% for(OrgBean obj:org_list)
     { %>

<div class="col-sm-10 col-md-8 col-lg-4 m-l-r-auto">
					<!-- block1 -->
					<div class="block1 hov-img-zoom pos-relative m-b-30">
                                            <img src="displayImage?email=<%=obj.getEmail()%>" height="150px" wiidth="120px" alt="IMG-BENNER">

						<div class="block1-wrapbtn w-size2">
							<!-- Button -->
                                                        <a href="organization_profile.jsp?orgid=<%=obj.getOrgid()%>" class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">
                                                            <b><%out.print(obj.getName());%></b>
							</a>
						</div>
					</div>
				</div>     
        <% } %>
                        </div>
                </div>
    </div>
                        <br><br>
        </center>
          </div>        
    </body>
</html>
