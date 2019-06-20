package com.airline.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/delete")
public class UserDeleteController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		String username = req.getParameter("username");

		AirlineServiceImplJDBC service=new AirlineServiceImplJDBC();
		boolean result=service.deleteUser(username);

		HttpSession session=req.getSession(false);

		if(session!=null)
		{	
			if(result!=false)
			{
				resp.getWriter().print("<h1>"+"Deleted Succesfully"+"</h1>");
				resp.sendRedirect("./AdminHomePage.jsp");
			}
		}
		else 
		{
			resp.getWriter().print("<h1>"+"Login First"+"</h1>");
			resp.sendRedirect("./UserDelete.jsp");
		}
	}
}


