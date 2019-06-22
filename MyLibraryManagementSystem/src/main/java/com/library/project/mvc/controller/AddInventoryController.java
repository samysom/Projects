package com.library.project.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.library.project.dto.BookInventoryJPA;
import com.library.project.service.LibraryServiceJPAImpl;

@Controller
//@RequestMapping("/aaa")
public class AddInventoryController {
	@Autowired
	LibraryServiceJPAImpl services;
	
	@GetMapping("/addll2")
	public ModelAndView addPage(ModelAndView mv) {
		mv= new ModelAndView();
		mv.setViewName("Add11");
		return mv;
	}

	@RequestMapping(value="/addall2", method=RequestMethod.POST)
	public ModelAndView add(HttpServletRequest req,ModelAndView mv,
			@RequestParam("book_id")String id,
			@RequestParam("book_name")String name,
			@RequestParam("author1")String a1,
			@RequestParam("author2")String a2,
			@RequestParam("publisher")String p,
			@RequestParam("yearofpublication")String y,
			BookInventoryJPA b) {
		
		b.setBookId(id);
		b.setBookName(name);
		b.setAuthor1(a1);
		b.setAuthor2(a2);
		b.setPublisher(p);
		b.setYearOfPublication(y);
		HttpSession session= req.getSession();
		
		boolean book = services.addInventory1(b);
		
		//mv.setViewName("Success");
		String msg=null;
		if(book) {
			msg="Book is added successfully";
			System.out.println("book added");
			session.setAttribute("b1", book);
			mv.setViewName("Inv");
			
		}else {
			msg="Book is not added";
			session.setAttribute("b", book);
			mv.setViewName("Add11");
		}
		mv.addObject("Success",msg);
		
		return mv;
	}
}
