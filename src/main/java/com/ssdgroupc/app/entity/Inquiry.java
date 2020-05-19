package com.ssdgroupc.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="INQUIRIES")
public class Inquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int inquiryId;
	private String inquiryTitle;
	private String userFullName;
	private String userEmail;
	private String userPhone;
	@Lob
	@Column(length = 1000)
	private String inquiryBody;

	public Inquiry() {
		super();
	}

	public Inquiry(int inquiryId, String inquiryTitle, String userFullName, String userEmail, String userPhone,
			String inquiryBody) {
		super();
		this.inquiryId = inquiryId;
		this.inquiryTitle = inquiryTitle;
		this.userFullName = userFullName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.inquiryBody = inquiryBody;
	}

	public int getInquiryId() {
		return inquiryId;
	}

	public void setInquiryId(int inquiryId) {
		this.inquiryId = inquiryId;
	}

	public String getInquiryTitle() {
		return inquiryTitle;
	}

	public void setInquiryTitle(String inquiryTitle) {
		this.inquiryTitle = inquiryTitle;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getInquiryBody() {
		return inquiryBody;
	}

	public void setInquiryBody(String inquiryBody) {
		this.inquiryBody = inquiryBody;
	}

}
