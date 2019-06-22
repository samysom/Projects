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

import com.library.project.dto.BookInventory;
import com.library.project.dto.BookRegistration;
import com.library.project.service.*;
@WebServlet("/regn")
public class RegistrationController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String bookname = req.getParameter("book_name");
		
		BookInventory b=new BookInventory();
		LibraryService bts = new LibraryServiceImpl();
		b = bts.registration(bookname);
		if(b!=null) {
			out.print("<h1 style='color:darkorange; float:right;'>"+"Book is available in the inventory"+"</h1>");
			HttpSession session=req.getSession();
			req.setAttribute("book",b);
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Registration.jsp");
			dis.include(req, resp);
		}else {
			out.print("<h1 style='color:darkorange; float:right;'>"+"Book is not available in the inventory"+"</h1>");
			resp.sendRedirect("/WEB-INF/Views/Registration.jsp");
		}

	}

}
