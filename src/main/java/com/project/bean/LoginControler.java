package com.project.bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.project.controler.LoginBean;
import com.project.controler.LoginDao;
import com.project.service.LoginService;

@WebServlet("/login")
public class LoginControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    @Inject LoginService loginService;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String nuser = request.getParameter("email");
		String pwd = request.getParameter("password");
		
		try {
			LoginDao loginDao=new LoginDao();
			LoginBean loginbean=new LoginBean();
			 
			  loginbean.setUsers(nuser);
			  loginbean.setPassword(pwd);
			  
			  loginDao.addUser(loginbean);
			  
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}
}
