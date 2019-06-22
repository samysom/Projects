package com.library.project.utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.library.project.dto.BookTransactionJPA;

public class DisplayTransactionJPA {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistenceUnit");
	
	EntityManager em1=emf.createEntityManager();	 
	
	public BookTransactionJPA display(String tranId) {
	BookTransactionJPA li=null;
		try {
			em1.getTransaction().begin();
			 li = em1.find(BookTransactionJPA.class, tranId);
			em1.getTransaction().commit();
			if(li!=null) {
				return li;
			}else {
				li=null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			li=null;
			
		}finally {
			if(em1 != null) {
				em1.close();
			}
		}
		return li;
	}
	

}
