package com.ssdgroupc.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.ssdgroupc.app.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

}
