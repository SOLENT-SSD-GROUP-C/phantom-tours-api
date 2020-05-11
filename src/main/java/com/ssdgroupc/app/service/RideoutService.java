package com.ssdgroupc.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssdgroupc.app.entity.Rideout;
import com.ssdgroupc.app.repository.RideoutRepository;

@Service
public class RideoutService {

	@Autowired
	private RideoutRepository rideoutRepository;

	public Rideout addRideout(Rideout rideout) {
		return rideoutRepository.save(rideout);
	}

	public List<Rideout> getAllRideouts() {
		List<Rideout> rideouts = new ArrayList<>();
		rideoutRepository.findAll().forEach(rideouts::add);
		;
		return rideouts;
	}

	public Optional<Rideout> getRideout(int id) {
		return rideoutRepository.findById(id);
	}

	public Rideout updateRideout(int id, Rideout rideout) {
		return rideoutRepository.save(rideout);
	}

	public void deleteRideout(int id) {
		rideoutRepository.deleteById(id);
	}

}
