package com.university.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebFault;

import com.university.dto.User;
import com.university.service.UniversityServiceImpl;

@WebServlet("/loginservlet")
public class LoginController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String role=req.getParameter("role");
		UniversityServiceImpl service=new UniversityServiceImpl();
		User us=service.login(username, password, role);
		
	
		
		if(us==null){
			resp.sendRedirect("./login.jsp");
		}
		
		if(us!=null)
		{
			HttpSession session=req.getSession();  
		if(us.getRole().equals("admin"))        
		{
			session.setAttribute("admin", us);   
            resp.sendRedirect("./admin.jsp");		  
		}
		
		else if(us.getRole().equals("mac")) {
			
			session.setAttribute("member", us);
			resp.sendRedirect("./member.jsp");   
			
		}
			
		}  
		
		
		
		
		
		
	}

}
