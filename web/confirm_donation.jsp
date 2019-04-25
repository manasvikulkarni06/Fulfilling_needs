<%@page import="dto.DonationsBean"%>
<%@page import="dao.UserDAO"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <%
        UserDAO user=new UserDAO();
        int donation_id=(Integer)session.getAttribute("donation_id");
        DonationsBean donation=user.getDonationDetails(donation_id);
    %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>CONFIRM DONATION</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/style_enteramount.css">
</head>
<body>

    <div class="main">

        <!-- Sign up form -->
        <section class="signup">
            <div class="container">
                <div class="signup-content">
                    <div class="signup-form">
                        <h2 class="form-title">CONFIRM DONATION</h2>
                        <form method="POST" class="register-form" id="register-form" action="ConfirmDonation">
                           <!-- <div class="form-group">
                                <label for="Amount"></i></label>
                                <input type="number" name="amount" id="amount" placeholder="Donation Amount"/>
                            </div>-->
                           <img src="GetDonationImage?donation_id=<%=donation_id%>" height="100px" wiidth="80px" alt="IMG-BENNER">
                           <br><br>
                           <font size="3"><b>Organization Name:</b><%out.print(donation.getOrgname());%><br><br></font>
                           <font size="3"><b>PICKUP DATE:</b><%out.print(donation.getRec_date());%> <br><br></font>
                           <font size="3"><b>PICKUP TIME:</b><%out.print(donation.getRec_time());%></font>
                           
                           <div class="form-group form-button">
                                <input type="submit" name="confrim_donation" id="confirm_donation" class="form-submit" value="CONFIRM"/>
                            </div>
                           <input type="hidden" value="<%=donation_id%>" name="donation_id">
                           <%System.out.println("jsp:"+donation.getDonoremail());%>
                           <input type="hidden" value="<%=donation.getDonoremail()%>" name="donor_email">
                        </form>
                    </div>
                    <div class="signup-image">
                        <figure><img src="images/small.jpg  " alt="sing up image"></figure>
                        
                    </div>
                </div>
            </div>
        </section>
    </div>
       

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main_enteramount.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>