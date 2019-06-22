package com.library.project.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.library.project.dto.BookInventory;
import com.library.project.dto.BookInventoryCollection;
import com.library.project.dto.BookInventoryJPA;
import com.library.project.dto.BookRegistration;
import com.library.project.dto.BookRegistrationJPA;
import com.library.project.dto.BookTransaction;
import com.library.project.dto.BookTransactionJPA;
import com.library.project.dto.User;
import com.library.project.dto.UserCollection;
import com.library.project.dto.UserJPA;
import com.library.project.utils.LibraryManagementException;
import com.library.project.utils.DisplayTransactionJPA;
import com.library.project.utils.LibraryDAO1JPA;

@Repository
public class LibraryDAOImplJPA implements LibraryDAO {
    DisplayTransactionJPA display = new DisplayTransactionJPA();
	LibraryDAO1JPA d1=new LibraryDAO1JPA();
	
	
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistenceUnit");


	@Override
	public UserJPA login1(String id, String pass, String role) {
		
		EntityManager em=emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			String query= "select p from UserJPA p where p.userId=:id and p.password=:pass and p.role=:role";
			TypedQuery<UserJPA> q= em.createQuery(query,UserJPA.class);
			q.setParameter("id",id);
			q.setParameter("pass",pass);
			q.setParameter("role", role);
			UserJPA u=(UserJPA) q.getSingleResult();
			em.getTransaction().commit();
			return u;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			if(em != null) {
				em.close();
			}
		}
	}

	@Override
	public boolean createUser1(UserJPA us) {
		EntityManager em=emf.createEntityManager();
//		boolean state=false;
		try {
    		em.getTransaction().begin();
			em.persist(us);
/*//			String query="insert into UserJPA values(?,?,?,?,?)";
//			Query q=em.createNamedQuery(query);
//			q.setParameter("user_id", us.getUserId());
//			q.setParameter("user_name", us.getUserName());
//			q.setParameter("email_id", us.getEmail());
//			q.setParameter("password", us.getEmail());
//			q.setParameter("role", us.getRole());
//			us=(UserJPA)q.getSingleResult();
*/			
            	em.getTransaction().commit();
				return true;
		
		} catch (Exception e) {
			e.printStackTrace();
			
			return false;
			
		}finally {
			if(em != null) {
				em.close();
			}
		}
	}

	@Override
	public BookInventoryJPA registration1(String name) {
		BookInventoryJPA u=null;
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		String query= "select p from BookInventoryJPA p where p.bookName=:name";
		TypedQuery<BookInventoryJPA> q= em.createQuery(query,BookInventoryJPA.class);
		q.setParameter("name",name);
		u=(BookInventoryJPA)q.getSingleResult();

		if(u!=null)
		{
			if(em!=null) {
				em.getTransaction().commit();
				em.close();
			}
			return u;
		}
		else
			return null;

	}


	@Override
	public boolean afterRegistration1(BookRegistrationJPA regn) {
		boolean state=false;
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(regn);
			em.getTransaction().commit();
			state=true;
		} catch (Exception e) {
			e.printStackTrace();
			state=false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;

	}

	@Override
	public List<BookInventoryJPA> listBooks1() {
		List<BookInventoryJPA> li=null;
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			String query="select book from BookInventoryJPA book";
			Query qu=em.createQuery(query);
			li= qu.getResultList();
			em.getTransaction().commit();
			if(li!=null) {
				return li;
			}else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;	
		}finally {
			if(em != null) {
				em.close();
			}
		}
	}

	@Override
	public boolean addInventory1(BookInventoryJPA b) {
		boolean state=false;
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(b);
			em.getTransaction().commit();
			state=true;
		} catch (Exception e) {
			e.printStackTrace();
			state=false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}

	@Override 
	public boolean updateInventory1(String bookName, String  bookId) {
		boolean state=false;
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			String query="update BookInventoryJPA set bookName=:bookName where bookId=:bookId";
			Query q=em.createQuery(query);
			q.setParameter("bookName", bookName);
			q.setParameter("bookId", bookId);
			int count=q.executeUpdate();
			if(count>0) {
				state=true;
			}
			else {
				state=false;
			}
			em.getTransaction().commit();


		} catch (Exception e) {
			e.printStackTrace();
			state=false;

		}finally {
			if(em != null) {
				em.close();
			}}return state;
	}

	@Override
	public boolean deleteInventory1(String bookid) {
		boolean state=false;
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			String query="delete from BookInventoryJPA where bookId=:bookid";
			Query q=em.createQuery(query);
			q.setParameter("bookid", bookid);
			int count=q.executeUpdate();
			if(count>0) {
				state=true;
			}
			else {
				state=false;
			}
			em.getTransaction().commit();


		} catch (Exception e) {
			e.printStackTrace();
			state=false;

		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;


	}

	@Override
	public List<BookRegistrationJPA> transaction1() {
		List<BookRegistrationJPA> li=null;
		EntityManager em=emf.createEntityManager();
		try {
//			em=emf.createEntityManager();
			em.getTransaction().begin();
			String query = "select reg from BookRegistrationJPA reg";
			Query q=em.createQuery(query);
			li=q.getResultList();
			em.getTransaction().commit();
			if(li!=null) {
				return li;	
			}else {
				li=null;
			}


		} catch (Exception e) {
			e.printStackTrace();
			li=null;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return li;
	}

	@Override
	public boolean issueTransaction1(BookTransactionJPA t) {
		EntityManager em=emf.createEntityManager();
		boolean state=false;
	
		try {
			em.getTransaction().begin();
			em.persist(t);
			em.getTransaction().commit();
			state=true;
		} catch (Exception e) {
			e.printStackTrace();
			state=false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
		
	}

	@Override
	public BookTransactionJPA returnTransaction1(String tranId,String id) {
		BookTransactionJPA li=null;
		boolean state1=false;
		EntityManager em=emf.createEntityManager();
		try {
//			em=emf.createEntityManager();
			em.getTransaction().begin();

			String query = "update BookTransactionJPA set fine=:fine where transactionId=:tranId and registrationId=:id";
			Query q=em.createQuery(query);
			double fine=d1.fineCalculation(tranId);
			q.setParameter("fine", fine);
			q.setParameter("tranId",tranId);
			q.setParameter("id", id);
			int count=q.executeUpdate();
			em.getTransaction().commit();
			if(count>0) {
				state1=true;
			}
			else {
				state1=false;
			}
			
			
			System.out.println("Fine is set");
			li=display.display(tranId);
		
			if(li!=null)
				return li;
			else
				li=null;
		}catch (Exception e) {
			e.printStackTrace();
			li=null;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return li;
	}

	@Override
	public User login(String id, String pass, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createUser(User us) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BookInventory registration(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean afterRegistration(BookRegistration regn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BookInventory> listBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addInventory(BookInventory b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateInventory(String bookId, String bookName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteInventory(String bookid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BookRegistration> transaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean issueTransaction(BookTransaction t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BookTransaction> returnTransaction(String tranId, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createUser2(UserCollection us) throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookInventoryCollection registration2(int bookId) throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookInventoryCollection> listBooks2() throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addInventory2(BookInventoryCollection b) throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateInventory2(BookInventoryCollection book) throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteInventory2(int bookid) throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	}



}
