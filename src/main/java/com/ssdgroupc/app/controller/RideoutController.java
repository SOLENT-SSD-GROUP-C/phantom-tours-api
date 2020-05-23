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

import com.ssdgroupc.app.entity.Rideout;
import com.ssdgroupc.app.service.RideoutService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class RideoutController {

	@Autowired
	private RideoutService rideoutService;

	@GetMapping(value = "/rideouts", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Rideout>> getAllTours() {

		List<Rideout> rideouts = rideoutService.getAllRideouts();
		return new ResponseEntity<List<Rideout>>(rideouts, HttpStatus.OK);
	}

	@GetMapping(value = "/rideouts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Rideout> getTour(@PathVariable(value = "id") int id) {
		Optional<Rideout> rideout = rideoutService.getRideout(id);
		return new ResponseEntity<Rideout>(rideout.get(), HttpStatus.OK);
	}

	@PostMapping(value = "/rideouts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Rideout> addRideout(@Valid @RequestBody Rideout rideout) {

		Optional<Rideout> r = rideoutService.getRideout(rideout.getRideoutId());
		if (r.isPresent()) {
			throw new HttpClientErrorException(HttpStatus.CONFLICT,
					"Rideout with ID" + "(" + rideout.getRideoutId() + ") already exists");
		}

		return new ResponseEntity<Rideout>(rideoutService.addRideout(rideout), HttpStatus.CREATED);
	}

	@PutMapping(value = "/rideouts/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Rideout> updateRideout(@PathVariable(value = "id") int id, @RequestBody Rideout rideout) {

		return new ResponseEntity<Rideout>(rideoutService.updateRideout(id, rideout), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/rideouts/{id}")
	public ResponseEntity<Object> deleteRideout(@PathVariable(value = "id") int id) {
		rideoutService.deleteRideout(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}

}
