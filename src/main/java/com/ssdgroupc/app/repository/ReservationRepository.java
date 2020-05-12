package com.ssdgroupc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ssdgroupc.app.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
	public List<Reservation> findByuserId(int userId);
}
