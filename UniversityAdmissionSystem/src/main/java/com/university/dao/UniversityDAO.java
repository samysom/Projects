package com.university.dao;

import java.util.List;

import com.university.dto.Application;
import com.university.dto.ProgramsOffered;
import com.university.dto.ProgramsScheduled;
import com.university.dto.User;

public interface UniversityDAO {
	
	
	public User login(String username, String password, String role);
	public boolean addProgram(ProgramsOffered prog);
	public boolean updateProgram(ProgramsOffered prog);
	public boolean deleteProgram(String programName);
	public List<ProgramsOffered> listAllPrograms();
	public boolean createScheduledProgram(ProgramsScheduled schPro);
	public boolean updateScheduledProgram(ProgramsScheduled schPro);
	public boolean deleteScheduledProgram(String schProId);
	public List<ProgramsScheduled> listAllScheduledPrograms();
	public boolean applyApplication(Application app);
	public boolean deleteApplication(long id);
	public boolean updateApplication(Application app);
	public List<Application> listAllApplications();
	public long getApplicationId(String email);
	public boolean searchApplicationStatus(long id);

}
