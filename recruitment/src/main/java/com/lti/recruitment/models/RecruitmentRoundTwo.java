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
@Table(name="recruitment_roundtwo")
public class RecruitmentRoundTwo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_ten")
	private int formIdTen; 
	
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
	
	@Column(name ="discussiondate")
	private Date discussiondate; 
	
	@Column(name ="position")
	private String position;
	
	@Column(name ="job")
	private String job; 
	
	@Column(name ="time")
	private String time;
	
	@Column(name ="interview")
	private String interview; 
	
	@Column(name ="confirmation")
	private String confirmation; 
	
	@Column(name ="salary")
	private double salary; 
	
	@Column(name ="venue")
	private String venue; 
	
	@Column(name ="reason")
	private String reason;

	public int getFormIdTen() {
		return formIdTen;
	}

	public void setFormIdTen(int formIdTen) {
		this.formIdTen = formIdTen;
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

	public Date getDiscussiondate() {
		return discussiondate;
	}

	public void setDiscussiondate(Date discussiondate) {
		this.discussiondate = discussiondate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getInterview() {
		return interview;
	}

	public void setInterview(String interview) {
		this.interview = interview;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public RecruitmentRoundTwo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecruitmentRoundTwo(int formIdTen, String mail, String name, String cv, Date dob, String contact,
			Date registration, Date discussiondate, String position, String job, String time, String interview,
			String confirmation, double salary, String venue, String reason) {
		super();
		this.formIdTen = formIdTen;
		this.mail = mail;
		Name = name;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registration = registration;
		this.discussiondate = discussiondate;
		this.position = position;
		this.job = job;
		this.time = time;
		this.interview = interview;
		this.confirmation = confirmation;
		this.salary = salary;
		this.venue = venue;
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "RecruitmentRoundTwo [formIdTen=" + formIdTen + ", mail=" + mail + ", Name=" + Name + ", cv=" + cv
				+ ", dob=" + dob + ", contact=" + contact + ", registration=" + registration + ", discussiondate="
				+ discussiondate + ", position=" + position + ", job=" + job + ", time=" + time + ", interview="
				+ interview + ", confirmation=" + confirmation + ", salary=" + salary + ", venue=" + venue + ", reason="
				+ reason + "]";
	} 
	
	

}
