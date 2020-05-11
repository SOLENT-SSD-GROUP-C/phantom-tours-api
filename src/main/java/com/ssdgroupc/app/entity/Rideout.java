package com.ssdgroupc.app.entity;

import java.util.Date;

public class Rideout {

	private int rideoutId;
	private String rideoutTitle;
	private String rideoutDescription;
	private Date rideoutDate;
	private String rideoutStartingPoint;
	private String rideoutEndingPoint;

	public Rideout() {
		super();
	}

	public Rideout(int rideoutId, String rideoutTitle, String rideoutDescription, Date rideoutDate,
			String rideoutStartingPoint, String rideoutEndingPoint) {
		super();
		this.rideoutId = rideoutId;
		this.rideoutTitle = rideoutTitle;
		this.rideoutDescription = rideoutDescription;
		this.rideoutDate = rideoutDate;
		this.rideoutStartingPoint = rideoutStartingPoint;
		this.rideoutEndingPoint = rideoutEndingPoint;
	}

	public int getRideoutId() {
		return rideoutId;
	}

	public void setRideoutId(int rideoutId) {
		this.rideoutId = rideoutId;
	}

	public String getRideoutTitle() {
		return rideoutTitle;
	}

	public void setRideoutTitle(String rideoutTitle) {
		this.rideoutTitle = rideoutTitle;
	}

	public String getRideoutDescription() {
		return rideoutDescription;
	}

	public void setRideoutDescription(String rideoutDescription) {
		this.rideoutDescription = rideoutDescription;
	}

	public Date getRideoutDate() {
		return rideoutDate;
	}

	public void setRideoutDate(Date rideoutDate) {
		this.rideoutDate = rideoutDate;
	}

	public String getRideoutStartingPoint() {
		return rideoutStartingPoint;
	}

	public void setRideoutStartingPoint(String rideoutStartingPoint) {
		this.rideoutStartingPoint = rideoutStartingPoint;
	}

	public String getRideoutEndingPoint() {
		return rideoutEndingPoint;
	}

	public void setRideoutEndingPoint(String rideoutEndingPoint) {
		this.rideoutEndingPoint = rideoutEndingPoint;
	}

}
