package com.project.bind;

import com.google.inject.AbstractModule;
import com.project.controler.LoginBean;
import com.project.controler.LoginDao;
import com.project.service.LoginService;

public class LoginBind extends AbstractModule{

	@Override
	protected void configure() {
		
		bind(LoginService.class).to(LoginDao.class);
	}

	
}
