package com.hbms.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hbms.dto.Hotel;
import com.hbms.service.ImplService;

@WebServlet("/listhotel")
public class ListHotelsController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		ImplService impl=new ImplService();
		List<Hotel> list=impl.listHotels();
		PrintWriter out=resp.getWriter();

		if(list!=null)
		{
			out.print("<center><h1>"+"List of Hotels"+"</h1></center>");
			Iterator i=list.iterator();
			while(i.hasNext()) 
			{
				Hotel hotel=(Hotel) i.next();

				if(hotel.getHotelname().equalsIgnoreCase("novotel")) {
					out.println("<a href="+"Novotel.jsp"+"><h1>"+hotel.getHotelname()+"</h1>"+"</a>");
				}
				if(hotel.getHotelname().equalsIgnoreCase("taj")) {
					out.println("<a href="+"Taj.jsp"+"><h1>"+hotel.getHotelname()+"</h1>"+"</a>");
				}
				if(hotel.getHotelname().equalsIgnoreCase("empire")) {					
					out.println("<a href="+"Empire.jsp"+"><h1>"+hotel.getHotelname()+"</h1>"+"</a>");
				}

			}
		}
		else {
			out.print("hotel not shown");

		}
	}

}


