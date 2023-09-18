package com.users.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDaoImpl;
import com.db.db_connect;
import com.entity.users;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String phoneNum = req.getParameter("phoneNum");
            String password = req.getParameter("password");
            String check = req.getParameter("check");

            users user = new users();
            user.setName(name);
            user.setEmail(email);
            user.setPhoneNum(phoneNum);
            user.setPassword(password);

            HttpSession session = req.getSession();

            if (check != null) {
                UserDaoImpl dao = new UserDaoImpl(db_connect.getConnection());
                boolean success = dao.userRegister(user);

                if (success) {
                    session.setAttribute("succMsg", "Registration Successfully.");
                    resp.sendRedirect("index.jsp");
                    return;
                } else {
                    session.setAttribute("failedMsg", "Registration Failed.");
                    resp.sendRedirect("register.jsp");
                    return;
                }
            } else {
                session.setAttribute("failedMsg", "Please Check Agree & Terms Condition");
                resp.sendRedirect("register.jsp");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}