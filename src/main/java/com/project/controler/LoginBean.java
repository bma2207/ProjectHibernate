package com.project.controler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "LoginBean")
public class LoginBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	private String users;
	private String password;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getUsers() {
		return users;
	}
	public void setUsers(String users) {
		this.users = users;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Loginmodul [lid=" + lid + ", users=" + users + ", password=" + password + "]";
	}
}
