package com.asset.spring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.asset.jpa.dto.User;

import com.asset.services.AssetServiceJPA;
import com.asset.services.AssetServiceJPAimpl;

@Controller
public class UpdateUserController {

	@Autowired
	AssetServiceJPAimpl ser;
	AssetServiceJPA service= new AssetServiceJPAimpl();
	
	@RequestMapping(value="/updateuserpage",method=RequestMethod.GET)
	public ModelAndView getUpdateUserPage(ModelAndView mv)
	{
		mv.setViewName("updateuserpage");
		return mv;
	}


	@RequestMapping(value="/updateusermvc", method=RequestMethod.POST)
	public String updateUser(HttpServletResponse resp,@RequestParam("uid") int userId,
			@RequestParam("uname") String userName,@RequestParam("upass") String password,
			@RequestParam("utype") String usertype, ModelAndView mv) throws ServletException,IOException {
		
		try {
			

			
				User u=new User();
			 	u.setUserId(userId);
			 	u.setUserName(userName);
			 	u.setPassword(password);
			 	u.setUsertype(usertype);
			 	
				
				boolean b=service.updateUser(u);
				if(b==true)
				{
					return "Success";
				}
				else
				{
					return  "Failed";
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		return null;
	}

	}

