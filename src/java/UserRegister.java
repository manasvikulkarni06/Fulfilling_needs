/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.UserDAO;
import dto.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GAGAN
 */
@WebServlet(urlPatterns = {"/UserRegister"})
public class UserRegister extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name=request.getParameter("name");
        String userid=request.getParameter("userid");
        String password=request.getParameter("password");
        String contact_no=request.getParameter("contact_no");
        String address=request.getParameter("address");
        String email=request.getParameter("email");
        
        UserBean user=new UserBean();
        user.setName(name);
        user.setUserid(userid);
        user.setPassword(password);
        user.setContact_no(contact_no);
        user.setEmail(email);
        user.setAddress(address);
        
        UserDAO ob=new UserDAO();
        int res=ob.userRegister(user);
        if(res==1)
            response.sendRedirect("login.jsp");
        else
            response.sendRedirect("user_register.jsp");
}
}
