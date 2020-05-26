package com.ssdgroupc.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssdgroupc.app.entity.Reservation;
import com.ssdgroupc.app.entity.Rideout;
import com.ssdgroupc.app.entity.Tour;
import com.ssdgroupc.app.service.ReservationService;

import javassist.NotFoundException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ReservationController {
	
	private static final Logger LOGGER = LogManager.getLogger();

	@Autowired
	private ReservationService reservationService;

	@GetMapping(value = "reservations", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Reservation>> getAllReservations() throws NotFoundException {

		List<Reservation> items = reservationService.getAllReservations();

		if (items.isEmpty()) {
			LOGGER.info("Reservation records are empty");
			throw new NotFoundException("No Reservation records were found");
		}

		return new ResponseEntity<List<Reservation>>(items, HttpStatus.OK);
	}

	@GetMapping(value = "reservations/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Reservation> getReservation(@PathVariable(value = "id") int id) throws NotFoundException {

		Optional<Reservation> item = reservationService.getReservation(id);

		if (!item.isPresent()) {
			LOGGER.info("Reservation record not found");
			throw new NotFoundException("No Reservation record were found");
		}

		return new ResponseEntity<Reservation>(item.get(), HttpStatus.OK);

	}

	@PostMapping(value = "tours/{tourId}/reservations", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Reservation> addReservationForTour(@Valid @RequestBody Reservation reservation,
			@PathVariable int tourId) {

		reservation.setTour(new Tour(tourId));
		return new ResponseEntity<Reservation>(reservationService.addReservation(reservation), HttpStatus.CREATED);
	}

	@PostMapping(value = "rideouts/{rideoutId}/reservations", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Reservation> addReservationForRideout(@Valid @RequestBody Reservation reservation,
			@PathVariable int rideoutId) {

		reservation.setRideout(new Rideout(rideoutId));
		return new ResponseEntity<Reservation>(reservationService.addReservation(reservation), HttpStatus.CREATED);
	}

	@DeleteMapping("reservations/{id}")
	public ResponseEntity<Object> deleteReservation(@PathVariable(value = "id") int id) {

		reservationService.deleteReservation(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}

}
