/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import db.MydbConnection;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GAGAN
 */
@WebServlet(urlPatterns = {"/GetDonationImage"})
public class GetDonationImage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
            String donation_id=request.getParameter("donation_id");
           System.out.println(donation_id);
            
            try
            {
                Connection con=MydbConnection.getDbConnection();
                PreparedStatement pst=con.prepareStatement("Select com_img from donation_details where donation_id=?");
                pst.setString(1,donation_id);
            
                ResultSet rs=pst.executeQuery();
                while(rs.next())
                {
                 Blob img1=rs.getBlob("com_img");
                 byte img_data[]=img1.getBytes(1,(int)img1.length());   
                 response.setContentType("image/gif");   
                 OutputStream out=response.getOutputStream();
                 out.write(img_data);
                 out.flush();
                 out.close();
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
}