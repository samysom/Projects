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

import com.library.project.dto.BookInventory;
import com.library.project.service.LibraryServiceImpl;
import com.library.project.service.LibraryServiceJPAImpl;

@Controller
//@RequestMapping("/up")
public class UpdateInventoryController {
	@Autowired
	LibraryServiceJPAImpl services;

	@GetMapping(value="/update11")
	public ModelAndView addPage(ModelAndView mv) {
		mv.setViewName("Update1");
		return mv;
	}

	@RequestMapping(value="/update12", method=RequestMethod.POST)
	public ModelAndView update(HttpServletResponse resp,BookInventory b, ModelAndView mv, @RequestParam("book_name") String name, @RequestParam("book_id") String id) {
		PrintWriter out=null;
		try {
			out= resp.getWriter();
		} catch (IOException e) {	
			e.printStackTrace();
		}
		String msg=null;
		boolean book = services.updateInventory1(name, id);
		if(book) {
			msg="Book is updated successfully";
			mv.setViewName("Inv");

		}else {
			msg="Book is not updated";
			
			mv.setViewName("Update1");
		}
		mv.addObject("Success", msg);
		return mv;
	}
}
