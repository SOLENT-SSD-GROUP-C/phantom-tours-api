package com.ssdgroupc.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssdgroupc.app.entity.Tour;
import com.ssdgroupc.app.repository.TourRepository;

@Service
public class TourService {

	@Autowired
	private TourRepository tourRepository;

	public Tour addTour(Tour tour) {
		return tourRepository.save(tour);
	}

	public List<Tour> getAllTours() {
		List<Tour> tours = new ArrayList<>();
		tourRepository.findAll().forEach(tours::add);
		return tours;
	}

	public Optional<Tour> getTour(int id) {
		return tourRepository.findById(id);
	}

	public Tour updateTour(int id, Tour tour) {
		return tourRepository.save(tour);
	}

	public void deleteTour(int id) {
		tourRepository.deleteById(id);
	}

}
