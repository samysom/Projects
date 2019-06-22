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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.library.project.dto.BookInventoryJPA;
import com.library.project.dto.BookTransactionJPA;
import com.library.project.service.LibraryServiceJPAImpl;

@Controller
//@RequestMapping("/ret")
public class ReturnTransactionController {

	@Autowired
	LibraryServiceJPAImpl services;

	@GetMapping(value="/returntransaction")
	public ModelAndView addPage(ModelAndView mv) {
		mv.setViewName("Return1");
		return mv;
	}

	
	@RequestMapping(value="/returntransaction1",method=RequestMethod.POST)
	public ModelAndView issue(HttpServletRequest req, ModelAndView mv, @RequestParam("transaction_id") String tranid, @RequestParam("registraton_id") String id) {
		
		BookTransactionJPA book = services.returnTransaction1(tranid,id);
		
		double f=0.0;
		if(book!=null)
		{
			System.out.println("Entered");    
	        f=book.getFine();
			mv.addObject("Success", f);
			mv.setViewName("Transaction3");

		}else {
			

			mv.setViewName("Return1");
		}
		return mv;
	}
}
