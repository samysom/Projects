package com.asset.spring;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.asset.jpa.dto.Asset;
import com.asset.services.AssetServiceJPA;
import com.asset.services.AssetServiceJPAimpl;
@Controller
public class ViewAllocatedAssetController {

	@Autowired
	AssetServiceJPAimpl ser;
	AssetServiceJPA service= new AssetServiceJPAimpl();
	
	@PostMapping("/viewallocatedassetpagee")
	public String fetchAllocatedAsset(HttpServletRequest req)
	{
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			List<Asset> list = service.fetchAllocatedAsset();
			if(list!=null)
			{
				session.setAttribute("datalist", list);
				return "viewallocatedassetpage";
			}
			else
			{
				return "adminpagee";
			}
		}
		return "loginpage";
		
	}
	
	
}
