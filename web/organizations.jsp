<%@page import="java.util.List"%>
<%@page import="dto.OrgBean"%>
<%@page import="dao.OrgDAO"%>
<!DOCTYPE html>
<html>
	<head>
            <% 
                OrgDAO org=new OrgDAO();
                List<OrgBean>org_list=null;
                org_list=org.getOrganizations();
            %>
		<meta charset="utf-8">
		<title>Donate Money</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- MATERIAL DESIGN ICONIC FONT -->
		<link rel="stylesheet" href="fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">
                <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
		<!-- STYLE CSS -->
                <link rel="stylesheet" href="css/style_organizations.css">
	</head>

	<body>

		<div class="wrapper" style="background-image: url('images/bg-registration-form-2.jpg');">
			<div class="inner">
				
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
                                                        <a href="donate_money.jsp?orgid=<%=obj.getOrgid()%>" class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">
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
		</div>

        </body>
</html>
