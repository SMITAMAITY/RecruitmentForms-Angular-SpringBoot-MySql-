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
@Table(name="hr_discussion")
public class HRDiscussion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_nine")
	private int formIdNine; 
	
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
	
	@Column(name ="domainKnowledge")
	private String domainKnowledge; 
	
	@Column(name ="management")
	private String management; 
	
	@Column(name ="quality")
	private String quality; 
	
	@Column(name ="risk")
	private String risk; 
	
	@Column(name ="skillsMatched")
	private String skillsMatched; 
	
	@Column(name ="behaviour")
	private String behaviour;  
	
	@Column(name ="personalEffectivenesss")
	private String personalEffectiveness; 
	
	@Column(name ="confirmation")
	private String confirmation; 
	
	@Column(name ="noticePeriod")
	private Time noticePeriod; 
	
	@Column(name ="bond")
	private Time bond;
	
	@Column(name ="reason")
	private String reason; 
	
	@Column(name ="decision")
	private String decision;

	public int getFormIdNine() {
		return formIdNine;
	}

	public void setFormIdNine(int formIdNine) {
		this.formIdNine = formIdNine;
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

	public String getDomainKnowledge() {
		return domainKnowledge;
	}

	public void setDomainKnowledge(String domainKnowledge) {
		this.domainKnowledge = domainKnowledge;
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

	public String getSkillsMatched() {
		return skillsMatched;
	}

	public void setSkillsMatched(String skillsMatched) {
		this.skillsMatched = skillsMatched;
	}

	public String getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}

	public String getPersonalEffectiveness() {
		return personalEffectiveness;
	}

	public void setPersonalEffectiveness(String personalEffectiveness) {
		this.personalEffectiveness = personalEffectiveness;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public Time getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(Time noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	public Time getBond() {
		return bond;
	}

	public void setBond(Time bond) {
		this.bond = bond;
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

	public HRDiscussion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HRDiscussion(int formIdNine, String mailId, String name, String cv, Date dob, int contact,
			Date registrationDate, Date discussionDate, String position, String job, Time timeTaken, String internship,
			String domainKnowledge, String management, String quality, String risk, String skillsMatched,
			String behaviour, String personalEffectiveness, String confirmation, Time noticePeriod, Time bond,
			String reason, String decision) {
		super();
		this.formIdNine = formIdNine;
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
		this.domainKnowledge = domainKnowledge;
		this.management = management;
		this.quality = quality;
		this.risk = risk;
		this.skillsMatched = skillsMatched;
		this.behaviour = behaviour;
		this.personalEffectiveness = personalEffectiveness;
		this.confirmation = confirmation;
		this.noticePeriod = noticePeriod;
		this.bond = bond;
		this.reason = reason;
		this.decision = decision;
	}

	@Override
	public String toString() {
		return "HRDiscussion [formIdNine=" + formIdNine + ", mailId=" + mailId + ", Name=" + Name + ", cv=" + cv
				+ ", dob=" + dob + ", contact=" + contact + ", registrationDate=" + registrationDate
				+ ", discussionDate=" + discussionDate + ", position=" + position + ", job=" + job + ", timeTaken="
				+ timeTaken + ", internship=" + internship + ", domainKnowledge=" + domainKnowledge + ", management="
				+ management + ", quality=" + quality + ", risk=" + risk + ", skillsMatched=" + skillsMatched
				+ ", behaviour=" + behaviour + ", personalEffectiveness=" + personalEffectiveness + ", confirmation="
				+ confirmation + ", noticePeriod=" + noticePeriod + ", bond=" + bond + ", reason=" + reason
				+ ", decision=" + decision + "]";
	}

	
}
