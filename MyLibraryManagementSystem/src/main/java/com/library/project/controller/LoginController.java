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
import com.library.project.service.LibraryService;
import com.library.project.service.LibraryServiceImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet{

	User b=null;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String id = req.getParameter("user_id");
		String pass = req.getParameter("password");
		String role = req.getParameter("role");

		LibraryService ls=new LibraryServiceImpl();
		b=ls.login(id,pass,role);
		System.out.println("Executed object");

		if(b!=null){
			HttpSession session=req.getSession();	
			System.out.println("Executed not null");
			if(role.equals("Librarian"))
			{    
				req.setAttribute("user",b);
			
				
				RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/LibraryHome.jsp");
				dis.include(req, resp);
			}
			else if(role.equals("Student")) {
				System.out.println("Executed Student role");
				req.setAttribute("user",b);
			
				RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/StudentHome.jsp");
				dis.include(req, resp);
		
			}
			else {
				resp.sendRedirect("/WEB-INF/Views/Login1.jsp");
			}
		}
		else{
			resp.sendRedirect("/WEB-INF/Views/Login1.jsp");
		}

	}
}


