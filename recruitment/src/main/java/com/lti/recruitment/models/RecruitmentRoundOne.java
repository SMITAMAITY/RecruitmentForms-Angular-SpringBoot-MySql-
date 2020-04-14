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
@Table(name="recruitment_roundone")
public class RecruitmentRoundOne {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_five")
	private int formIdFive;  
	
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
	
	@Column(name ="discussionTimeTaken")
	private Time discussionTimeTaken; 
	
	@Column(name ="skillsMatched")
	private String skillsMatched; 
	
	@Column(name ="internships")
	private String internships; 
	
	@Column(name ="trainings")
	private String trainings; 
	
	@Column(name ="questions")
	private String questions; 
	
	@Column(name ="criteriaMatched")
	private String criteriaMatched; 
	
	@Column(name ="reason")
	private String reason; 
	

	@Column(name ="decision")
	private String decision;


	public int getFormIdFive() {
		return formIdFive;
	}


	public void setFormIdFive(int formIdFive) {
		this.formIdFive = formIdFive;
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


	public Time getDiscussionTimeTaken() {
		return discussionTimeTaken;
	}


	public void setDiscussionTimeTaken(Time discussionTimeTaken) {
		this.discussionTimeTaken = discussionTimeTaken;
	}


	public String getSkillsMatched() {
		return skillsMatched;
	}


	public void setSkillsMatched(String skillsMatched) {
		this.skillsMatched = skillsMatched;
	}


	public String getInternships() {
		return internships;
	}


	public void setInternships(String internships) {
		this.internships = internships;
	}


	public String getTrainings() {
		return trainings;
	}


	public void setTrainings(String trainings) {
		this.trainings = trainings;
	}


	public String getQuestions() {
		return questions;
	}


	public void setQuestions(String questions) {
		this.questions = questions;
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


	public RecruitmentRoundOne() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RecruitmentRoundOne(int formIdFive, String mailId, String cv, Date dob, int contact, Date registrationDate,
			Time timeTaken, Time discussionTimeTaken, String skillsMatched, String internships, String trainings,
			String questions, String criteriaMatched, String reason, String decision) {
		super();
		this.formIdFive = formIdFive;
		this.mailId = mailId;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registrationDate = registrationDate;
		this.timeTaken = timeTaken;
		this.discussionTimeTaken = discussionTimeTaken;
		this.skillsMatched = skillsMatched;
		this.internships = internships;
		this.trainings = trainings;
		this.questions = questions;
		this.criteriaMatched = criteriaMatched;
		this.reason = reason;
		this.decision = decision;
	}


	@Override
	public String toString() {
		return "RecruitmentRoundOne [formIdFive=" + formIdFive + ", mailId=" + mailId + ", cv=" + cv + ", contact="
				+ contact + ", skillsMatched=" + skillsMatched + ", internships=" + internships + ", trainings="
				+ trainings + ", questions=" + questions + ", criteriaMatched=" + criteriaMatched + ", reason=" + reason
				+ ", decision=" + decision + "]";
	}

	
	
}
