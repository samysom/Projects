package com.asset.spring;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.asset.jpa.dto.AssetRequest;

import com.asset.services.AssetServiceJPA;
import com.asset.services.AssetServiceJPAimpl;

@Controller
public class AssetRequestController {
	
@Autowired
	
	
AssetServiceJPAimpl ser;
AssetServiceJPA service= new AssetServiceJPAimpl();
	
	@RequestMapping(value="/raiserequestpage", method=RequestMethod.GET)
	public ModelAndView AssetRequestPage(ModelAndView mv)
	{
		mv.setViewName("raiserequestpage");
		return mv;
		
	}

	@RequestMapping(value="/raiserequestmvc", method=RequestMethod.POST)
	public String requestAsset(HttpServletResponse resp,@RequestParam("aid") int alloId,
			@RequestParam("asid") int assetId,@RequestParam("eno") int empNo 
			,@RequestParam("adate") Date adate,@RequestParam("rdate") Date rdate, ModelAndView mv) throws ServletException,IOException {
		
      try {
    	  
      
				
				AssetRequest r = new AssetRequest();
				r.setAllocationId(alloId);
				r.setAssetId(assetId);
				r.setEmpNo(empNo);
				r.setAllocationDate(adate);
				r.setReleaseDate(rdate);
				
		boolean b=service.requestAsset(r);
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

		