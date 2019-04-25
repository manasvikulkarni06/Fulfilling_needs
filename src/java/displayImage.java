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
@WebServlet(urlPatterns = {"/displayImage"})
public class displayImage extends HttpServlet {

 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
            String email=request.getParameter("email");
           
            
            try
            {
                Connection con=MydbConnection.getDbConnection();
                PreparedStatement pst=con.prepareStatement("Select img1 from organization_details where email=?");
                        pst.setString(1,email);
            
                ResultSet rs=pst.executeQuery();
                while(rs.next())
                {
                 Blob img1=rs.getBlob("img1");
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