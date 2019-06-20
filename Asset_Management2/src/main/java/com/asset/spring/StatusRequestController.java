package com.asset.spring;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.asset.jpa.dto.Asset;
import com.asset.jpa.dto.AssetRequest;
import com.asset.services.AssetServiceJPA;
import com.asset.services.AssetServiceJPAimpl;
@Controller
public class StatusRequestController {

	@Autowired

	
	AssetServiceJPAimpl ser;
	AssetServiceJPA service= new AssetServiceJPAimpl();
	
	@PostMapping("/statusrequestlog")
	public String statusRequest(HttpServletRequest req)
	{
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			List<Asset> list = service.statusRequest();
			if(list!=null)
			{
				session.setAttribute("statusdatalist", list);
				return "statusrequestpage";
			}
			else
			{
				return "adminpagee";
			}
		}
		return "loginpage";
		
	}
	
	
}
