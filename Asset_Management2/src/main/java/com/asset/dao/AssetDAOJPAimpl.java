package com.asset.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.asset.jpa.dto.Asset;
import com.asset.jpa.dto.AssetRequest;
import com.asset.jpa.dto.Employee;
import com.asset.jpa.dto.User;
@Repository
public class AssetDAOJPAimpl implements AssetDAOJPA
{


	private EntityManagerFactory emf =Persistence.createEntityManagerFactory("myPersistenceUnit");
	

 	@Override
	public User login(String userName, String password, String usertype) {

 		 User user=null;
 		EntityManager em = emf.createEntityManager();

		try
		{
			em.getTransaction().begin();
			String jqpl="select u from User u where u.userName=:userName and u.password=:password and u.usertype=:usertype";
			Query query = em.createQuery(jqpl); 
			query.setParameter("userName", userName);
			query.setParameter("password", password);
			query.setParameter("usertype",usertype );
			
			user=(User)query.getSingleResult();
			
			em.getTransaction().commit();
			 return user;
			 
			}catch(Exception e) {
				e.printStackTrace();
				
			}finally {
				if(em!= null) {
					em.close();
				}}
			
			return user;
		}

	@Override
	public boolean createUser(User u) {
		
			boolean state = false;
			EntityManager em = null;
			try {
				em = emf.createEntityManager();
				em.getTransaction().begin();
				em.persist(u);
				em.getTransaction().commit();
				state = true;
			}catch(Exception e1) {
				e1.printStackTrace();
				state = false;
			}finally {
				if(em != null) {
					em.close();
				}
			}
			return state;
		}

	@Override
	public boolean updateUser(User u) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="update User s set  s.userName=:userName, s.password=:password, s.usertype=:usertype where s.userId=:userId";
		Query query = em.createQuery(jqpl); 
		query.setParameter("userId",u.getUserId());
		query.setParameter("userName",u.getUserName());
		query.setParameter("password",u.getPassword());
		query.setParameter("usertype",u.getUsertype());
		
		int count=query.executeUpdate();
		
		em.getTransaction().commit();
		if(count>0) {
		return true;
		}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		
		}finally {
			
			if(em!= null) {
				em.close();
			}}
		
		return false;

	}
	@Override
	public boolean deleteUser(int userId) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="delete from User s where s.userId=:userId";
		Query query = em.createQuery(jqpl); 
		query.setParameter("userId",userId);
		
		int count=query.executeUpdate();
		
		em.getTransaction().commit();
		if(count>0) {
        return true;
		}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		
		}finally {
			if(em!= null) {
				em.close();
			}}
		
		return false;
	}
	
	
	
	@Override
	public boolean addEmployee(Employee e) {
		boolean state = false;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e1) {
			e1.printStackTrace();
			state = false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}
	
	@Override
	public boolean updateEmployee(Employee e) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="update Employee s set s.empNo=:empNo, s.ename=:ename, s.job=:job, s.mgr=:mgr  s.hireDate=:hireDate  s.deptId=:deptId ";
		Query query = em.createQuery(jqpl); 
		query.setParameter("empNo",e.getEmpNo());
		query.setParameter("ename",e.getEname());
		query.setParameter("job",e.getJob());
		query.setParameter("mgr",e.getMgr());
		query.setParameter("hireDate",e.getHireDate());
		query.setParameter("deptId",e.getDeptId());
		
		int count=query.executeUpdate();
		
		em.getTransaction().commit();
		if(count>0) {
		state = true;
		}
		}catch(Exception e1) {
			e1.printStackTrace();
		
		}finally {
			if(em!= null) {
				em.close();
			}}
		
		return state;

	}

	@Override
	public boolean deleteEmployee(int empNo) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="delete from Employee s where s.empNo=:empNo";
		Query query = em.createQuery(jqpl); 
		query.setParameter("userId",empNo);
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
	public boolean createAsset(Asset a) {
		boolean state = false;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(a);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e1) {
			e1.printStackTrace();
			state = false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}
	
	@Override
	public boolean updateAsset(Asset a) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="update Asset s set  s.assetName=:assetName, s.des=:des, s.quantity=:quantity, s.status=:status where  s.assetId=:assetId ";
		Query query = em.createQuery(jqpl); 
		query.setParameter("assetId",a.getAssetId());
		query.setParameter("assetName",a.getAssetName());
		query.setParameter("des",a.getDes());
		query.setParameter("quantity",a.getQuantity());
		query.setParameter("status",a.getStatus());
		
		
	int count=query.executeUpdate();
		
		em.getTransaction().commit();
		if(count>0) {
		return true;
		}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		
		}finally {
			
			if(em!= null) {
				em.close();
			}}
		
		return false;

	}
	@Override
	public boolean deleteAsset(int assetId, String assetName) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		String jqpl="delete from Asset s where s.assetId=:assetId and  s.assetName=:assetName   ";
		Query query = em.createQuery(jqpl); 
		query.setParameter("assetId",assetId);
		query.setParameter("assetName",assetName);
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
	public boolean requestAsset(AssetRequest r) {
		boolean state = false;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(r);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e1) {
			e1.printStackTrace();
			state = false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}
	


	
	@Override
	public List<Asset> statusRequest() {

		EntityManager em = emf.createEntityManager();
		List<Asset> list = new ArrayList<Asset>();
		try {
		em.getTransaction().begin();
		String jqpl="select a from Asset a";
		TypedQuery<Asset> query = em.createQuery(jqpl,Asset.class); 
		
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
	public List<AssetRequest> fetchRequest() {
		EntityManager em = emf.createEntityManager();
		List<AssetRequest> list = new ArrayList<AssetRequest>();
		try {
		em.getTransaction().begin();
		String jqpl="select a from AssetRequest a";
		TypedQuery<AssetRequest> query = em.createQuery(jqpl,AssetRequest.class); 
		
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
	public List<Asset> fetchAllocatedAsset() {
		EntityManager em = emf.createEntityManager();
		List<Asset> list = new ArrayList<Asset>();
		try {
		em.getTransaction().begin();
		String jqpl="select a from Asset a where a.status=:status";
		TypedQuery<Asset> query = em.createQuery(jqpl,Asset.class); 
		query.setParameter("status", "allocated");
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
	public List<Asset> fetchUnallocatedAsset() {
		EntityManager em = emf.createEntityManager();
		List<Asset> list = new ArrayList<Asset>();
		try {
		em.getTransaction().begin();
		String jqpl="select a from Asset a where a.status=:status";
		TypedQuery<Asset> query = em.createQuery(jqpl,Asset.class); 
		query.setParameter("status", "unallocated");
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


	
	
}