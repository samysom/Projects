package com.library.project.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.library.project.dto.User;
import com.library.project.service.*;

@WebServlet("/create")
public class CreateController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String uid=req.getParameter("user_id");
		String name=req.getParameter("user_name");
		String pass=req.getParameter("password");
		String email=req.getParameter("email");
		String role=req.getParameter("role");

		LibraryService lib= new LibraryServiceImpl();
		
		User us=new User();

		us.setUserId(uid);
		us.setUserName(name);
		
		us.setPassword(pass);
		us.setEmail(email);
		us.setRole(role);

		System.out.println("process");
		boolean b=lib.createUser(us);
		System.out.println("process1");
		if(b) { 
			out.println("<h1 style='color:orange'><center>"+"Successfully created"+"</center></h1>");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Start.jsp");
			dis.include(req, resp);
			
			
		} else {
			out.println("<h1 >"+"Can not created"+"</h1>");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/CreateUser.jsp");
			dis.include(req, resp);
		}
	}  
}

