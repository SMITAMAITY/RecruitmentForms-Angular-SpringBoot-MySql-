package com.lti.recruitment.models;

import java.util.Date;

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
	
	@Column(name ="skillsMatched")
	private String skillsMatched; 
	
	@Column(name ="criteriaMatched")
	private String criteriaMatched; 
	
	@Column(name ="internships")
	private String internships; 
	
	@Column(name ="trainings")
	private String trainings; 
	
	@Column(name ="reason")
	private String reason;

	public int getFormIdSix() {
		return formIdSix;
	}

	public void setFormIdSix(int formIdSix) {
		this.formIdSix = formIdSix;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public ScreeningTwo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScreeningTwo(int formIdSix, String mail, String cv, Date dob, String contact, Date registration, String time,
			String discussiontime, String skillsMatched, String criteriaMatched, String internships, String trainings,
			String reason) {
		super();
		this.formIdSix = formIdSix;
		this.mail = mail;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registration = registration;
		this.time = time;
		this.discussiontime = discussiontime;
		this.skillsMatched = skillsMatched;
		this.criteriaMatched = criteriaMatched;
		this.internships = internships;
		this.trainings = trainings;
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "ScreeningTwo [formIdSix=" + formIdSix + ", mail=" + mail + ", cv=" + cv + ", dob=" + dob + ", contact="
				+ contact + ", registration=" + registration + ", time=" + time + ", discussiontime=" + discussiontime
				+ ", skillsMatched=" + skillsMatched + ", criteriaMatched=" + criteriaMatched + ", internships="
				+ internships + ", trainings=" + trainings + ", reason=" + reason + "]";
	}

	
}
