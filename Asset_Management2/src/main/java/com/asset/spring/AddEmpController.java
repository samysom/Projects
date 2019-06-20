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

import com.asset.jpa.dto.Employee;
import com.asset.jpa.dto.User;
import com.asset.services.AssetServiceJPA;
import com.asset.services.AssetServiceJPAimpl;

@Controller
public class AddEmpController {


	@Autowired
	AssetServiceJPA service= new AssetServiceJPAimpl();
	
	
	@RequestMapping(value="/addemppage",method=RequestMethod.GET)
	public String getAddEmpPage()
	{
		return "addemppage";
	}

	@RequestMapping(value="/addempmvc", method=RequestMethod.POST)
	public String addEmployee(HttpServletResponse resp,Employee e,
			@RequestParam("eno") int empNo,@RequestParam("ename") String ename,
			@RequestParam("job") String job ,@RequestParam("manager") int mgr,
			@RequestParam("hiredate") Date hireDate,  @RequestParam("deptid") int deptId ,
			ModelAndView mv) throws ServletException,IOException {
		

try {
			
			Employee u1 = new Employee();
			
			u1.setEmpNo(empNo);
			u1.setEname(ename);
			u1.setJob(job);
			u1.setMgr(mgr);
			u1.setHireDate(hireDate);
			u1.setDeptId(deptId);
			

			boolean b=service.addEmployee(u1);
			if(b==true)
			{
				return "Success";
			}
			else
			{
				return  "Failed";
			}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	
	
	return null;
}

}

