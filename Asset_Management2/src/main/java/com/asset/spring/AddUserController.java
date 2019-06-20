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

import com.asset.jpa.dto.Asset;
import com.asset.jpa.dto.User;

import com.asset.services.AssetServiceJPA;
import com.asset.services.AssetServiceJPAimpl;

@Controller
public class AddUserController {
	

	@Autowired
	AssetServiceJPA service= new AssetServiceJPAimpl();
	
	@RequestMapping(value="/adduserpage",method=RequestMethod.GET)
	public String getAddUserPage()
	{
		return "adduserpage";
	}

	@RequestMapping(value="/addusermvc", method=RequestMethod.POST)
	public String createAsset(HttpServletResponse resp,User u,@RequestParam("uid") int userId,@RequestParam("uname") String userName,@RequestParam("upass") String password ,@RequestParam("utype") String usertype, ModelAndView mv) throws ServletException,IOException
	{
		
		try {
			
			User u1 = new User();
			
			u1.setUserId(userId);
			u1.setUserName(userName);
			u1.setPassword(password);
			u1.setUsertype(usertype);
			

			boolean b=service.createUser(u1);
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

				