package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="digitallogin")
public class LoginModel {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	
	
	
	
	public String getusername() {
		return username;
	}


	public void setName(String username) {
		this.username = username;
	}


	public String getpassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}







	public LoginModel(String username, String password ) {
		super();
		this.username = username;
		this.password = password;
		
	
	}


	public LoginModel() {
		
		
	}
}