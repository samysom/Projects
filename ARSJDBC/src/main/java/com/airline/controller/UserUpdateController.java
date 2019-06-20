package com.airline.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.dto.UsersDTO;
import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/update")
public class UserUpdateController extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String role=req.getParameter("role");
		
		int mobileno = Integer.parseInt(req.getParameter("mobileno"));

		UsersDTO userDTO = new UsersDTO();
		
		userDTO.setUserName(username);
		userDTO.setPassword(password);
		userDTO.setRole(role);
		userDTO.setMobileNo(mobileno);

		AirlineServiceImplJDBC service =new AirlineServiceImplJDBC();
		UsersDTO user=service.updateUser(userDTO);
		
		if(user!=null)
		{
			if(user.getRole().equals("admin"))
			{
				resp.getWriter().print("Updated Succesfully");
				resp.sendRedirect("./AdminHomePage.jsp");
			}
			else if(user.getRole().equals("AirportExecutive"))
			{
				resp.getWriter().print("Updated Succesfully");
				resp.sendRedirect("./AirportExecutive.jsp");	
			}
			else 
			{
				resp.getWriter().print("Updated Succesfully");
				resp.sendRedirect("./UserHomepage.jsp");
			}
		}
		else
		{
			resp.getWriter().print("Update Faild");
			resp.sendRedirect("./UserUpdate.jps");
		}
	}
}






