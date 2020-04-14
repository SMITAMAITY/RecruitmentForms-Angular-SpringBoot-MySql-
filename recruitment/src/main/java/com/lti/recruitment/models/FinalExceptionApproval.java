package com.lti.recruitment.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="final_exception_approval")
public class FinalExceptionApproval {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_thirteen")
	private int formIdThirteen; 
	
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

	@Column(name ="approver")
	private String approver;
	
	@Column(name ="confirmation")
	private String confirmation; 
	
	@Column(name ="reason")
	private String reason; 
	
	@Column(name ="decision")
	private String decision;

	public int getFormIdThirteen() {
		return formIdThirteen;
	}

	public void setFormIdThirteen(int formIdThirteen) {
		this.formIdThirteen = formIdThirteen;
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

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public FinalExceptionApproval() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinalExceptionApproval(int formIdThirteen, String mailId, String name, String cv, Date dob, int contact,
			Date registrationDate, String approver, String confirmation, String reason, String decision) {
		super();
		this.formIdThirteen = formIdThirteen;
		this.mailId = mailId;
		Name = name;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registrationDate = registrationDate;
		this.approver = approver;
		this.confirmation = confirmation;
		this.reason = reason;
		this.decision = decision;
	}

	@Override
	public String toString() {
		return "FinalExceptionApproval [formIdThirteen=" + formIdThirteen + ", mailId=" + mailId + ", Name=" + Name
				+ ", cv=" + cv + ", dob=" + dob + ", contact=" + contact + ", registrationDate=" + registrationDate
				+ ", approver=" + approver + ", confirmation=" + confirmation + ", reason=" + reason + ", decision="
				+ decision + "]";
	}
	
	
}
