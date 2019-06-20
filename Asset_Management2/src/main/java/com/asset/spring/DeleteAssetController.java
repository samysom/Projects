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

import com.asset.services.AssetServiceJPA;
import com.asset.services.AssetServiceJPAimpl;

@Controller
public class DeleteAssetController {
	@Autowired
	AssetServiceJPAimpl ser;
	AssetServiceJPA service= new AssetServiceJPAimpl();
	
	@RequestMapping(value="/deleteassetpage",method=RequestMethod.GET)
	public String getDeleteAssetPage()
	{
		return "deleteassetpage";
	}

	@RequestMapping(value="/deleteassetmvc", method=RequestMethod.POST)
	
	public String deleteAsset(HttpServletResponse resp,@RequestParam("aid")int assetId,
			@RequestParam("aname")String assetName, ModelAndView mv) throws  ServletException,IOException
	{
		try
		{
	
		
			boolean b = service.deleteAsset(assetId, assetName);
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

			