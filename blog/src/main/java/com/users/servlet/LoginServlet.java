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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            UserDaoImpl dao = new UserDaoImpl(db_connect.getConnection());
            HttpSession session = req.getSession();

            String email = req.getParameter("email");
            String password = req.getParameter("password");

            if ("thaolt.21it@vku.udn.vn".equals(email) && "admin".equals(password)) {
                users adminUser = new users();
                session.setAttribute("userobj", adminUser);
                resp.sendRedirect("admin/home.jsp");
            } else {
                users loggedInUser = dao.login(email, password);
                if (loggedInUser != null) {
                    session.setAttribute("userobj", loggedInUser);
                    resp.sendRedirect("home.jsp");
                } else {
                    req.setAttribute("fail", "Invalid email and password");
                    req.getRequestDispatcher("login.jsp").forward(req, resp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Internal Server Error");
        }
    }
}
