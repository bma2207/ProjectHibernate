package com.project.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class LoginDao {
	public String addUser(String username,String pass) {		 
		 EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence");
		 EntityManager  manager=factory.createEntityManager();
		 
		  manager.getTransaction().begin();
		  
		  LoginBean loginbean=new LoginBean();
		 
		  loginbean.setUser(username);
		  loginbean.setUser(pass);
		  
		  manager.persist(loginbean);
		  
		  manager.getTransaction().commit();
		  
		  return "record added";
	  }
}
