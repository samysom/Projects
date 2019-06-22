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
import com.library.project.service.*;

@WebServlet("/listall")
public class BookList extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		resp.setContentType("text/html");
		PrintWriter printWriter=resp.getWriter();
		LibraryService ser=new LibraryServiceImpl();
		List<BookInventory> list=ser.listBooks();
		List<BookInventory>l1=new ArrayList<BookInventory>();
		HttpSession session=req.getSession();
		if(list!=null)
		{
			System.out.println("Entered");

			 for(int i = 0; i < list.size(); i++) {
	        	 BookInventory books=new BookInventory();
	                books = list.get(i);
			
			
	                l1.add(books);
			System.out.println(books);
			 }
			 req.setAttribute("list",l1); 
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Inventory.jsp");
			dis.include(req, resp);
		}
		else
		{
			printWriter.print("<h2 style='color:white;'>"+"Book Inventory not shown"+"</h2>");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/LibraryHome.jsp");
			dis.include(req, resp);
		}



	}

}
