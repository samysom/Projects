package com.library.project.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.library.project.dto.BookInventoryJPA;
import com.library.project.service.LibraryServiceJPAImpl;

@Controller
//@RequestMapping("/bo")
public class BookListController {
	@Autowired
	LibraryServiceJPAImpl services;
	
	
	
	@RequestMapping(value="/listall2", method=RequestMethod.GET)
	public ModelAndView searchByName(HttpServletRequest req, ModelAndView mv) {
		
		
		
		List<BookInventoryJPA> book = services.listBooks1();
		List<BookInventoryJPA>l1=new ArrayList<BookInventoryJPA>();
		HttpSession session=req.getSession();
		if(book!=null)
		{
			System.out.println("Entered");

			 for(int i = 0; i < book.size(); i++) {
	        	 BookInventoryJPA book1=new BookInventoryJPA();
	                book1 = book.get(i);
			
			
	                l1.add(book1);
			System.out.println(book1);
			 }
			 req.setAttribute("list",l1); 
			mv.setViewName("Inventory1");
			
		}else {
			//out.println("<h1 "+"Book can not entered into the inventory");
			mv.setViewName("Inventory1");
		}
		return mv;
	}
	
}
