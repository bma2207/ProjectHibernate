package com.project.controler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginBean {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	private String user;
	private String password;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Loginmodul [lid=" + lid + ", user=" + user + ", password=" + password + "]";
	}
}
