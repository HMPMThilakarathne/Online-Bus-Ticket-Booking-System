package com.unregistered.controller; 

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;   
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unregistered.helper.BusDBUtil;


@WebServlet("/UpdateBusServlet" )
public class UpdateBusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String id=request.getParameter("busid");
		String name=request.getParameter("name");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String BNo=request.getParameter("BNo");
		String BType=request.getParameter("BType");
		String seats=request.getParameter("Seats");
		String Password=request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = BusDBUtil.updateBus(id, name, contact, email, BNo, BType, seats, Password);
		
		if(isTrue == true) {
			
//			List<Bus> cusDetails = BusDBUtil.getBusDetails(id);
			request.setAttribute("cusDetails","cusDetails");
			
			RequestDispatcher dis = request.getRequestDispatcher("Profile.jsp");
			dis.forward(request, response);
		}
		else {
//			List<Bus> cusDetails = BusDBUtil.getBusDetails(id);
			request.setAttribute("cusDetails","cusDetails");
			
			RequestDispatcher dis = request.getRequestDispatcher("Profile.jsp");
			dis.forward(request, response);
		}
	} 

}
