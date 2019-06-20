package com.university.service;

import java.util.List;

import com.university.dao.UniversityDAOImpl;
import com.university.dto.Application;
import com.university.dto.ProgramsOffered;
import com.university.dto.ProgramsScheduled;
import com.university.dto.User;

public class UniversityServiceImpl implements UniversityService {
	UniversityDAOImpl udao=new UniversityDAOImpl();

	@Override
	public User login(String username, String password, String role) {
		User user=udao.login(username, password, role);
		if(user!=null) {
			return user;
		}else {
		
		return null;
	}}

	@Override
	public boolean addProgram(ProgramsOffered prog) {
		boolean result=udao.addProgram(prog);
		if(result) {
			return true;
		}else {
		return false;
	}}

	@Override
	public boolean updateProgram(ProgramsOffered prog) {
		// TODO Auto-generated method stub
		boolean result=udao.updateProgram(prog);
		if(result)
		{
			return true;
		}else {
		return false;
	                }}

	@Override
	public boolean deleteProgram(String programName) {
		// TODO Auto-generated method stub
		boolean result=udao.deleteProgram(programName);
		if(result)
		{
			return true;
		}else {
			
		
		return false;
	}}

	@Override
	public List<ProgramsOffered> listAllPrograms() {
		List<ProgramsOffered> al=udao.listAllPrograms();
		if(al!=null) {
			return al;
		}
		return null;
	}

	@Override
	public boolean createScheduledProgram(ProgramsScheduled schPro) {
		// TODO Auto-generated method stub
		boolean result=udao.createScheduledProgram(schPro);
		if(result)
		{
			return true;
		}
		else {
			return false;
		                }
	}

	@Override
	public boolean updateScheduledProgram(ProgramsScheduled schPro) {
		// TODO Auto-generated method stub
		boolean result=udao.updateScheduledProgram(schPro);
		if(result)
		{
			return true;
		}
		else {
			return false;
		                }
	}

	@Override
	public boolean deleteScheduledProgram(String schProId) {
		// TODO Auto-generated method stub
		boolean result=udao.deleteScheduledProgram(schProId);
		if(result)
		{
			return true;
		}
		else {
			return false;
		                }
	}

	@Override
	public List<ProgramsScheduled> listAllScheduledPrograms() {
		// TODO Auto-generated method stub
		List<ProgramsScheduled> al=udao.listAllScheduledPrograms();
		if(al!=null) {
			return al;
		}
		
		return null;
	}

	@Override
	public boolean applyApplication(Application app) {
		// TODO Auto-generated method stub
		boolean result=udao.applyApplication(app);
		if(result)
		{
			return true;
		}
		
		else {
			return false;
		                }
	}

	@Override
	public boolean deleteApplication(long id) {
		// TODO Auto-generated method stub
		boolean result=udao.deleteApplication(id);
		if(result)
		{
			return true;
		}
		
		else {
			return false;
		                }
	}

	@Override
	public boolean updateApplication(Application app) {
		// TODO Auto-generated method stub
		boolean result=udao.updateApplication(app);
		if(result)
		{
			return true;
		}
		
		else {
			return false;
		                }
	}

	@Override
	public List<Application> listAllApplications() {
		// TODO Auto-generated method stub
		List<Application> al=udao.listAllApplications();
		if(al!=null) {
			return al;
		}
		return null;
	}

	@Override
	public long getApplicationId(String email) {
		// TODO Auto-generated method stub
		long appliId=udao.getApplicationId(email);
		if(appliId!=0)
		{
			return appliId;
		}
		
		return 0;
	}

	@Override
	public boolean searchApplicationStatus(long id) {
		boolean result=udao.searchApplicationStatus(id);
		if(result)
		{
			return true;
		}else {
			
		
		return false;
	}}

}
