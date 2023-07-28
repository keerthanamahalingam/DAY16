package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment")
public class PaymentModel {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="fullname")
	private String fullname;
	@Column(name="emailaddress")
	private String emailaddress;
	@Column(name="date")
	private String date;
	@Column(name="cardnumber")
	private long cardnumber;
	@Column(name="cardcvc")
	private long cardcvc;
	
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
    public String getDate() {
		return date;
	}
    public void setDate(String date) {
		this.date = date;
	}
    public long getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}
	public long getCardcvc() {
		return cardcvc;
	}
	public void setCardcvc(long cardcvc) {
		this.cardcvc = cardcvc;
	}
	
	public PaymentModel(String fullname, String emailaddress, String date, long cardnumber, long cardcvc) {
		super();
		this.fullname = fullname;
		this.emailaddress = emailaddress;
		this.date = date;
		this.cardnumber = cardnumber;
		this.cardcvc = cardcvc;
	}

	public PaymentModel() {
		
		
	}
}
