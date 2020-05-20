package com.ssdgroupc.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "GALLERY_ITEMS")
public class GalleryItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int galleryItemId;
	@NotNull
	@Column(length = 500)
	private String galleryImageLink;

	public GalleryItem() {
		super();
	}

	public GalleryItem(int galleryItemId, String galleryImageLink) {
		super();
		this.galleryItemId = galleryItemId;
		this.galleryImageLink = galleryImageLink;
	}

	public int getGalleryItemId() {
		return galleryItemId;
	}

	public void setGalleryItemId(int galleryItemId) {
		this.galleryItemId = galleryItemId;
	}

	public String getGalleryImageLink() {
		return galleryImageLink;
	}

	public void setGalleryImageLink(String galleryImageLink) {
		this.galleryImageLink = galleryImageLink;
	}

}
