package com.airline.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airline.dto.UsersDTO;
import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/listuser")
public class ListAllUsersController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		HttpSession session = req.getSession(false);
		if(session!=null)
		{
			resp.setContentType("text/html");

			AirlineServiceImplJDBC service = new AirlineServiceImplJDBC();
			List<UsersDTO> list = service.listUsers();

			if(list!=null)
			{
				session.setAttribute("list", list);
				RequestDispatcher disp=req.getRequestDispatcher("./ListUser.jsp");
				disp.forward(req, resp);
			}
		}
		else
		{
			resp.sendRedirect("./AdminHomePage.jsp");
		}
	}
}
