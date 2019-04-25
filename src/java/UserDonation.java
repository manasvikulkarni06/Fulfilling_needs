/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.OrgDAO;
import dao.UserDAO;
import dto.DonationsBean;
import dto.OrgBean;
import dto.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import java.lang.IllegalAccessException;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author GAGAN
 */
@WebServlet(urlPatterns = {"/UserDonation"})
@MultipartConfig
public class UserDonation extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, IllegalArgumentException {
        
        HttpSession session=request.getSession();
        Random num=new Random();
        int donation_id=num.nextInt();
        Part com_img=request.getPart("com_img");
        String rec_date=request.getParameter("rec_date");
        String rec_time=request.getParameter("rec_time");
        String userid=(String)session.getAttribute("userid");
        String orgid=request.getParameter("orgid");
        String commodity=request.getParameter("ch");
        DonationsBean donation=new DonationsBean();
        
        UserDAO user=new UserDAO();
        OrgDAO org=new OrgDAO();
        UserBean ob= user.getUserDetails(userid);
        OrgBean obj= org.getOrgDetails(orgid);
        
        donation.setDonorid(userid);
        donation.setDonorname(ob.getName());
        donation.setDonoremail(ob.getEmail());
        donation.setOrgid(orgid);
        donation.setOrgname(obj.getName());
        donation.setImg(com_img);
        donation.setRec_date(rec_date);
        donation.setRec_time(rec_time);
        donation.setCommodity(commodity);
        donation.setDonation_id(donation_id);
        donation.setDonorno(ob.getContact_no());
       
        try
        {
       int res=user.setDonationDetails(donation);
       if(res==1)
       {
           session.setAttribute("donation_id",donation_id);
           response.sendRedirect("confirm_donation.jsp");
       }
       else
           response.sendRedirect("welcome_user");
        
        }
        catch(Exception e)
        {
           request.setAttribute("res","Please enter details in required format");
            RequestDispatcher rd=request.getRequestDispatcher("welcome_user.jsp");
            rd.forward(request,response);
        }
        }


}
