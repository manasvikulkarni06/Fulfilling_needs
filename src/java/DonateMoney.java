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
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author GAGAN
 */
@WebServlet(urlPatterns = {"/DonateMoney"})
public class DonateMoney extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            PrintWriter pw=response.getWriter();
            HttpSession session=request.getSession();
            Random num=new Random();
            int donation_id=num.nextInt();
            int amount=Integer.parseInt(request.getParameter("amount"));
            String userid=(String)session.getAttribute("userid");
            String orgid=(String)request.getParameter("orgid");
            LocalDate date=java.time.LocalDate.now();
            LocalTime time=java.time.LocalTime.now();
            String commodity="Monetary";
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
        donation.setImg(null);
        donation.setDate(date);
        donation.setTime(time);
        donation.setCommodity(commodity);
        donation.setDonation_id(donation_id);
        donation.setAmount(amount);
        donation.setDonorno(ob.getContact_no());
       int res=user.setMoneyDonation(donation);
       if(res==1)
       {
           session.setAttribute("donation_id",donation_id);
           response.sendRedirect("payuform.jsp");
       }
       else
           response.sendRedirect("org_profile.jsp");
                
    }

   
}
