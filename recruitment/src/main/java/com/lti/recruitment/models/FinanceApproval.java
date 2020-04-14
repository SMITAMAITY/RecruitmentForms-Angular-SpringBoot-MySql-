package com.lti.recruitment.models;

import java.sql.Time;
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
	
	@Column(name ="mailId")
	private String mailId; 
	
	@Column(name ="Name")
	private String Name; 
	
	@Column(name ="cv")
	private String cv; 
	
	@Column(name ="dob")
	private Date dob; 
	
	@Column(name ="contact")
	private int contact; 
	
	@Column(name ="registrationDate")
	private Date registrationDate; 

	@Column(name ="confirmation")
	private String confirmation; 
	
	@Column(name ="venue")
	private Time venue; 
	
	@Column(name ="reason")
	private String reason; 
	
	@Column(name ="decision")
	private String decision;

	public int getFormIdEleven() {
		return formIdEleven;
	}

	public void setFormIdEleven(int formIdEleven) {
		this.formIdEleven = formIdEleven;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
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

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public Time getVenue() {
		return venue;
	}

	public void setVenue(Time venue) {
		this.venue = venue;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public FinanceApproval() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinanceApproval(int formIdEleven, String mailId, String name, String cv, Date dob, int contact,
			Date registrationDate, String confirmation, Time venue, String reason, String decision) {
		super();
		this.formIdEleven = formIdEleven;
		this.mailId = mailId;
		Name = name;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registrationDate = registrationDate;
		this.confirmation = confirmation;
		this.venue = venue;
		this.reason = reason;
		this.decision = decision;
	}

	@Override
	public String toString() {
		return "FinanceApproval [formIdEleven=" + formIdEleven + ", mailId=" + mailId + ", Name=" + Name + ", cv=" + cv
				+ ", dob=" + dob + ", contact=" + contact + ", registrationDate=" + registrationDate + ", confirmation="
				+ confirmation + ", venue=" + venue + ", reason=" + reason + ", decision=" + decision + "]";
	}
	
	
}