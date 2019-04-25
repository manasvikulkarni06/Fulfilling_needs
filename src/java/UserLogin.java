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
import javax.servlet.http.HttpSession;

/**
 *
 * @author GAGAN
 */
@WebServlet(urlPatterns = {"/UserLogin"})
public class UserLogin extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
        
        String userid=request.getParameter("userid");
        String password=request.getParameter("password");
        
        UserBean user=new UserBean();
        user.setUserid(userid);
        user.setPassword(password);
        
        UserDAO ob=new UserDAO();
        int res=ob.isUserValid(user);
        
        if(res==1)
        {
            HttpSession session=request.getSession();
            session.setAttribute("userid",userid);
            response.sendRedirect("welcome_user.jsp");
        }
        else
            response.sendRedirect("login.jsp");
        }
    }


