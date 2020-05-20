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

import com.ssdgroupc.app.entity.Bike;
import com.ssdgroupc.app.service.BikeService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class BikeController {

	@Autowired
	private BikeService bikeService;

	@GetMapping("/bikes")
	public List<Bike> getAllBikes() {
		return bikeService.getAllBikes();
	}

	@PostMapping("/bikes")
	public void addBike(@Valid @RequestBody Bike bike) {
		bikeService.addBike(bike);
	}

	@DeleteMapping("/bikes/{id}")
	public void deleteBike(@PathVariable(value = "id") int id) {
		bikeService.deleteBike(id);
	}

}
