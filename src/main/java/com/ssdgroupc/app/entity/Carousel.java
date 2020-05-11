package com.ssdgroupc.app.entity;

import java.awt.image.BufferedImage;

public class Carousel {
	private int carouselId;
	private BufferedImage carouselImageLink;

	public Carousel() {
		super();
	}

	public Carousel(int carouselId, BufferedImage carouselImageLink) {
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

	public BufferedImage getCarouselImageLink() {
		return carouselImageLink;
	}

	public void setCarouselImageLink(BufferedImage carouselImageLink) {
		this.carouselImageLink = carouselImageLink;
	}

}
