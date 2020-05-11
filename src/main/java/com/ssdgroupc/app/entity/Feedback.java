package com.ssdgroupc.app.entity;

public class Feedback {

	private int feedbackId;
	private String feedbackBody;

	public Feedback() {
		super();
	}

	public Feedback(int feedbackId, String feedbackBody) {
		super();
		this.feedbackId = feedbackId;
		this.setFeedbackBody(feedbackBody);
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackBody() {
		return feedbackBody;
	}

	public void setFeedbackBody(String feedbackBody) {
		this.feedbackBody = feedbackBody;
	}

}
