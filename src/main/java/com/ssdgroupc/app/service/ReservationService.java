package com.ssdgroupc.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssdgroupc.app.entity.Reservation;
import com.ssdgroupc.app.repository.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;

	public Reservation addReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	public List<Reservation> getAllReservations() {
		List<Reservation> reservations = new ArrayList<>();
		reservationRepository.findAll().forEach(reservations::add);
		return reservations;
	}
	
	public Optional<Reservation> getReservation(int id) {
		return reservationRepository.findById(id);
	}
//	
//	public List<Reservation> getReservation(int tourId) {
//		return reservationRepository.findByTourTourId(tourId);
//	}


	public void deleteReservation(int id) {
		reservationRepository.deleteById(id);
	}

}
