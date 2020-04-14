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
@Table(name="screening_one")
public class ScreeningOne {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_four")
	private int formIdFour; 
	
	@Column(name ="mailId")
	private String mailId; 
	
	@Column(name ="cv")
	private String cv; 
	
	@Column(name ="dob")
	private Date dob; 
	
	@Column(name ="contact")
	private int contact; 
	
	@Column(name ="registrationDate")
	private Date registrationDate; 
	
	@Column(name ="timeTaken")
	private Time timeTaken; 
	
	@Column(name ="skillsMatched")
	private String skillsMatched; 
	
	@Column(name ="criteriaMatched")
	private String criteriaMatched; 
	
	@Column(name ="reason")
	private String reason; 
	
	@Column(name ="decision")
	private String decision;



	public int getFormIdFour() {
		return formIdFour;
	}

	public void setFormIdFour(int formIdFour) {
		this.formIdFour = formIdFour;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
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

	public Time getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(Time timeTaken) {
		this.timeTaken = timeTaken;
	}

	public String getSkillsMatched() {
		return skillsMatched;
	}

	public void setSkillsMatched(String skillsMatched) {
		this.skillsMatched = skillsMatched;
	}

	public String getCriteriaMatched() {
		return criteriaMatched;
	}

	public void setCriteriaMatched(String criteriaMatched) {
		this.criteriaMatched = criteriaMatched;
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

	@Override
	public String toString() {
		return "ScreeningOne [formIdFour=" + formIdFour + ", mailId=" + mailId + ", cv=" + cv + ", dob=" + dob
				+ ", contact=" + contact + ", registrationDate=" + registrationDate + ", timeTaken=" + timeTaken
				+ ", skillsMatched=" + skillsMatched + ", criteriaMatched=" + criteriaMatched + ", reason=" + reason
				+ ", decision=" + decision + "]";
	}

	public ScreeningOne(int formIdFour, String mailId, String cv, Date dob, int contact, Date registrationDate,
			Time timeTaken, String skillsMatched, String criteriaMatched, String reason, String decision) {
		super();
		this.formIdFour = formIdFour;
		this.mailId = mailId;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registrationDate = registrationDate;
		this.timeTaken = timeTaken;
		this.skillsMatched = skillsMatched;
		this.criteriaMatched = criteriaMatched;
		this.reason = reason;
		this.decision = decision;
	}

	public ScreeningOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
