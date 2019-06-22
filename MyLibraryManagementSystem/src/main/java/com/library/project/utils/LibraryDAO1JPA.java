package com.library.project.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.library.project.dto.BookInventoryJPA;
import com.library.project.dto.BookTransactionJPA;

public class LibraryDAO1JPA {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistenceUnit");
	EntityManager em2=emf.createEntityManager();

	public double fineCalculation (String Tranid) {
		
		double fine1=0;
		
		try {
			
			em2.getTransaction().begin();
			BookTransactionJPA bt = em2.find(BookTransactionJPA.class, Tranid);
		
			java.util.Date d12=bt.getReturnDate();
			System.out.println(d12);
			Calendar current= Calendar.getInstance();
			java.util.Date c= new Date((current.getTime()).getTime());
			long diff=c.getTime()-d12.getTime();
			int days= (int) diff/(1000*60*60*24);
			System.out.println(days);

			if((days)>0){
				fine1=days;
			}

			else {
				fine1=0;
			}

		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			em2.getTransaction().commit();
			
			if(em2 != null) {
				em2.close();
			}
			
		}
		return fine1;


	}


}

