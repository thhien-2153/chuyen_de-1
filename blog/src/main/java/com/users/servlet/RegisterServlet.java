package com.users.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.userDaoImpl;
import com.db.db_connect;
import com.entity.users;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {

		try {
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String phoneNum = req.getParameter("phoneNum");
			String password = req.getParameter("password");
			String check = req.getParameter("check");

			users us = new users();
			us.setName(name);
			us.setEmail(email);
			us.setPhoneNum(phoneNum);
			us.setPassword(password);

			HttpSession session = req.getSession();

			if (check != null) {
				userDaoImpl dao = new userDaoImpl(db_connect.getConn());
				boolean f = dao.userRegister(us);

				if (f) 
				{
//					System.out.println("User Register Success...");
					session.setAttribute("succMsg","Registration Successfully.");
					resp.sendRedirect("register.jsp");
				} else {
//					System.out.println("Something wrong on the server.");
					session.setAttribute("failedMsg","Registration Successfully.");
					resp.sendRedirect("register.jsp");
				}
			} else {
//				System.out.println("Please Check Agree & Terms Condition");
				session.setAttribute("failedMsg","Please Check Agree & Terms Condition");
				resp.sendRedirect("register.jsp");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}