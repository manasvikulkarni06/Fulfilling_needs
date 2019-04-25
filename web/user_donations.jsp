<%-- 
    Document   : user_donations
    Created on : 17 Mar, 2019, 4:13:18 PM
    Author     : GAGAN
--%>

<%@page import="dto.UserBean"%>
<%@page import="java.util.List"%>
<%@page import="dto.DonationsBean"%>
<%@page import="dao.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.png"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/themify/themify-icons.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/elegant-font/html-css/style.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/slick/slick.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/lightbox2/css/lightbox.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
        <title>Donations</title>
    </head>
    <%
        String donorid=(String)session.getAttribute("userid");
        UserDAO user=new UserDAO();
        List<DonationsBean>donation_list=null;
        donation_list=user.getAllDonations(donorid);
        UserBean ob=user.getUserDetails(donorid);
        String name=ob.getName();
    %>
    <body style="background-color: mintcream">
        	<header class="header2">
		<!-- Header desktop -->
		<div class="container-menu-header-v2 p-t-26">
			<div class="topbar2">
				<div class="topbar-social">
					<a href="#" class="topbar-social-item fa fa-facebook"></a>
					<a href="#" class="topbar-social-item fa fa-instagram"></a>
					<a href="#" class="topbar-social-item fa fa-pinterest-p"></a>
					<a href="#" class="topbar-social-item fa fa-snapchat-ghost"></a>
					<a href="#" class="topbar-social-item fa fa-youtube-play"></a>
				</div>

				<!-- Logo2 -->
				<a href="welcome_user.jsp">
                                    <font size="10" color="brown"><b><u>Welcome <%out.print(name);%></u></b></font>
				</a>

				<div class="topbar-child2">
					<span class="topbar-email">

					</span>


					<!--  -->


					<div class="header-wrapicon2 m-r-13">

						<!-- Header cart noti -->
						
                                                                </div>
							    </div>
							</div>
						</div>
                                </header>
        <div class="wrap_header">
            

				<!-- Menu -->
				<div class="wrap_menu">
					<nav class="menu">
						<ul class="main_menu">
							<li>
								<a href="welcome_user.jsp">Home</a>

                                                                </li>
						</ul>
					</nav>
				</div>

				<!-- Header Icon -->
				<div class="header-icons">

				</div>
			</div>
                                <br><br>
        <center><h1><b><u>Previous Donations</u></b></h1></center><br><br>
        <div class="container">
        <div class="col-12 col-auto justify-content-center">
        <table class="table table-bordered table-hover table-responsive">
            <thead class="thead-dark">
                <tr>
                    <th>Donation Id</th>
                    <th>Organization Name</th>    
                    <th>Commodity</th>
                    <th>Donation Date</th>
                    <th>Donation Time</th>
                  
                    </tr>
            </thead>
            <tbody>
                    <%  
                        for (DonationsBean donation : donation_list)
                        {   
                            if(donation!=null)
                            {
                     
                        %>
                     <tr>
                            <td><%out.print(donation.getDonation_id());%></td>
                            <td><%out.print(donation.getOrgname());%></td>
                             <td><%out.print(donation.getCommodity());%></td>
                            <td><%out.print(donation.getRec_date());%></td>
                            <td><%out.print(donation.getRec_time());%></td>
                           
                     </tr>
                     <%}
                    }%>
            </tbody>
        </table>
        </div>
    </div>
    </body>
</html>
