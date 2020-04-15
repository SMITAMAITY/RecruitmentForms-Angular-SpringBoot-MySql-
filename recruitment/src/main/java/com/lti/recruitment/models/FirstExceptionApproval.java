package com.lti.recruitment.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="first_exception_approval")
public class FirstExceptionApproval {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_twelve")
	private int formIdTwelve; 
	
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

	@Column(name ="approver")
	private String approver;
	
	@Column(name ="confirmation")
	private String confirmation; 
	
	@Column(name ="reason")
	private String reason;

	public int getFormIdTwelve() {
		return formIdTwelve;
	}

	public void setFormIdTwelve(int formIdTwelve) {
		this.formIdTwelve = formIdTwelve;
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

	public String getApprover() {
		return approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public FirstExceptionApproval() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FirstExceptionApproval(int formIdTwelve, String mail, String name, String cv, Date dob, String contact,
			Date registration, String approver, String confirmation, String reason) {
		super();
		this.formIdTwelve = formIdTwelve;
		this.mail = mail;
		Name = name;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registration = registration;
		this.approver = approver;
		this.confirmation = confirmation;
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "FirstExceptionApproval [formIdTwelve=" + formIdTwelve + ", mail=" + mail + ", Name=" + Name + ", cv="
				+ cv + ", dob=" + dob + ", contact=" + contact + ", registration=" + registration + ", approver="
				+ approver + ", confirmation=" + confirmation + ", reason=" + reason + "]";
	} 

	
}
