package com.library.project.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.library.project.service.LibraryServiceJPAImpl;

@Controller
//@RequestMapping("/de")
public class DeleteInventoryController {
	
	@Autowired
	LibraryServiceJPAImpl services;
	
	
	@GetMapping(value="/delete11")
	public ModelAndView addPage(ModelAndView mv) {
		mv.setViewName("Delete1");
		return mv;
	}

	@RequestMapping(value="/delete12", method=RequestMethod.POST)
	public ModelAndView update( ModelAndView mv, @RequestParam("book_id") String id) {
		String msg=null;
		boolean book = services.deleteInventory1(id);
		if(book) {
			msg="Book is deleted successfully";
			mv.setViewName("Inv");
			
		}else {
			msg="Book is not deleted";
			mv.setViewName("Delete1");
		}
		mv.addObject("Success", msg);
		return mv;
	}
}
