package com.ssdgroupc.app.entity;

public class GalleryItem {

	private int galleryItemId;
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
