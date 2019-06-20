package com.asset.spring;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.asset.jpa.dto.Asset;

import com.asset.services.AssetServiceJPA;
import com.asset.services.AssetServiceJPAimpl;

@Controller
public class AddAssetController {

	@Autowired
	AssetServiceJPA service= new AssetServiceJPAimpl();
	
	@RequestMapping(value="/addassetpage",method=RequestMethod.GET)
	public String getAddAssetPage()
	{
		return "addassetpage";
	}

	@RequestMapping(value="/addassetmvc", method=RequestMethod.POST)
	public String createAsset(HttpServletRequest req,Asset a,@RequestParam("aid") int assetId,@RequestParam("aname") String assetName,@RequestParam("ades") String des ,@RequestParam("aquant") int quantity,@RequestParam("astatus") String status, ModelAndView mv) throws ServletException,IOException 
	{
		
			try {
				
				Asset a1 = new Asset();
				
				a1.setAssetId(assetId);
				a1.setAssetName(assetName);
				a1.setDes(des);
				a1.setQuantity(quantity);
				a1.setStatus(status);
				

				boolean b=service.createAsset(a1);
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
