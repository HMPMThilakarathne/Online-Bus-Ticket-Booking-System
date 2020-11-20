package com.unregistered.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.unregistered.helper.LoginDBUtil;
import com.unregistered.model.Bus;

@WebServlet(urlPatterns = { "/", "/Login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String BusNo = request.getParameter("BusNo");
		String password = request.getParameter("password");

		try {
			Bus busDetails = LoginDBUtil.validate(BusNo, password);
			
			if(busDetails != null) {
				HttpSession session = request.getSession();
				System.out.println("Bus ID >> "+busDetails.getBusID());
				session.setAttribute("busID", busDetails.getBusID());
				
				response.sendRedirect(request.getContextPath() + "/BusProfile");

			}else {
				RequestDispatcher dis = request.getRequestDispatcher("No.jsp");
				dis.forward(request, response);	
			}
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher dis = request.getRequestDispatcher("No.jsp");
			dis.forward(request, response);	
		}

//		RequestDispatcher dis = request.getRequestDispatcher("Profile.jsp");
//		dis.forward(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			showLoginForm(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void showLoginForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
		dispatcher.forward(request, response);

	}

}
