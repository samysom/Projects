package com.library.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.project.dto.BookInventory;
import com.library.project.service.*;

@WebServlet("/addinv")
public class AddInventory extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String bookId=req.getParameter("book_id");
		String bookName=req.getParameter("book_name");
		String author1=req.getParameter("author1");
		String author2=req.getParameter("author2");
		String publish=req.getParameter("publication");
		String yop=req.getParameter("yearofpublication");


		BookInventory b=new BookInventory();
		b.setBookId(bookId);
		b.setBookName(bookName);
		b.setAuthor1(author1);
		b.setAuthor2(author2);
		b.setPublisher(publish);
		b.setYearOfPublication(yop);

		LibraryService ads=new LibraryServiceImpl();

		boolean b2=ads.addInventory(b);

		if(b2==true) {
			out.print("<h1 style='color:white'>"+"Book Successfully Added"+"</h1>");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Inventory2.jsp");
			dis.include(req, resp);
		} else {
			out.print("<h1 style='color:darkred'>"+"Adding Book Failed"+"</h1>");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Add1.jsp");
			dis.include(req, resp);

		}

	}
}
