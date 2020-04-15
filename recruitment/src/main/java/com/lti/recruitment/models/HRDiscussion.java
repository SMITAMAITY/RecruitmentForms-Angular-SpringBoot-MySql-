package com.lti.recruitment.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hr_discussion")
public class HRDiscussion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_nine")
	private int formIdNine; 
	
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
	
	@Column(name ="domainknowledge")
	private String domainknowledge; 
	
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
	
	@Column(name ="personaleffectivenesss")
	private String personaleffectiveness; 
	
	@Column(name ="confirmation")
	private String confirmation; 
	
	@Column(name ="noticePeriod")
	private String noticePeriod; 
	
	@Column(name ="bond")
	private String bond;
	
	@Column(name ="reason")
	private String reason;

	public int getFormIdNine() {
		return formIdNine;
	}

	public void setFormIdNine(int formIdNine) {
		this.formIdNine = formIdNine;
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

	public String getDomainknowledge() {
		return domainknowledge;
	}

	public void setDomainknowledge(String domainknowledge) {
		this.domainknowledge = domainknowledge;
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

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public String getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	public String getBond() {
		return bond;
	}

	public void setBond(String bond) {
		this.bond = bond;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public HRDiscussion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HRDiscussion(int formIdNine, String mail, String name, String cv, Date dob, String contact,
			Date registration, Date discussiondate, String position, String job, String time, String interview,
			String domainknowledge, String management, String quality, String risk, String skills, String behaviour,
			String personaleffectiveness, String confirmation, String noticePeriod, String bond, String reason) {
		super();
		this.formIdNine = formIdNine;
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
		this.domainknowledge = domainknowledge;
		this.management = management;
		this.quality = quality;
		this.risk = risk;
		this.skills = skills;
		this.behaviour = behaviour;
		this.personaleffectiveness = personaleffectiveness;
		this.confirmation = confirmation;
		this.noticePeriod = noticePeriod;
		this.bond = bond;
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "HRDiscussion [formIdNine=" + formIdNine + ", mail=" + mail + ", Name=" + Name + ", cv=" + cv + ", dob="
				+ dob + ", contact=" + contact + ", registration=" + registration + ", discussiondate=" + discussiondate
				+ ", position=" + position + ", job=" + job + ", time=" + time + ", interview=" + interview
				+ ", domainknowledge=" + domainknowledge + ", management=" + management + ", quality=" + quality
				+ ", risk=" + risk + ", skills=" + skills + ", behaviour=" + behaviour + ", personaleffectiveness="
				+ personaleffectiveness + ", confirmation=" + confirmation + ", noticePeriod=" + noticePeriod
				+ ", bond=" + bond + ", reason=" + reason + "]";
	} 
	
	
}
