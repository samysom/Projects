package com.hbms.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hbms.service.ImplService;


@WebServlet("/deleteroom")
public class DeleteRoomController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		ImplService impl = new ImplService();
		PrintWriter out=resp.getWriter();

		String roomid=req.getParameter("roomid");

		boolean res=impl.deleteRoom(roomid);
		if(res)
		{
			out.println("Room deleted successfully");
		}else
		{
			out.println("Something went wrong");
		}
	}
}

