package com.ssdgroupc.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssdgroupc.app.entity.GalleryItem;
import com.ssdgroupc.app.service.GalleryItemService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class GalleryItemController {

	@Autowired
	private GalleryItemService galleryItemService;

	@GetMapping("/galleryItems")
	public List<GalleryItem> getAllGalleryItems() {
		return galleryItemService.getAllGalleryItems();
	}

	@PostMapping("/galleryItems")
	public void addGalleryItem(@Valid @RequestBody GalleryItem galleryItem) {
		galleryItemService.addGalleryItem(galleryItem);
	}

	@DeleteMapping("/galleryItems/{id}")
	public void deleteGalleryItem(@PathVariable(value = "id") int id) {
		galleryItemService.deleteGalleryItem(id);
	}

}
