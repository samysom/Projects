package com.library.project.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.library.project.dto.BookTransactionJPA;
import com.library.project.service.LibraryServiceJPAImpl;

@Controller
//@RequestMapping("/is")
public class IssueTransactionController {

	@Autowired
	LibraryServiceJPAImpl services;
	
	@GetMapping(value="/issuetransaction")
	public ModelAndView addPage(ModelAndView mv) {
		mv.setViewName("Issue1");
		return mv;
	}

	@RequestMapping(value="/issuetransaction1", method=RequestMethod.POST)
	public ModelAndView issue(HttpServletRequest req,

			@RequestParam("transaction_id") String id,
			@RequestParam("registration_id") String regnid,
			@RequestParam("issue_date") String d1,
			@RequestParam("return_date") String d2,
			@RequestParam("fine") String fine,
			
			
			BookTransactionJPA b, ModelAndView mv) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		double f1=Double.parseDouble(fine);
		try {
		b.setTransactionId(id);
		b.setRegistrationId(regnid);
		b.setIssueDate(sdf.parse(d1));
		b.setReturnDate(sdf.parse(d2));
		b.setFine(f1);}
		catch(Exception e) {
			e.printStackTrace();
		}
		String msg=null;
		boolean book = services.issueTransaction1(b);
		if(book) {
			System.out.println("added");
			msg="Book Transaction details are successfully added";
			mv.setViewName("Transaction3");
			
		}else {
			msg="Book Transaction details can not add correctly";
			mv.setViewName("Issue1");
		}
		mv.addObject("Success", msg);
		return mv;
	}
}
