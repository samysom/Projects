package com.university.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.university.dto.ProgramsOffered;
import com.university.service.UniversityServiceImpl;

@WebServlet("/progofferedlist")
public class ProgramOfferedList extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		UniversityServiceImpl service=new UniversityServiceImpl();
        ProgramsOffered prog=new ProgramsOffered();
        
        List<ProgramsOffered> li=service.listAllPrograms();
		if(li!=null)
		{
			out.print(li);
		}
		else
		{
			out.print("<h1>"+"something went wrong"+"</h1>");
		}
		
	}
	
	

}
