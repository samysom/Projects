package com.library.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.project.dto.BookTransaction;
import com.library.project.service.*;
@WebServlet("/issue")
public class IssueController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		PrintWriter out = resp.getWriter();
		String tranid = req.getParameter("transaction_id");
		String regnid = req.getParameter("registration_id");
		String issuedate = req.getParameter("issue_date");
		String returndate = req.getParameter("return_date");
		String fine=req.getParameter("fine");

		double fine1= Double.parseDouble(fine);
		BookTransaction bt = new BookTransaction();
		bt.setTransactionId(tranid);
		bt.setRegistrationId(regnid);
		try {
		
			bt.setIssueDate(sdf.parse(issuedate));

			bt.setReturnDate(sdf.parse(returndate));
			bt.setFine(fine1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		LibraryService bts = new LibraryServiceImpl();
		boolean result= bts.issueTransaction(bt);
		if(result==true) {
			out.print("<h1 Style='color:white'>"+"BookTransaction Successfully completed");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Transaction2.jsp");
			dis.include(req, resp);
		}else {
			out.print("<h1 style='color:darkorange'>"+"BookTransaction failed");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/Issue.jsp");
			dis.include(req, resp);
		}

	}

}
