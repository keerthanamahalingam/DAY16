package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="digitalcontact")
public class ContactModel {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="fullname")
	private String fullname;
	@Column(name="emailaddress")
	private String emailaddress;
	@Column(name="message")
	private String message;
	
	
	
	
	







	
	public String getFullname() {
		return fullname;
	}













	public void setFullname(String fullname) {
		this.fullname = fullname;
	}













	public String getEmailaddress() {
		return emailaddress;
	}













	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}













	public String getMessage() {
		return message;
	}













	public void setMessage(String message) {
		this.message = message;
	}













	public ContactModel(String fullname, String emailaddress, String message) {
		super();
		this.fullname = fullname;
		this.emailaddress = emailaddress;
		this.message = message;
	}













	public ContactModel() {
		
		
	}
}
