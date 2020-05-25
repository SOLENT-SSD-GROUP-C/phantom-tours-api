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
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

	@PostMapping(value = "/bikes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addBike(@Valid @RequestBody Bike bike) {

		bikeService.addBike(bike);
	}

//	@PostMapping(value = "/bikes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Bike> addBike(@Valid @RequestBody Bike bike) {
//
//		return new ResponseEntity<Bike>(bikeService.addBike(bike), HttpStatus.CREATED);
//	}

	@DeleteMapping("/bikes/{id}")
	public void deleteBike(@PathVariable(value = "id") int id) {
		bikeService.deleteBike(id);
	}

//	@DeleteMapping("/bikes/{id}")
//	public ResponseEntity<Object> deleteBike(@PathVariable(value = "id") int id) {
//		bikeService.deleteBike(id);
//		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
//	}

}
