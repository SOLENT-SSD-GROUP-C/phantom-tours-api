package com.ssdgroupc.app.entity;

public class Inquiry {

	private int inquiryId;
	private String inquiryTitle;
	private String userFullName;
	private String userEmail;
	private String userPhone;
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
