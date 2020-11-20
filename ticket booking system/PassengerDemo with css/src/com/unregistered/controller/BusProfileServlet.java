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

@WebServlet("/BusProfile")
public class BusProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
				showBusDetails(request, response);
		

	}

	private void showBusDetails(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String bus_id = String.valueOf(session.getAttribute("busID"));

		Bus b = BusDBUtil.getBusDetails(bus_id);
		System.out.println("Bus No >> " + b.getBusNo());
		System.out.println("No Of Seats >> " + b.getNoOfSeats());

		RequestDispatcher dispatcher = request.getRequestDispatcher("Profile.jsp");
		request.setAttribute("busDetails", b);

		dispatcher.forward(request, response);
	}
}
