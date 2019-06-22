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

@WebServlet("/updateinv")
public class UpdateInventory extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String bookName=req.getParameter("book_name");
		String bId=req.getParameter("book_id");


		LibraryService mbs=new LibraryServiceImpl();
		boolean b4=mbs.updateInventory(bookName,bId);

		if(b4==true) {
			out.print("<h1 style='color:white'>"+"Successfully Modified"+"</h1>");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Inventory2.jsp");
			dis.include(req, resp);
		} else {
			out.print("<h1 style='color:orange'>"+"Modification Failed"+"</h1>");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Update.jsp");
			dis.include(req, resp);
		}





	}

}
