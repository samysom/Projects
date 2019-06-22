package com.library.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.library.project.dto.BookTransaction;
import com.library.project.service.*;
@WebServlet("/return")
public class ReturnController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		String transid = req.getParameter("tranid");
		String regnid = req.getParameter("regnid");
		
		BookTransaction bt = new BookTransaction();
		bt.setTransactionId(transid);
		bt.setRegistrationId(regnid);
		
		LibraryService bts = new LibraryServiceImpl();
		List<BookTransaction> list= bts.returnTransaction(transid,regnid);
		if(list!=null)
		{
			System.out.println("Entered");


			for(int i=0;i<list.size();i++)
			{
				bt=list.get(i);
				out.println("<h2>Fine is :"+bt.getFine()+"</h2>");
				RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Transaction2.jsp");
				dis.include(req, resp);

			}
		}else {
			out.print("<h1>"+"BookTransaction failed");
			resp.sendRedirect("/WEB-INF/Views/Return.jsp");
		}

	}

}
