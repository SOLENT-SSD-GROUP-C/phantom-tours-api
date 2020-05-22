package com.ssdgroupc.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@GetMapping("reservations")
	public List<Reservation> getAllReservations() {
		return reservationService.getAllReservations();
	}

	@GetMapping("reservations/{id}")
	public Optional<Reservation> getReservation(@PathVariable(value = "id") int id) {
		return reservationService.getReservation(id);
	}

	@PostMapping("tours/{tourId}/reservations")
	public void addReservationForTour(@Valid @RequestBody Reservation reservation, @PathVariable int tourId) {
		reservation.setTour(new Tour(tourId));
		reservationService.addReservation(reservation);
	}

	@PostMapping("rideouts/{rideoutId}/reservations")
	public void addReservationForRideout(@Valid @RequestBody Reservation reservation, @PathVariable int rideoutId) {
		reservation.setRideout(new Rideout(rideoutId));
		reservationService.addReservation(reservation);
	}

	@DeleteMapping("reservations/{id}")
	public void deleteReservation(@PathVariable(value = "id") int id) {
		reservationService.deleteReservation(id);
		;
	}

}
