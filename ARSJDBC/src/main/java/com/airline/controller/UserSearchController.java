package com.airline.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airline.dto.UsersDTO;
import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/searchUser")
public class UserSearchController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");

		String username = req.getParameter("username");

		AirlineServiceImplJDBC service = new AirlineServiceImplJDBC();
		UsersDTO UsersDTO1 = service.searchUser(username);
		
		HttpSession session = req.getSession(false);

		if(session!=null)
		{
			if(UsersDTO1!=null)
			{
				session.setAttribute("user",UsersDTO1);
				resp.sendRedirect("./ShowUser.jsp");
			}
			else
			{
				resp.sendRedirect("./UserSearch.jsp");
			}
		}
	}
}
