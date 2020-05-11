package com.ssdgroupc.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssdgroupc.app.entity.Bike;
import com.ssdgroupc.app.repository.BikeRepository;

@Service
public class BikeService {

	@Autowired
	private BikeRepository bikeRepository;

	public Bike addBike(Bike bike) {
		return bikeRepository.save(bike);
	}

	public List<Bike> getAllBikes() {
		List<Bike> bikes = new ArrayList<>();
		bikeRepository.findAll().forEach(bikes::add);
		return bikes;
	}

	public Bike updateBike(int id, Bike bike) {
		return bikeRepository.save(bike);
	}

	public void deleteBike(int id) {
		bikeRepository.deleteById(id);
	}

}
