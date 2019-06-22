package com.library.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.project.service.*;
@WebServlet("/deleteinv")
public class DeleteInventory extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String bookid=req.getParameter("id");


		LibraryService dbs=new LibraryServiceImpl();
		boolean b3=dbs.deleteInventory(bookid);
		if(b3) {
			out.print("<h1 style='color:white'>"+"Deleted Successfully"+"</h1>");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Inventory2.jsp");
			dis.include(req, resp);
		} else {
			out.print("<h1 style='color:white'>"+"Deletion Failed"+"</h1>");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Delete.jsp");
			dis.include(req, resp);
		}

	}

}

