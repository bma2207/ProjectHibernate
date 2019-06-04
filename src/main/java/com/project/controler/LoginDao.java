package com.project.controler;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.project.service.LoginService;

public class LoginDao implements LoginService {

	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
		EntityManager manager = factory.createEntityManager();
		return manager;

	}

	public void addUser(LoginBean loginbean) {

		try {

			EntityManager manager = getEntityManager();

			manager.getTransaction().begin();

			manager.persist(loginbean);

			manager.getTransaction().commit();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("error");
		}
	}

	public List<LoginBean> getAllRecords() {
		EntityManager manager = getEntityManager();
		// List<LoginBean> al = manager.createQuery("SELECT e FROM LoginBean
		// e").getResultList();

		Query query = manager.createQuery("from LoginBean");
		List<LoginBean> al1 = query.getResultList();

		List<LoginBean> alist = new ArrayList<LoginBean>();

		try {
			if (al1 != null) {
				for (LoginBean empl : al1) {
					System.out.println("User Id= " + empl.getLid() + "User Name " + empl.getUsers() + "Password"
							+ empl.getPassword());
					LoginBean lb = new LoginBean();
					lb.setLid(empl.getLid());
					lb.setUsers(empl.getUsers());
					lb.setPassword(empl.getPassword());
					alist.add(lb);

				}
			}
		} catch (Exception e) {

		}
		return alist;
	}

	public LoginBean editMethod(int id) {
		EntityManager manager = getEntityManager();
		System.out.println("test this  " + id);
		
		LoginBean lb = null;
		Query query = manager.createQuery("from LoginBean where lid=:id");
		query.setParameter("id", id);
		List<LoginBean> al = query.getResultList();

		try {
			if (al != null) {
				for (LoginBean empl : al) {
					System.out.println("User Id= " + empl.getLid() + "User Name " + empl.getUsers() + "Password"
							+ empl.getPassword());
					lb = new LoginBean();
					lb.setLid(empl.getLid());
					lb.setUsers(empl.getUsers());
					lb.setPassword(empl.getPassword());

				}
			}
		} catch (Exception e) {

		}
		return lb;
	}
	
	public static int delete(LoginBean lb){  
		EntityManager manager = getEntityManager();
	    int status=0;  
	    try{  
	    	
			Query query = manager.createQuery("delete from LoginBean where lid=:id");
			query.setParameter(1, 7);
			status=query.executeUpdate();
		
	    }catch(Exception e){System.out.println(e);}  

		return status; 
	}  
	}

