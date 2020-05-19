package com.ssdgroupc.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "RIDEOUTS")
public class Rideout {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rideoutId;
	private String rideoutTitle;
	@Lob
	@Column(length = 2500)
	private String rideoutDescription;
	@Column(length = 250)
	private String rideoutLocationImageLink;
	private Date rideoutDate;
	private String rideoutStartingPoint;
	private String rideoutEndingPoint;

	public Rideout() {
		super();
	}

	public Rideout(int rideoutId) {
		this.rideoutId = rideoutId;
	}

	public Rideout(int rideoutId, String rideoutTitle, String rideoutDescription, String rideoutLocationImageLink,
			Date rideoutDate, String rideoutStartingPoint, String rideoutEndingPoint) {
		super();
		this.rideoutId = rideoutId;
		this.rideoutTitle = rideoutTitle;
		this.rideoutDescription = rideoutDescription;
		this.rideoutLocationImageLink = rideoutLocationImageLink;
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

	public String getRideoutLocationImageLink() {
		return rideoutLocationImageLink;
	}

	public void setRideoutLocationImageLink(String rideoutLocationImageLink) {
		this.rideoutLocationImageLink = rideoutLocationImageLink;
	}

}
