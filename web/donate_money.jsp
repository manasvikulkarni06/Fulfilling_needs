<!DOCTYPE html>
<html lang="en">
<head>
    <%
     String orgid=(String)request.getParameter("orgid");
     %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form </title>

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
                        <h2 class="form-title">DONATE HERE</h2>
                        <form method="POST" class="register-form" id="register-form" action="DonateMoney">
                            <div class="form-group">
                                <label for="Amount"></label>
                                <input type="number" name="amount" id="amount" placeholder="Donation Amount" required/>
                            </div>
                            <input type="hidden" name="orgid" value="<%=orgid%>">
                           <div class="form-group form-button">
                                <input type="submit" name="pay_amount" id="pay_amount" class="form-submit" value="PAY"/>
                            </div>
                        </form>
                    </div>
                    <div class="signup-image">
                        <figure><img src="images/donation.png" alt="sing up image"></figure>
                        
                    </div>
                </div>
            </div>
        </section>

       

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main_enteramount.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>