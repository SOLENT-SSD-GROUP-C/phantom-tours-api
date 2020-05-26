package com.ssdgroupc.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ssdgroupc.app.entity.Carousel;
import com.ssdgroupc.app.service.CarouselService;

import javassist.NotFoundException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CarouselController {

	private static final Logger LOGGER = LogManager.getLogger();

	@Autowired
	private CarouselService carouselService;

	@GetMapping(value = "/carousels", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Carousel>> getAllCarousel() throws NotFoundException {

		List<Carousel> carousels = carouselService.getAllCarousels();

		if (carousels.isEmpty()) {
			LOGGER.info("Carousel records are empty");
			throw new NotFoundException("No carousel records were found");
		}

		return new ResponseEntity<List<Carousel>>(carousels, HttpStatus.OK);
	}

	@PostMapping(value = "/carousels", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Carousel> addCarousel(@Valid @RequestBody Carousel carousel) {

		return new ResponseEntity<Carousel>(carouselService.addCarousel(carousel), HttpStatus.CREATED);
	}

	@DeleteMapping("/carousels/{id}")
	public ResponseEntity<Object> deletCarousel(@PathVariable(value = "id") int id) {

		carouselService.deleteCarousel(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}

//	@GetMapping("/carousels")
//	public List<Carousel> getAllCarousel() {
//		return carouselService.getAllCarousels();
//	}
//
//
//	@PostMapping("/carousels")
//	public void addCarousel(@Valid @RequestBody Carousel carousel) {
//		carouselService.addCarousel(carousel);
//	}
//
//
//	@DeleteMapping("/carousels/{id}")
//	public void deletCarousel(@PathVariable(value = "id") int id) {
//		carouselService.deleteCarousel(id);
//	}

}
