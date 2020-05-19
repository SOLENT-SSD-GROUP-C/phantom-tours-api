package com.ssdgroupc.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAROUSELS")
public class Carousel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int carouselId;
	@Column(length = 500)
	private String carouselImageLink;

	public Carousel() {
		super();
	}

	public Carousel(int carouselId, String carouselImageLink) {
		super();
		this.carouselId = carouselId;
		this.carouselImageLink = carouselImageLink;
	}

	public int getCarouselId() {
		return carouselId;
	}

	public void setCarouselId(int carouselId) {
		this.carouselId = carouselId;
	}

	public String getCarouselImageLink() {
		return carouselImageLink;
	}

	public void setCarouselImageLink(String carouselImageLink) {
		this.carouselImageLink = carouselImageLink;
	}

}
