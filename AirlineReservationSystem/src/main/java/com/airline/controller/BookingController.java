package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dto.AirportDTO;
import com.airline.dto.BookingInformationDTO;
import com.airline.service.AirlineServiceImpl;

@Controller
public class BookingController {

		@Autowired
		private AirlineServiceImpl airportService;
		
		@RequestMapping(value = "/bookingm", method = RequestMethod.GET)
		public ModelAndView getlogin(ModelAndView mv) {
			mv.setViewName("BookingAdd");
			return mv;

		}
		
		@RequestMapping(value = "/booking",method = RequestMethod.POST)  
		public ModelAndView addBooking(@ModelAttribute BookingInformationDTO bookingDto) {   
			boolean resp=false;
			if(null!=bookingDto.getCustemail() && !bookingDto.getCustemail().isEmpty() && null!=bookingDto.getClassType() && !bookingDto.getClassType().isEmpty() 
					&& null!=bookingDto.getPaymentMode() && !bookingDto.getPaymentMode().isEmpty()) 
			{
				resp=airportService.booking(bookingDto);
			}

			if(resp) {	      	    
				return new ModelAndView("UserHomepage","message","Added"); 
			}
			else {	        
				return new ModelAndView("BookingAdd","message","Unable to Book a Flight"); 

			}
		}
}
