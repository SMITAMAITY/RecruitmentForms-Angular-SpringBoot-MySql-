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
	
	@Column(name ="discussionDate")
	private Date discussionDate; 
	
	@Column(name ="position")
	private String position;
	
	@Column(name ="job")
	private String job; 
	
	@Column(name ="timeTaken")
	private Time timeTaken;
	
	@Column(name ="internship")
	private String internship; 
	
	@Column(name ="confirmation")
	private String confirmation; 
	
	@Column(name ="salary")
	private int salary; 
	
	@Column(name ="venue")
	private String venue; 
	
	@Column(name ="reason")
	private String reason; 
	
	@Column(name ="decision")
	private String decision;

	public int getFormIdTen() {
		return formIdTen;
	}

	public void setFormIdTen(int formIdTen) {
		this.formIdTen = formIdTen;
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

	public Date getDiscussionDate() {
		return discussionDate;
	}

	public void setDiscussionDate(Date discussionDate) {
		this.discussionDate = discussionDate;
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

	public Time getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(Time timeTaken) {
		this.timeTaken = timeTaken;
	}

	public String getInternship() {
		return internship;
	}

	public void setInternship(String internship) {
		this.internship = internship;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
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

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public RecruitmentRoundTwo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecruitmentRoundTwo(int formIdTen, String mailId, String name, String cv, Date dob, int contact,
			Date registrationDate, Date discussionDate, String position, String job, Time timeTaken, String internship,
			String confirmation, int salary, String venue, String reason, String decision) {
		super();
		this.formIdTen = formIdTen;
		this.mailId = mailId;
		Name = name;
		this.cv = cv;
		this.dob = dob;
		this.contact = contact;
		this.registrationDate = registrationDate;
		this.discussionDate = discussionDate;
		this.position = position;
		this.job = job;
		this.timeTaken = timeTaken;
		this.internship = internship;
		this.confirmation = confirmation;
		this.salary = salary;
		this.venue = venue;
		this.reason = reason;
		this.decision = decision;
	}

	@Override
	public String toString() {
		return "RecruitmentRoundTwo [formIdTen=" + formIdTen + ", mailId=" + mailId + ", Name=" + Name + ", cv=" + cv
				+ ", dob=" + dob + ", contact=" + contact + ", registrationDate=" + registrationDate
				+ ", discussionDate=" + discussionDate + ", position=" + position + ", job=" + job + ", timeTaken="
				+ timeTaken + ", internship=" + internship + ", confirmation=" + confirmation + ", salary=" + salary
				+ ", venue=" + venue + ", reason=" + reason + ", decision=" + decision + "]";
	}
	
	

}
