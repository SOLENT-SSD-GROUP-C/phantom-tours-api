package com.ssdgroupc.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssdgroupc.app.entity.GalleryItem;
import com.ssdgroupc.app.repository.GalleryItemRepository;

@Service
public class GalleryItemService {

	@Autowired
	private GalleryItemRepository galleryItemRepository;

	public GalleryItem addGalleryItem(GalleryItem galleryItem) {
		return galleryItemRepository.save(galleryItem);
	}

	public List<GalleryItem> getAllGalleryItems() {
		List<GalleryItem> galleryItems = new ArrayList<>();
		galleryItemRepository.findAll().forEach(galleryItems::add);
		return galleryItems;
	}

	public void deleteGalleryItem(int id) {
		galleryItemRepository.deleteById(id);
	}

}
