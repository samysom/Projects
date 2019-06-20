package com.university.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.dao.UniversityJPAImpl;
import com.university.dto.Application;
import com.university.dto.ProgramsOffered;
import com.university.dto.ProgramsScheduled;
import com.university.dto.User;

@Service
public class UniversityServiceJPAImpl implements UniversityService {
    @Autowired
	UniversityJPAImpl udao;
	
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
		boolean result=udao.updateProgram(prog);
		if(result)
		{
			return true;
		}else {
		return false;
	                }
	}

	@Override
	public boolean deleteProgram(String programName) {
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
		return null;}

	@Override
	public boolean createScheduledProgram(ProgramsScheduled schPro) {
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
		boolean result=udao.updateScheduledProgram(schPro);
		if(result)
		{
			return true;
		}
		else {
			return false;}
	}

	@Override
	public boolean deleteScheduledProgram(String schProId) {
		boolean result=udao.deleteScheduledProgram(schProId);
		if(result)
		{
			return true;
		}
		else {
			return false;}
	}

	@Override
	public List<ProgramsScheduled> listAllScheduledPrograms() {
		List<ProgramsScheduled> al=udao.listAllScheduledPrograms();
		if(al!=null) {
			return al;
		}
		
		return null;
	}

	@Override
	public boolean applyApplication(Application app) {
		boolean result=udao.applyApplication(app);
		if(result)
		{
			return true;
		}
		
		else {
			return false;}
	}

	@Override
	public boolean deleteApplication(long id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		boolean result=udao.deleteApplication(id);
		if(result)
		{
			return true;
		}
		
		else {
			return false;}
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
			return false;}
	}

	@Override
	public List<Application> listAllApplications() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		boolean result=udao.searchApplicationStatus(id);
		if(result)
		{
			return true;
		}else {
			
		
		return false;}
	}

}
