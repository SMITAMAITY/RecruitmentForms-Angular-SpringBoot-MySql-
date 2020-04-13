package com.lti.recruitment.models;

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
	
	@Column(name ="mailId")
	private int mailId; 
	
	@Column(name ="Name")
	private int Name; 
	
	@Column(name ="cv")
	private int cv; 
	
	@Column(name ="dob")
	private int dob; 
	
	@Column(name ="contact")
	private int contact; 
	
	@Column(name ="registrationDate")
	private int registrationDate; 
	
	@Column(name ="discussionDate")
	private int discussionDate; 
	
	@Column(name ="position")
	private int position;
	
	@Column(name ="job")
	private int job; 
	
	@Column(name ="timeTaken")
	private int timeTaken;
	
	@Column(name ="internship")
	private int internship; 
	
	@Column(name ="discussionTimeTaken")
	private int discussionTimeTaken; 
	
	@Column(name ="domainKnowledge")
	private int domainKnowledge; 
	
	@Column(name ="technicalExpertise")
	private int technicalExpertise; 
	
	@Column(name ="management")
	private int management; 
	
	@Column(name ="quality")
	private int quality; 
	
	@Column(name ="risk")
	private int risk; 
	
	@Column(name ="skillsMatched")
	private int skillsMatched; 
	
	@Column(name ="reason")
	private int reason; 
	
	@Column(name ="decision")
	private int decision;

	public int getFormIdSeven() {
		return formIdSeven;
	}

	public void setFormIdSeven(int formIdSeven) {
		this.formIdSeven = formIdSeven;
	}

	public int getMailId() {
		return mailId;
	}

	public void setMailId(int mailId) {
		this.mailId = mailId;
	}

	public int getName() {
		return Name;
	}

	public void setName(int name) {
		Name = name;
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

	public int getDiscussionDate() {
		return discussionDate;
	}

	public void setDiscussionDate(int discussionDate) {
		this.discussionDate = discussionDate;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getJob() {
		return job;
	}

	public void setJob(int job) {
		this.job = job;
	}

	public int getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}

	public int getInternship() {
		return internship;
	}

	public void setInternship(int internship) {
		this.internship = internship;
	}

	public int getDiscussionTimeTaken() {
		return discussionTimeTaken;
	}

	public void setDiscussionTimeTaken(int discussionTimeTaken) {
		this.discussionTimeTaken = discussionTimeTaken;
	}

	public int getDomainKnowledge() {
		return domainKnowledge;
	}

	public void setDomainKnowledge(int domainKnowledge) {
		this.domainKnowledge = domainKnowledge;
	}

	public int getTechnicalExpertise() {
		return technicalExpertise;
	}

	public void setTechnicalExpertise(int technicalExpertise) {
		this.technicalExpertise = technicalExpertise;
	}

	public int getManagement() {
		return management;
	}

	public void setManagement(int management) {
		this.management = management;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getRisk() {
		return risk;
	}

	public void setRisk(int risk) {
		this.risk = risk;
	}

	public int getSkillsMatched() {
		return skillsMatched;
	}

	public void setSkillsMatched(int skillsMatched) {
		this.skillsMatched = skillsMatched;
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

	public L1Panel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public L1Panel(int formIdSeven, int mailId, int name, int cv, int dob, int contact, int registrationDate,
			int discussionDate, int position, int job, int timeTaken, int internship, int discussionTimeTaken,
			int domainKnowledge, int technicalExpertise, int management, int quality, int risk, int skillsMatched,
			int reason, int decision) {
		super();
		this.formIdSeven = formIdSeven;
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
		this.discussionTimeTaken = discussionTimeTaken;
		this.domainKnowledge = domainKnowledge;
		this.technicalExpertise = technicalExpertise;
		this.management = management;
		this.quality = quality;
		this.risk = risk;
		this.skillsMatched = skillsMatched;
		this.reason = reason;
		this.decision = decision;
	}

	@Override
	public String toString() {
		return "L1Panel [formIdSeven=" + formIdSeven + ", mailId=" + mailId + ", Name=" + Name + ", cv=" + cv + ", dob="
				+ dob + ", contact=" + contact + ", registrationDate=" + registrationDate + ", discussionDate="
				+ discussionDate + ", position=" + position + ", job=" + job + ", timeTaken=" + timeTaken
				+ ", internship=" + internship + ", discussionTimeTaken=" + discussionTimeTaken + ", domainKnowledge="
				+ domainKnowledge + ", technicalExpertise=" + technicalExpertise + ", management=" + management
				+ ", quality=" + quality + ", risk=" + risk + ", skillsMatched=" + skillsMatched + ", reason=" + reason
				+ ", decision=" + decision + "]";
	}
	
	
}
