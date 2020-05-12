package com.ssdgroupc.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssdgroupc.app.entity.Reservation;
import com.ssdgroupc.app.service.ReservationService;

@RestController
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@GetMapping("/reservations")
	public List<Reservation> getAllReservations() {
		return reservationService.getAllReservations();
	}

	@GetMapping("/reservations/{id}")
	public Optional<Reservation> getReservation(@PathVariable(value = "id") int id) {
		return reservationService.getReservation(id);
	}

	@PostMapping("/reservations")
	public void addReservation(@Valid @RequestBody Reservation reservation) {
		reservationService.addReservation(reservation);
	}

	@DeleteMapping("/reservations/{id}")
	public void deleteReservation(@PathVariable(value = "id") int id) {
		reservationService.deleteReservation(id);
		;
	}

}
