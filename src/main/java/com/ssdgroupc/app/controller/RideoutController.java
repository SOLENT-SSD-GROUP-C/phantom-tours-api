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

import com.ssdgroupc.app.entity.Rideout;
import com.ssdgroupc.app.service.RideoutService;

@RestController
public class RideoutController {

	@Autowired
	private RideoutService rideoutService;

	@GetMapping("/rideouts")
	public List<Rideout> getAllTours() {
		return rideoutService.getAllRideouts();
	}

	@GetMapping("/rideouts/{id}")
	public Optional<Rideout> getTour(@PathVariable(value = "id") int id) {
		return rideoutService.getRideout(id);
	}

	@PostMapping("/rideouts")
	public void addTour(@Valid @RequestBody Rideout rideout) {
		rideoutService.addRideout(rideout);
	}

	@PutMapping("/rideouts/{id}")
	public void updateTour(@PathVariable(value = "id") int id, @RequestBody Rideout rideout) {
		rideoutService.updateRideout(id, rideout);
	}

	@DeleteMapping("/rideouts/{id}")
	public void deleteTour(@PathVariable(value = "id") int id) {
		rideoutService.deleteRideout(id);
		;
	}

}
