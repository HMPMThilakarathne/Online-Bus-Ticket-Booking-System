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

import com.unregistered.helper.BusDBUtil;
import com.unregistered.model.Bus;

@WebServlet(urlPatterns = { "/BusRegister", "/UpdateBus" })
public class BusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/BusRegister":
				registerNewBust(request, response);
				break;
			case "/UpdateBus":
				updateBusDetails(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/BusRegister":
				showRegisterForm(request, response);
				break;
			case "/UpdateBus":
				showBusDetails(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void showRegisterForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("Bus.jsp");
		dispatcher.forward(request, response);

	}

	private void showBusDetails(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String bus_id = String.valueOf(session.getAttribute("busID"));

		Bus b = BusDBUtil.getBusDetails(bus_id);

		RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateBus.jsp");
		request.setAttribute("busDetails", b);

		dispatcher.forward(request, response);
	}

	private void updateBusDetails(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("busid");
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		String BNo = request.getParameter("BNo");
		String BType = request.getParameter("BType");
		String seats = request.getParameter("seats");
		String Password = request.getParameter("password");

		boolean isTrue;

		isTrue = BusDBUtil.updateBus(id, name, contact, email, BNo, BType, seats, Password);

		if (isTrue == true) {

			response.sendRedirect(request.getContextPath() + "/BusProfile");

		} else {
			response.sendRedirect(request.getContextPath() + "/UpdateBus");

		}

	}

	private void registerNewBust(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ownerName = request.getParameter("owner");
		String contactNo = request.getParameter("contact");
		String ownerEmail = request.getParameter("email");
		String BusNo = request.getParameter("BNo");
		String BType = request.getParameter("type");
		String NoOfSeats = request.getParameter("seats");
		String password = request.getParameter("pwd");

		boolean isTrue;

		isTrue = BusDBUtil.insertdetails(ownerName, contactNo, ownerEmail, BusNo, BType, NoOfSeats, password);

		if (isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("Yes.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis1 = request.getRequestDispatcher("No.jsp");
			dis1.forward(request, response);
		}

	}

}
