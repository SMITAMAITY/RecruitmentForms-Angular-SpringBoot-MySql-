package com.lti.recruitment.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="screening_one")
public class ScreeningOne {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_four")
	private int formIdFour; 
	
	@Column(name ="mail")
	private String mail; 
	
	@Column(name ="cv")
	private String cv; 
	
	@Column(name ="dob")
	private Date dob; 
	
	@Column(name ="contact")
	private String contact; 
	
	@Column(name ="registration")
	private Date registration; 
	
	@Column(name ="time")
	private String time; 
	
	@Column(name ="skills")
	private String skills; 
	
	@Column(name ="criteria")
	private String criteria; 
	
	@Column(name ="reason")
	private String reason; 
	

	public int getFormIdFour() {
		return formIdFour;
	}

	public void setFormIdFour(int formIdFour) {
		this.formIdFour = formIdFour;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}



	public ScreeningOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScreeningOne(int formIdFour, String mail, String cv, Date dob, String contact, Date registration,
			String time, String skills, String criteria, String reason) {
		super();
		this.formIdFour = formIdFour;
		this.mail = mail;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registration = registration;
		this.time = time;
		this.skills = skills;
		this.criteria = criteria;
		this.reason = reason;
		
	}

	@Override
	public String toString() {
		return "ScreeningOne [formIdFour=" + formIdFour + ", mail=" + mail + ", cv=" + cv + ", dob=" + dob
				+ ", contact=" + contact + ", registration=" + registration + ", time=" + time + ", skills=" + skills
				+ ", criteria=" + criteria + ", reason=" + reason + "]";
	}

	

	
}
