package com.ssdgroupc.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssdgroupc.app.entity.Tour;
import com.ssdgroupc.app.service.TourService;

@RestController
public class TourController {

	@Autowired
	private TourService tourService;

	@GetMapping("/tours")
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
		;
	}

}
