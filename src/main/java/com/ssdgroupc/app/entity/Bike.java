package com.ssdgroupc.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bikes")
public class Bike {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bikeId;
	private String bikeName;
	private String bikeDescription;
	private String bikeImageLink;

	public Bike(int bikeId, String bikeName, String bikeDescription, String imageLink) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.bikeDescription = bikeDescription;
		this.bikeImageLink = imageLink;
	}

	public Bike() {
		super();
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeDescription() {
		return bikeDescription;
	}

	public void setBikeDescription(String bikeDescription) {
		this.bikeDescription = bikeDescription;
	}

	public String getBikeImageLink() {
		return bikeImageLink;
	}

	public void setBikeImageLink(String imageLink) {
		this.bikeImageLink = imageLink;
	}

}
