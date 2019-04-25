/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.PreparedStatement;
import dao.AdminDAO;
import dao.OrgDAO;
import db.MydbConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GAGAN
 */
@WebServlet(urlPatterns = {"/ConfirmDonation"})
public class ConfirmDonation extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        AdminDAO admin=new AdminDAO();
        int donation_id=Integer.parseInt(request.getParameter("donation_id"));
        String donor_email=request.getParameter("donor_email");
        System.out.println(donor_email);
        admin.sendMail(donor_email);
        try
        {
            Connection con=MydbConnection.getDbConnection();
            java.sql.PreparedStatement pst=con.prepareStatement("Update donation_details set status=? where donation_id=?");
            pst.setBoolean(1, true);
            pst.setInt(2,donation_id);
            int count=pst.executeUpdate();
            
            if(count>0)
                response.sendRedirect("thankyou.jsp");
            else
                response.sendRedirect("confirm_donation.jsp");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
