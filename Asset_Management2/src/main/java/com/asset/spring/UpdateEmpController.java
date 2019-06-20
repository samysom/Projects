package com.asset.spring;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.asset.jpa.dto.Asset;
import com.asset.jpa.dto.Employee;

import com.asset.services.AssetServiceJPA;
import com.asset.services.AssetServiceJPAimpl;

@Controller
public class UpdateEmpController {
	@Autowired
	AssetServiceJPAimpl ser;
	AssetServiceJPA service= new AssetServiceJPAimpl();
	
	@RequestMapping(value="/updateemppage",method=RequestMethod.GET)
	public ModelAndView getUpdateEmpPage(ModelAndView mv)
	{
		mv.setViewName("updateemppage");
		return mv;
	}


	@RequestMapping(value="/updateempmvc", method=RequestMethod.POST)
	public String updateEmployee(HttpServletResponse resp,@RequestParam("eno") int empNo,@RequestParam("ename") String ename,@RequestParam("job") String job,@RequestParam("mgr") int mgr,@RequestParam("did") int deptId ,ModelAndView mv) throws ServletException,IOException {
		
try
{
	

		Employee e =new Employee();
	 	e.setEmpNo(empNo);
	 	e.setEname(ename);
	 	e.setJob(job);
	 	e.setMgr(mgr);
	 	e.setDeptId(deptId);
		
		boolean b=service.updateEmployee(e);
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

