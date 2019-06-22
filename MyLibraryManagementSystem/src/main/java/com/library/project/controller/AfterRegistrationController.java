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

import com.library.project.dto.BookRegistration;
import com.library.project.service.*;
@WebServlet("/afterregn")
public class AfterRegistrationController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		PrintWriter out = resp.getWriter();
		String regnid = req.getParameter("registration_id");
		String bookid = req.getParameter("book_id");
		String userid = req.getParameter("user_id");
		String regndate = req.getParameter("registrationdate");
		
		BookRegistration bt = new BookRegistration();
		bt.setRegistrationId(regnid);
		bt.setBookId(bookid);
		bt.setUserId(userid);
		try {
			
			
			bt.setRegistrationDate(sdf.parse(regndate));

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		LibraryService bts = new LibraryServiceImpl();
		boolean result= bts.afterRegistration(bt);
		if(result) {
			out.print("<h1 style='color:white'><center>"+"BookRegistration Successfully completed"+"</center></h1>");
			RequestDispatcher dis= req.getRequestDispatcher("/WEB-INF/Views/StudentHome2.jsp");
			dis.include(req, resp);
		}else {
			out.print("<h1 style='color: darkorange'><center>"+"BookRegistration failed"+"</center></h1>");
			resp.sendRedirect("/WEB-INF/Views/AfterRegistration.jsp");
		}

	}

}
