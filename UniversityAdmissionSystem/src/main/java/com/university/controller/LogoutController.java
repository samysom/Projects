package com.university.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logoutservlet")
public class LogoutController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		PrintWriter out=resp.getWriter();
		
		if(session==null) {
			
			resp.sendRedirect("./login.jsp");
		}
		if(session != null) {
			session.invalidate();
			out.print("<h1>"+"YOU HAVE LOGGED OUT"+"</h1>");
			
		}
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(Cookie c: cookies) {
				if(c.getName().equalsIgnoreCase("JSESSIONID")){
					c.setMaxAge(0);
					resp.addCookie(c);
				}
			}
		}
		  
	}
}
