package com.lti.recruitment.models;

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
	
	@Column(name ="discussiontime")
	private String discussiontime; 
	
	@Column(name ="skills")
	private String skills; 
	
	@Column(name ="criteria")
	private String criteria; 
	
	@Column(name ="internships")
	private String internships; 
	
	@Column(name ="trainings")
	private String trainings; 
	
	@Column(name ="questions")
	private String questions; 
	
	@Column(name ="reason")
	private String reason;

	public int getFormIdFive() {
		return formIdFive;
	}

	public void setFormIdFive(int formIdFive) {
		this.formIdFive = formIdFive;
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

	public String getDiscussiontime() {
		return discussiontime;
	}

	public void setDiscussiontime(String discussiontime) {
		this.discussiontime = discussiontime;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public RecruitmentRoundOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecruitmentRoundOne(int formIdFive, String mail, String cv, Date dob, String contact, Date registration,
			String time, String discussiontime, String skills, String criteria, String internships, String trainings,
			String questions, String reason) {
		super();
		this.formIdFive = formIdFive;
		this.mail = mail;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registration = registration;
		this.time = time;
		this.discussiontime = discussiontime;
		this.skills = skills;
		this.criteria = criteria;
		this.internships = internships;
		this.trainings = trainings;
		this.questions = questions;
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "RecruitmentRoundOne [formIdFive=" + formIdFive + ", mail=" + mail + ", cv=" + cv + ", dob=" + dob
				+ ", contact=" + contact + ", registration=" + registration + ", time=" + time + ", discussiontime="
				+ discussiontime + ", skills=" + skills + ", criteria=" + criteria + ", internships=" + internships
				+ ", trainings=" + trainings + ", questions=" + questions + ", reason=" + reason + "]";
	}


}
