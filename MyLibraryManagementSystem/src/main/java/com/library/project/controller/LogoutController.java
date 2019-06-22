package com.library.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	HttpSession session=req.getSession(false);
	if(session!=null)
	{
		session.invalidate();
		Cookie[] c =req.getCookies();
		for(Cookie cookie: c)
		{
			if(cookie.getName().equalsIgnoreCase("JSESSIONID"))
			{
				cookie.setMaxAge(0);
				resp.addCookie(cookie);
				break;
			}
		}
		out.print("<h1>"+"Logged Out"+"</h1>");
		RequestDispatcher dis = req.getRequestDispatcher("/login1");
		dis.include(req, resp);
	}else {
		out.print("<h1>"+"Login First"+"</h1>");
		RequestDispatcher dis = req.getRequestDispatcher("./login1");
		dis.include(req, resp);
	}

}

}

