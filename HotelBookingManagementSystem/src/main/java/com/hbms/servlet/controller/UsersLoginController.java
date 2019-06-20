package com.hbms.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hbms.dto.Users;
import com.hbms.service.ImplService;


@WebServlet("/login")
public class UsersLoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		ImplService impl = new ImplService();
		PrintWriter out=resp.getWriter();


		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String role=req.getParameter("role");

		Users us=new Users();
		us.setUsername(username);
		us.setPassword(password);
		us.setRole(role);


		Users us2=impl.usersLogin( username,password, role);
		HttpSession httpSession;
		
		if(us2 !=null)
		{

			if(us.getRole().equalsIgnoreCase("admin"))
			{

				httpSession =req.getSession();
				resp.sendRedirect("./AdminHomePage.jsp");

			}

			else if(us.getRole().equalsIgnoreCase("employee"))
			{
				httpSession =req.getSession();
				resp.sendRedirect("./UserHomePage.jsp");

			}
			else if(us.getRole().equalsIgnoreCase("user"))
			{
				httpSession =req.getSession();
				resp.sendRedirect("./UserHomePage.jsp");

			}
		}
		else
		{
			out.println("something went wrong");
		}
	}
}

