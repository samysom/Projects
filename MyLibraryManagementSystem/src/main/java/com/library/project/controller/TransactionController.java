package com.library.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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

@WebServlet("/tran")
public class TransactionController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();

		
		LibraryService ser=new LibraryServiceImpl();
		List<BookRegistration> list=ser.transaction();
		List<BookRegistration> l1=new ArrayList<BookRegistration>();

		if(list!=null)
		{
			System.out.println("Entered");
			

			 for(int i = 0; i < list.size(); i++) {
				 BookRegistration books=new BookRegistration();
	                books = list.get(i);
			
			
	                l1.add(books);
			System.out.println(books);
			 }
			 req.setAttribute("list",l1); 
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Transaction.jsp");
			dis.include(req, resp);
		
		}
		else
		{
			out.print("<h1 Style='color:white'>"+"Booking Registration can not shown"+"<br>");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/LibraryHome.jsp");
			dis.include(req, resp);

		}



	}

}
