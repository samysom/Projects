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
public class UpdateAssetController {
	
	@Autowired
	AssetServiceJPAimpl ser;
	AssetServiceJPA service= new AssetServiceJPAimpl();
	
	@RequestMapping(value="/updateassetpage",method=RequestMethod.GET)
	public ModelAndView getUpdateAssetPage(ModelAndView mv)
	{
		mv.setViewName("updateassetpage");
		return mv;
	}


	@RequestMapping(value="/updateassetmvc", method=RequestMethod.POST)
	public String createAsset(HttpServletResponse resp,@RequestParam("aid") int assetId,@RequestParam("aname") String assetName,@RequestParam("aquant") int quantity,@RequestParam("astatus") String status, ModelAndView mv) throws ServletException,IOException {
		
		
	try
	{
		
		
		Asset u=new Asset();
	 	u.setAssetId(assetId);
	 	u.setAssetName(assetName);
	 	u.setQuantity(quantity);
	 	u.setStatus(status);
	 	
		
		boolean b=service.updateAsset(u);
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

