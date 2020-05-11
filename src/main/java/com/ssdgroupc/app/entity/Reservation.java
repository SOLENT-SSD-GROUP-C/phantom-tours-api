package com.ssdgroupc.app.entity;

public class Reservation {

	private int reservationId;
	private String reservationType;
	private String reservationName;
	private String userFullName;
	private String userEmail;
	private String userPhone;
	private String reservationBody;

	public Reservation() {
		super();
	}

	public Reservation(int reservationId, String reservationType, String reservationName, String userFullName,
			String userEmail, String userPhone, String reservationBody) {
		super();
		this.reservationId = reservationId;
		this.reservationType = reservationType;
		this.reservationName = reservationName;
		this.userFullName = userFullName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.reservationBody = reservationBody;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public String getReservationName() {
		return reservationName;
	}

	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
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

	public String getReservationBody() {
		return reservationBody;
	}

	public void setReservationBody(String reservationBody) {
		this.reservationBody = reservationBody;
	}

	public String getReservationType() {
		return reservationType;
	}

	public void setReservationType(String reservationType) {
		this.reservationType = reservationType;
	}

}
