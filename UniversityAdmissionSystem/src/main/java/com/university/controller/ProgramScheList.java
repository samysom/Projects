package com.university.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.university.dto.ProgramsOffered;
import com.university.dto.ProgramsScheduled;
import com.university.service.UniversityServiceImpl;

@WebServlet("/progschdlist")
public class ProgramScheList extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		UniversityServiceImpl service=new UniversityServiceImpl();
		ProgramsScheduled sche=new ProgramsScheduled();
		
		List<ProgramsScheduled> li=  service.listAllScheduledPrograms();
		
		 if(li!=null)
	 		{
	        	HttpSession session=req.getSession(false);
	        	session.setAttribute("listy", li);
	        	resp.sendRedirect("./listoffer_sche.jsp");
	 		}
			else
			{
				out.print("<h1>"+"something went wrong"+"</h1>");
			}		
		
	}

}
