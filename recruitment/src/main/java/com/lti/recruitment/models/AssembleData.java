package com.lti.recruitment.models;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




@Entity
@Table(name="assemble_data")
public class AssembleData {
	@Id
	@GeneratedValue
	@Column(name ="Form_id_three")
	private int formIdThree;  
	
	@Column(name ="cv")
	private String cv;  
	

	@Column(name ="mailId")
	private String mailId;
	
	@NotNull
	@Column(name ="source")
	private String source;
	
	@NotNull
	@Column(name ="dob")
	private Date dob;
	
	@NotNull
	@Column(name ="contact")
	private long contact;
	
	@NotNull
	@Column(name ="registrationDate")
	private Date registrationDate;

	public int getFormIdThree() {
		return formIdThree;
	}

	public void setFormIdThree(int formIdThree) {
		this.formIdThree = formIdThree;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public AssembleData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssembleData(int formIdThree, String cv, String mailId, @NotNull String source, @NotNull Date dob,
			@NotNull long contact, @NotNull Date registrationDate) {
		super();
		this.formIdThree = formIdThree;
		this.cv = cv;
		this.mailId = mailId;
		this.source = source;
		this.dob = dob;
		this.contact = contact;
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "AssembleData [formIdThree=" + formIdThree + ", cv=" + cv + ", mailId=" + mailId + ", source=" + source
				+ ", dob=" + dob + ", contact=" + contact + ", registrationDate=" + registrationDate + "]";
	}

	
	
}