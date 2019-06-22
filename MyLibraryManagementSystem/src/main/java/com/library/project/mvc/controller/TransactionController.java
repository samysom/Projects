package com.library.project.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.library.project.dto.BookRegistrationJPA;
import com.library.project.service.LibraryServiceJPAImpl;

@Controller

public class TransactionController {

	@Autowired
	LibraryServiceJPAImpl services;

	@RequestMapping(value="/transaction", method=RequestMethod.GET)
	public ModelAndView update(HttpServletRequest req, ModelAndView mv) {
		
		
		List <BookRegistrationJPA> book= services.transaction1();
		List<BookRegistrationJPA> l1=new ArrayList<BookRegistrationJPA>();

		if(book!=null)
		{
			System.out.println("Entered");
			

			 for(int i = 0; i < book.size(); i++) {
				 BookRegistrationJPA books=new BookRegistrationJPA();
	                books = book.get(i);
			
			l1.add(books);
			System.out.println(books);
			 }
			 req.setAttribute("list",l1); 
			mv.setViewName("Transaction1");
			
		}else {
			//out.println("<h1 Style='color:white'>"+"Booking Registration can not shown"+"<br>");
			mv.setViewName("Library");
		}
		return mv;
	}
}



