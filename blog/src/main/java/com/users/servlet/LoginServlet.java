//package com.users.servlet;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import com.DAO.userDaoImpl;
//import com.db.db_connect;
//import com.entity.users;
//
//@WebServlet("/login")
//public class LoginServlet extends HttpServlet {
//
//    private static final long serialVersionUID = 1L;
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            userDaoImpl dao = new userDaoImpl(db_connect.getConn());
//            HttpSession session = request.getSession();
//
//            String email = request.getParameter("email");
//            String password = request.getParameter("password");
//
//            if ("thaolt.21it@vku.udn.vn".equals(email) && "admin".equals(password)) {
//                users user = new users();
//                session.setAttribute("userobj", user);
//                response.sendRedirect("admin/home.jsp");
//            } else {
//                users user = dao.login(email, password);
//                if (user != null) {
//                    session.setAttribute("userobj", user);
//                    response.sendRedirect("home.jsp");
//                } else {
//                    session.setAttribute("fail", "Invalid email and password");
//                    response.sendRedirect("login.jsp");
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}