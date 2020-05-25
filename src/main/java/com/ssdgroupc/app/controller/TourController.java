package com.ssdgroupc.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.ssdgroupc.app.entity.Tour;
import com.ssdgroupc.app.service.TourService;

import javassist.NotFoundException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TourController {

	@Autowired
	private TourService tourService;

//	@GetMapping(value = "/tours", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<Tour>> getAllTours() throws NotFoundException {
//
//		List<Tour> tours = tourService.getAllTours();
//		if (tours.isEmpty()) {
//			throw new NotFoundException("No tour records were found");
//		}
//		return new ResponseEntity<List<Tour>>(tours, HttpStatus.OK);
//	}
//
//	@GetMapping(value = "/tours/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Tour> getTour(@PathVariable(value = "id") int id) throws NotFoundException {
//
//		Optional<Tour> t = tourService.getTour(id);
//		if (!t.isPresent()) {
//			throw new NotFoundException("tour record not found");
//		}
//		return new ResponseEntity<Tour>(t.get(), HttpStatus.OK);
//	}
//
//	@PostMapping("/tours")
//	public ResponseEntity<Tour> addTour(@Valid @RequestBody Tour tour) {
//
//		Optional<Tour> t = tourService.getTour(tour.getTourId());
//		if (t.isPresent()) {
//			throw new HttpClientErrorException(HttpStatus.CONFLICT,
//					"Tour with ID" + "(" + tour.getTourId() + ") already exists");
//		}
//
//		return new ResponseEntity<Tour>(tourService.addTour(tour), HttpStatus.CREATED);
//	}
//
//	@PutMapping(value = "/tours/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Tour> updateTour(@PathVariable(value = "id") int id, @Valid @RequestBody Tour tour) {
//		return new ResponseEntity<Tour>(tourService.updateTour(id, tour), HttpStatus.ACCEPTED);
//	}
//
//	@DeleteMapping("/tours/{id}")
//	public ResponseEntity<Object> deleteTour(@PathVariable(value = "id") int id) {
//		tourService.deleteTour(id);
//		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
//	}

	@GetMapping(value = "/tours", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tour> getAllTours() {
		return tourService.getAllTours();
	}

	@GetMapping("/tours/{id}")
	public Optional<Tour> getTour(@PathVariable(value = "id") int id) {
		return tourService.getTour(id);
	}

	@PostMapping("/tours")
	public void addTour(@Valid @RequestBody Tour tour) {
		tourService.addTour(tour);
	}

	@PutMapping("/tours/{id}")
	public void updateTour(@PathVariable(value = "id") int id, @RequestBody Tour tour) {
		tourService.updateTour(id, tour);
	}

	@DeleteMapping("/tours/{id}")
	public void deleteTour(@PathVariable(value = "id") int id) {
		tourService.deleteTour(id);
	}

}
