package com.project.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LoginDao {
	
	public static EntityManager getEntityManager() {
		 EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence");
		 EntityManager  manager=factory.createEntityManager();
		 return manager;
		 
	}
	
	public void  addUser(LoginBean loginbean) {	
		
		try {
			
			  EntityManager  manager=getEntityManager();
			 
			  manager.getTransaction().begin();
			   
			  manager.persist(loginbean);
			  
			  manager.getTransaction().commit();
			  
			 
			
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e.getMessage());
	            System.out.println("error");
		}
	
		
	}	  

	public void  addUpdate(LoginBean loginbean) {	
		
		try {
			
			  EntityManager  manager=getEntityManager();
			 
			  manager.getTransaction().begin();
			   
			  manager.persist(loginbean);
			  
			  manager.getTransaction().commit();
			  
			 
			
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e.getMessage());
	            System.out.println("error");
		}
	
		
	}	  

	public void  addDelete(LoginBean loginbean) {	
		
		try {
			
			  EntityManager  manager=getEntityManager();
			 
			  manager.getTransaction().begin();
			   
			  manager.persist(loginbean);
			  
			  manager.getTransaction().commit();
			  
			 
			
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e.getMessage());
	            System.out.println("error");
		}
	
		
	}	  

	  
}
