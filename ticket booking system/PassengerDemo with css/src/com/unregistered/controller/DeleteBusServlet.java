package com.unregistered.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unregistered.helper.BusDBUtil;


@WebServlet("/DeleteBus")
public class DeleteBusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("busid");
		boolean isTrue;
		
		isTrue = BusDBUtil.deleteBus(id);
		
		if(isTrue == true) {
			response.sendRedirect(request.getContextPath() + "/BusRegister");
		}
		else {
			response.sendRedirect(request.getContextPath() + "/BusProfile");

		}

}
}
