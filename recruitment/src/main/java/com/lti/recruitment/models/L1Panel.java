package com.lti.recruitment.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="l1_panel")
public class L1Panel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_seven")
	private int formIdSeven; 
	
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
	
	@Column(name ="internship")
	private String internship; 
	
	@Column(name ="discussiontime")
	private String discussiontime; 
	
	@Column(name ="domainknowledge")
	private String domainknowledge; 

	@Column(name ="technicalexpertise")
	private String technicalexpertise; 
	
	@Column(name ="management")
	private String management; 
	
	@Column(name ="quality")
	private String quality; 
	
	@Column(name ="risk")
	private String risk; 
	
	@Column(name ="skills")
	private String skills; 
	
	@Column(name ="behaviour")
	private String behaviour; 
	
	@Column(name ="personaleffectiveness")
	private String personaleffectiveness; 
	
	@Column(name ="reason")
	private String reason;

	public int getFormIdSeven() {
		return formIdSeven;
	}

	public void setFormIdSeven(int formIdSeven) {
		this.formIdSeven = formIdSeven;
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

	public String getInternship() {
		return internship;
	}

	public void setInternship(String internship) {
		this.internship = internship;
	}

	public String getDiscussiontime() {
		return discussiontime;
	}

	public void setDiscussiontime(String discussiontime) {
		this.discussiontime = discussiontime;
	}

	public String getDomainknowledge() {
		return domainknowledge;
	}

	public void setDomainknowledge(String domainknowledge) {
		this.domainknowledge = domainknowledge;
	}

	public String getTechnicalexpertise() {
		return technicalexpertise;
	}

	public void setTechnicalexpertise(String technicalexpertise) {
		this.technicalexpertise = technicalexpertise;
	}

	public String getManagement() {
		return management;
	}

	public void setManagement(String management) {
		this.management = management;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}

	public String getPersonaleffectiveness() {
		return personaleffectiveness;
	}

	public void setPersonaleffectiveness(String personaleffectiveness) {
		this.personaleffectiveness = personaleffectiveness;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public L1Panel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public L1Panel(int formIdSeven, String mail, String name, String cv, Date dob, String contact, Date registration,
			Date discussiondate, String position, String job, String time, String internship, String discussiontime,
			String domainknowledge, String technicalexpertise, String management, String quality, String risk,
			String skills, String behaviour, String personaleffectiveness, String reason) {
		super();
		this.formIdSeven = formIdSeven;
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
		this.internship = internship;
		this.discussiontime = discussiontime;
		this.domainknowledge = domainknowledge;
		this.technicalexpertise = technicalexpertise;
		this.management = management;
		this.quality = quality;
		this.risk = risk;
		this.skills = skills;
		this.behaviour = behaviour;
		this.personaleffectiveness = personaleffectiveness;
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "L1Panel [formIdSeven=" + formIdSeven + ", mail=" + mail + ", Name=" + Name + ", cv=" + cv + ", dob="
				+ dob + ", contact=" + contact + ", registration=" + registration + ", discussiondate=" + discussiondate
				+ ", position=" + position + ", job=" + job + ", time=" + time + ", internship=" + internship
				+ ", discussiontime=" + discussiontime + ", domainknowledge=" + domainknowledge
				+ ", technicalexpertise=" + technicalexpertise + ", management=" + management + ", quality=" + quality
				+ ", risk=" + risk + ", skills=" + skills + ", behaviour=" + behaviour + ", personaleffectiveness="
				+ personaleffectiveness + ", reason=" + reason + "]";
	}

	
	
	
	
}
