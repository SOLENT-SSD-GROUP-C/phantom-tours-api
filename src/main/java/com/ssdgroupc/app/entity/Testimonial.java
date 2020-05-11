package com.ssdgroupc.app.entity;

public class Testimonial {
	private int testimonialId;
	private String testimonialDescription;

	public Testimonial() {
		super();
	}

	public Testimonial(int testimonialId, String testimonialDescription) {
		super();
		this.testimonialId = testimonialId;
		this.testimonialDescription = testimonialDescription;
	}

	public int getTestimonialId() {
		return testimonialId;
	}

	public void setTestimonialId(int testimonialId) {
		this.testimonialId = testimonialId;
	}

	public String getTestimonialDescription() {
		return testimonialDescription;
	}

	public void setTestimonialDescription(String testimonialDescription) {
		this.testimonialDescription = testimonialDescription;
	}

}
