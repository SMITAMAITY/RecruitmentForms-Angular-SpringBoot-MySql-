package com.lti.recruitment.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="finance_approval")
public class FinanceApproval {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_eleven")
	private int formIdEleven; 
	
	@Column(name ="mail")
	private String mail; 
	
	@Column(name ="Name")
	private String Name; 
	
	@Column(name ="cv")
	private String cv; 
	
	@Column(name ="dob")
	private Date dob; 
	
	@Column(name ="contact")
	private String contact; 
	
	@Column(name ="registration")
	private Date registration; 

	@Column(name ="confirmation")
	private String confirmation; 
	
	@Column(name ="venue")
	private String venue; 
	
	@Column(name ="reason")
	private String reason;

	public int getFormIdEleven() {
		return formIdEleven;
	}

	public void setFormIdEleven(int formIdEleven) {
		this.formIdEleven = formIdEleven;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getRegistration() {
		return registration;
	}

	public void setRegistration(Date registration) {
		this.registration = registration;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public FinanceApproval() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinanceApproval(int formIdEleven, String mail, String name, String cv, Date dob, String contact,
			Date registration, String confirmation, String venue, String reason) {
		super();
		this.formIdEleven = formIdEleven;
		this.mail = mail;
		Name = name;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registration = registration;
		this.confirmation = confirmation;
		this.venue = venue;
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "FinanceApproval [formIdEleven=" + formIdEleven + ", mail=" + mail + ", Name=" + Name + ", cv=" + cv
				+ ", dob=" + dob + ", contact=" + contact + ", registration=" + registration + ", confirmation="
				+ confirmation + ", venue=" + venue + ", reason=" + reason + "]";
	} 
	

	
	
}