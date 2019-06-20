package com.airline.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.dto.UsersDTO;
import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/create")
public class UserCreateController extends HttpServlet  
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String role=req.getParameter("role");
		long mobileno=Long.parseLong(req.getParameter("mobileno"));

		UsersDTO userDTO=new UsersDTO();

		userDTO.setUserName(username);
		userDTO.setPassword(password);
		userDTO.setMobileNo(mobileno);
		userDTO.setRole(role);
		
		AirlineServiceImplJDBC service = new AirlineServiceImplJDBC();
		Boolean result= service.createUser(userDTO);
		
		if(result==true)
		{
			resp.getWriter().print("<h1>"+"Created Succesfully"+"</h1>");
			resp.sendRedirect("Login.jsp");
		}
		else
		{
			resp.getWriter().print("<h1>"+"Try Again"+"</h1>");
			resp.sendRedirect("UserCreate.jsp");
		}
	}
}
