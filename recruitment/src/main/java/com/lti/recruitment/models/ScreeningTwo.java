package com.lti.recruitment.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="screening_two")
public class ScreeningTwo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_six")
	private int formIdSix; 
	
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
	
	@Column(name ="discussionTimeTaken")
	private int discussionTimeTaken; 
	
	@Column(name ="skillsMatched")
	private int skillsMatched; 
	
	@Column(name ="criteriaMatched")
	private int criteriaMatched; 
	
	@Column(name ="internships")
	private int internships; 
	
	@Column(name ="trainings")
	private int trainings; 
	
	@Column(name ="reason")
	private int reason; 
	
	@Column(name ="decision")
	private int decision;

	public int getFormIdSix() {
		return formIdSix;
	}

	public void setFormIdSix(int formIdSix) {
		this.formIdSix = formIdSix;
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

	public int getDiscussionTimeTaken() {
		return discussionTimeTaken;
	}

	public void setDiscussionTimeTaken(int discussionTimeTaken) {
		this.discussionTimeTaken = discussionTimeTaken;
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

	public int getInternships() {
		return internships;
	}

	public void setInternships(int internships) {
		this.internships = internships;
	}

	public int getTrainings() {
		return trainings;
	}

	public void setTrainings(int trainings) {
		this.trainings = trainings;
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

	public ScreeningTwo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScreeningTwo(int formIdSix, int mailId, int cv, int dob, int contact, int registrationDate, int timeTaken,
			int discussionTimeTaken, int skillsMatched, int criteriaMatched, int internships, int trainings, int reason,
			int decision) {
		super();
		this.formIdSix = formIdSix;
		this.mailId = mailId;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registrationDate = registrationDate;
		this.timeTaken = timeTaken;
		this.discussionTimeTaken = discussionTimeTaken;
		this.skillsMatched = skillsMatched;
		this.criteriaMatched = criteriaMatched;
		this.internships = internships;
		this.trainings = trainings;
		this.reason = reason;
		this.decision = decision;
	}

	@Override
	public String toString() {
		return "ScreeningTwo [formIdSix=" + formIdSix + ", mailId=" + mailId + ", cv=" + cv + ", dob=" + dob
				+ ", contact=" + contact + ", registrationDate=" + registrationDate + ", timeTaken=" + timeTaken
				+ ", discussionTimeTaken=" + discussionTimeTaken + ", skillsMatched=" + skillsMatched
				+ ", criteriaMatched=" + criteriaMatched + ", internships=" + internships + ", trainings=" + trainings
				+ ", reason=" + reason + ", decision=" + decision + "]";
	}
	
	
	
	
}
