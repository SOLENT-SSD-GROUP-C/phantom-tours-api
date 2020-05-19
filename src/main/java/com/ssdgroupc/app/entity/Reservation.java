package com.ssdgroupc.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVATIONS")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reservationId;
	private String reservationType;
	private String userFullName;
	private String userEmail;
	private String userPhone;
	@ManyToOne
	private Tour tour;
	@ManyToOne
	private Rideout rideout;

	public Reservation() {
		super();
	}

	public Reservation(int reservationId,String reservationType, String userFullName, String userEmail, String userPhone, Tour tour) {
		super();
		this.reservationId = reservationId;
		this.reservationType = reservationType;
		this.userFullName = userFullName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.tour = tour;
	}
	public Reservation(int reservationId,String reservationType, String userFullName, String userEmail, String userPhone, Rideout rideout) {
		super();
		this.reservationId = reservationId;
		this.reservationType = reservationType;
		this.userFullName = userFullName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.rideout = rideout;
	}

//	public Reservation(int reservationId, String reservationType, String reservationName, String userFullName,
//			String userEmail, String userPhone, Tour tour) {
//		super();
//		this.reservationId = reservationId;
//		this.reservationType = reservationType;
//		this.reservationName = reservationName;
//		this.userFullName = userFullName;
//		this.userEmail = userEmail;
//		this.userPhone = userPhone;
//		this.tour = tour;
//	}

//	public Reservation(int reservationId, String reservationType, String reservationName, String userFullName,
//			String userEmail, String userPhone) {
//		super();
//		this.reservationId = reservationId;
//		this.reservationType = reservationType;
//		this.reservationName = reservationName;
//		this.userFullName = userFullName;
//		this.userEmail = userEmail;
//		this.userPhone = userPhone;
//	}

	public Rideout getRideout() {
		return rideout;
	}

	public void setRideout(Rideout rideout) {
		this.rideout = rideout;
	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
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

	public String getReservationType() {
		return reservationType;
	}

	public void setReservationType(String reservationType) {
		this.reservationType = reservationType;
	}

}
