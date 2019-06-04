package com.project.service;

import java.util.List;

import com.project.controler.LoginBean;

public interface LoginService {

	void addUser(LoginBean loginbean);
	 List<LoginBean> getAllRecords();
}
