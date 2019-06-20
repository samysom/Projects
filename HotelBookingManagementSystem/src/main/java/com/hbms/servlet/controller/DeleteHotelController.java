package com.hbms.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hbms.service.ImplService;


@WebServlet("/deletehotel")
public class DeleteHotelController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		ImplService impl=new ImplService();
		PrintWriter out=resp.getWriter();

		String hotelId=req.getParameter("hotelid");


		boolean res=impl.deleteHotel(hotelId);

		if(res)
		{
			out.println("Hotel deleted successfully");
		}
		else
		{
			out.println("Something went wrong");
		}


	}
}
