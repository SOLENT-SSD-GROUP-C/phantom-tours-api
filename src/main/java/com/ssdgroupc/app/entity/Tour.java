package com.ssdgroupc.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "TOURS")
public class Tour {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tourId;
	private String tourTitle;
	@Lob
	@Column(length = 2500)
	private String tourDescription;
	@Column(length = 250)
	private String tourLocationImageLink;
	private int tourDays;
	private double tourDistance;
	private double tourPrice;
	private int tourGroupSize;
	private String tourTerrain;
	private String tourStartingPoint;
	private String tourEndingPoint;
	private boolean tourAvailability;
	@Column(length = 250)
	private String tourRouteMapLink;

	public Tour() {
		super();
	}

	public Tour(int tourId) {
		this.tourId = tourId;
	}

	public Tour(int tourId, int tourGroupSize, int tourDays, double tourDistance, double tourPrice,
			boolean tourAvailability, String tourTitle, String tourDescription, String tourTerrain,
			String tourStartingPoint, String tourEndingPoint, String tourLocationImageLink, String tourRouteMapLink) {
		super();
		this.tourId = tourId;
		this.tourGroupSize = tourGroupSize;
		this.tourDays = tourDays;
		this.tourDistance = tourDistance;
		this.tourPrice = tourPrice;
		this.tourAvailability = tourAvailability;
		this.tourTitle = tourTitle;
		this.tourDescription = tourDescription;
		this.tourTerrain = tourTerrain;
		this.tourStartingPoint = tourStartingPoint;
		this.tourEndingPoint = tourEndingPoint;
		this.tourLocationImageLink = tourLocationImageLink;
		this.tourRouteMapLink = tourRouteMapLink;
	}

	public int getTourId() {
		return tourId;
	}

	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	public int getTourGroupSize() {
		return tourGroupSize;
	}

	public void setTourGroupSize(int tourGroupSize) {
		this.tourGroupSize = tourGroupSize;
	}

	public int getTourDays() {
		return tourDays;
	}

	public void setTourDays(int tourDays) {
		this.tourDays = tourDays;
	}

	public double getTourDistance() {
		return tourDistance;
	}

	public void setTourDistance(double tourDistance) {
		this.tourDistance = tourDistance;
	}

	public double getTourPrice() {
		return tourPrice;
	}

	public void setTourPrice(double tourPrice) {
		this.tourPrice = tourPrice;
	}

	public boolean isTourAvailability() {
		return tourAvailability;
	}

	public void setTourAvailability(boolean tourAvailability) {
		this.tourAvailability = tourAvailability;
	}

	public String getTourTitle() {
		return tourTitle;
	}

	public void setTourTitle(String tourTitle) {
		this.tourTitle = tourTitle;
	}

	public String getTourDescription() {
		return tourDescription;
	}

	public void setTourDescription(String tourDescription) {
		this.tourDescription = tourDescription;
	}

	public String getTourTerrain() {
		return tourTerrain;
	}

	public void setTourTerrain(String tourTerrain) {
		this.tourTerrain = tourTerrain;
	}

	public String getTourStartingPoint() {
		return tourStartingPoint;
	}

	public void setTourStartingPoint(String tourStartingPoint) {
		this.tourStartingPoint = tourStartingPoint;
	}

	public String getTourEndingPoint() {
		return tourEndingPoint;
	}

	public void setTourEndingPoint(String tourEndingPoint) {
		this.tourEndingPoint = tourEndingPoint;
	}

	public String getTourLocationImageLink() {
		return tourLocationImageLink;
	}

	public void setTourLocationImageLink(String tourLocationImageLink) {
		this.tourLocationImageLink = tourLocationImageLink;
	}

	public String getTourRouteMapLink() {
		return tourRouteMapLink;
	}

	public void setTourRouteMapLink(String tourRouteMapLink) {
		this.tourRouteMapLink = tourRouteMapLink;
	}
}
