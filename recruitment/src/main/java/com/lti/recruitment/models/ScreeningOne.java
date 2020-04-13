package com.lti.recruitment.models;

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
	private int mailId; 
	
	@Column(name ="cv")
	private int cv; 
	
	@Column(name ="dob")
	private int dob; 
	
	@Column(name ="contact")
	private int contact; 
	
	@Column(name ="registrationDate")
	private int registrationDate; 
	
	@Column(name ="timeTaken")
	private int timeTaken; 
	
	@Column(name ="skillsMatched")
	private int skillsMatched; 
	
	@Column(name ="criteriaMatched")
	private int criteriaMatched; 
	
	@Column(name ="reason")
	private int reason; 
	
	@Column(name ="decision")
	private int decision;

	public int getFormIdFour() {
		return formIdFour;
	}

	public void setFormIdFour(int formIdFour) {
		this.formIdFour = formIdFour;
	}

	public int getMailId() {
		return mailId;
	}

	public void setMailId(int mailId) {
		this.mailId = mailId;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public int getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(int registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}

	public int getSkillsMatched() {
		return skillsMatched;
	}

	public void setSkillsMatched(int skillsMatched) {
		this.skillsMatched = skillsMatched;
	}

	public int getCriteriaMatched() {
		return criteriaMatched;
	}

	public void setCriteriaMatched(int criteriaMatched) {
		this.criteriaMatched = criteriaMatched;
	}

	public int getReason() {
		return reason;
	}

	public void setReason(int reason) {
		this.reason = reason;
	}

	public int getDecision() {
		return decision;
	}

	public void setDecision(int decision) {
		this.decision = decision;
	}

	public ScreeningOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScreeningOne(int formIdFour, int mailId, int cv, int dob, int contact, int registrationDate, int timeTaken,
			int skillsMatched, int criteriaMatched, int reason, int decision) {
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

	@Override
	public String toString() {
		return "ScreeningOne [formIdFour=" + formIdFour + ", mailId=" + mailId + ", cv=" + cv + ", dob=" + dob
				+ ", contact=" + contact + ", registrationDate=" + registrationDate + ", timeTaken=" + timeTaken
				+ ", skillsMatched=" + skillsMatched + ", criteriaMatched=" + criteriaMatched + ", reason=" + reason
				+ ", decision=" + decision + "]";
	} 
	
	
}
