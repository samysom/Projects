package com.university.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.university.dto.Application;
import com.university.dto.ProgramsOffered;
import com.university.dto.ProgramsScheduled;
import com.university.dto.User;

@Repository
public class UniversityJPAImpl implements UniversityDAO{
	@PersistenceUnit  
	private EntityManagerFactory emf;
	@Override
	public User login(String username, String password, String role) {
		
        User userr=null;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="select u from User u where u.loginId=:username and u.password=:password and u.role=:role";
		Query query = em.createQuery(jqpl); 
		query.setParameter("username", username);
		query.setParameter("password", password);
		query.setParameter("role",role );
		
		userr=(User)query.getSingleResult();
		
		em.getTransaction().commit();
		 return userr;
		 
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			if(em!= null) {
				em.close();
			}}
		
		return userr;
	}

	@Override
	public boolean addProgram(ProgramsOffered prog) {
		boolean state = false;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(prog);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e) {
			e.printStackTrace();
			state = false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}

	@Override
	public boolean updateProgram(ProgramsOffered prog) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="update ProgramsOffered p set p.description =:desc, p.eligibility =:eligblity, p.duration=:duration, p.degCerti =:degcerti  where p.programName =:programname";
		Query query = em.createQuery(jqpl);  
		query.setParameter("desc",prog.getDescription());
		query.setParameter("eligblity",prog.getEligibility());
		query.setParameter("duration",prog.getDuration());
		query.setParameter("degcerti",prog.getDegCerti());
		query.setParameter("programname",prog.getProgramName());
		
		int count=query.executeUpdate();
		
		em.getTransaction().commit();
		if(count>0) {
			state = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
			state = false;
		}finally {
			if(em!= null) {
				em.close();
			}}
		
		return state;
	}

	@Override
	public boolean deleteProgram(String programName) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="delete from ProgramsOffered p where p.programName=:programname";
		Query query = em.createQuery(jqpl); 
		query.setParameter("programname",programName);
		
		int count=query.executeUpdate();
		
		em.getTransaction().commit();
		if(count>0) {
			state = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			if(em!= null) {
				em.close();
			}}
		
		return state;
	}

	@Override
	public List<ProgramsOffered> listAllPrograms() {
		EntityManager em = emf.createEntityManager();
		List<ProgramsOffered> list = new ArrayList<ProgramsOffered>();
		try {
		em.getTransaction().begin();
		String jqpl="select p from ProgramsOffered p";
		TypedQuery<ProgramsOffered> query = em.createQuery(jqpl,ProgramsOffered.class); 
		
		  list=query.getResultList();
		
		em.getTransaction().commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			if(em!= null) {
				em.close();
			}}
		return list;
		
		
	}

	@Override
	public boolean createScheduledProgram(ProgramsScheduled schPro) {
		boolean state = false;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(schPro);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e) {
			e.printStackTrace();
			state = false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}

	@Override
	public boolean updateScheduledProgram(ProgramsScheduled schPro) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="update ProgramsScheduled s set s.programName=:programname, s.location=:location, s.startDate=:startdate, s.endDate=:enddate, s.session=:session where s.scheduledProgId=:progId";
		Query query = em.createQuery(jqpl); 
		query.setParameter("programname",schPro.getProgramName());
		query.setParameter("location",schPro.getLocation());
		query.setParameter("startdate",schPro.getStartDate());
		query.setParameter("enddate",schPro.getEndDate());
		query.setParameter("session",schPro.getSession());
		query.setParameter("progId",schPro.getScheduledProgId());
		int count=query.executeUpdate();
		
		em.getTransaction().commit();
		if(count>0) {
		state = true;
		}
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			if(em!= null) {
				em.close();
			}}
		
		return state;

	}

	@Override
	public boolean deleteScheduledProgram(String schProId) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="delete from ProgramsScheduled s where s.scheduledProgId=:progId";
		Query query = em.createQuery(jqpl); 
		query.setParameter("progId",schProId);
		int count=query.executeUpdate();
		
		em.getTransaction().commit();
		if(count>0) {
		state = true;
		}
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			if(em!= null) {
				em.close();
			}}
		
		return state;
	}

	@Override
	public List<ProgramsScheduled> listAllScheduledPrograms() {
		EntityManager em = emf.createEntityManager();
		List<ProgramsScheduled> list = new ArrayList<ProgramsScheduled>();
		try {
		em.getTransaction().begin();
		String jqpl="select s from ProgramsScheduled s";
		TypedQuery<ProgramsScheduled> query = em.createQuery(jqpl,ProgramsScheduled.class); 
		
		  list=query.getResultList();
		
		em.getTransaction().commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			if(em!= null) {
				em.close();
			}}
		return list;
	}

	@Override
	public boolean applyApplication(Application app) {
		boolean state = false;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(app);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}

	@Override
	public boolean deleteApplication(long id) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="delete from Application a where a.applicId=:appid";
		Query query = em.createQuery(jqpl); 
		query.setParameter("appid",id);
		int count=query.executeUpdate();
		
		em.getTransaction().commit();
		if(count>0) {
		state = true;
		}
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			if(em!= null) {
				em.close();
			}}
		
		return state;
	}

	@Override
	public boolean updateApplication(Application app) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="update Application a set a.fullName=:fullName, a.dob=:dob, a.qualification=:qualification," 
						+ " a.marks=:marks,a.goals=:goals, a.email=:email, a.scheduledProgId=:scheduledId, a.status =:status, a.interviewDate=:interviewDate where a.applicId=:appId";
		Query query = em.createQuery(jqpl); 
		query.setParameter("fullName", app.getFullName());
		query.setParameter("dob", app.getDob());
		query.setParameter("qualification", app.getQualification());
		query.setParameter("marks", app.getMarks());
		query.setParameter("goals", app.getGoals());
		query.setParameter("email", app.getEmail());
		query.setParameter("scheduledId", app.getScheduledProgId());	
		query.setParameter("status", app.getStatus());
		query.setParameter("interviewDate", app.getInterviewDate());
		query.setParameter("appId", app.getApplicId());
		
		int count=query.executeUpdate();
		
		em.getTransaction().commit();
		if(count>0) {
		state = true;
		}
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			if(em!= null) {
				em.close();
			}}
		
		return state;
	}

	@Override
	public List<Application> listAllApplications() {
		EntityManager em = emf.createEntityManager();
		List<Application> list = new ArrayList<Application>();
		try {
		em.getTransaction().begin();
		String jqpl="select a from Application a";
		TypedQuery<Application> query = em.createQuery(jqpl,Application.class); 
		
		  list=query.getResultList();
		
		em.getTransaction().commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			if(em!= null) {
				em.close();
			}}
		return list;
	}

	@Override
	public long getApplicationId(String email) {
		
		EntityManager em = emf.createEntityManager();
		long appId=0;
		try {
		em.getTransaction().begin();
		String jqpl="select a.applicId from Application a where a.email=:email";
		Query query = em.createQuery(jqpl); 
		query.setParameter("email",email);
		Application app=(Application)query.getSingleResult();
		 appId=app.getApplicId();
		
		em.getTransaction().commit();
		
		}finally {
			if(em!= null) {
				em.close();
			}}
		
		return appId;
	}

	@Override
	public boolean searchApplicationStatus(long id) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="select a from Application a where a.applicId=:appId";
		Query query = em.createQuery(jqpl); 
		query.setParameter("appId",id);
		Application a=(Application)query.getSingleResult();
		
		em.getTransaction().commit();
		state=true;
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			if(em!= null) {
				em.close();
			}}
		
		return state;
	}

}
