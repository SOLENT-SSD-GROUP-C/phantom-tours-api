package com.ssdgroupc.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssdgroupc.app.entity.Carousel;
import com.ssdgroupc.app.repository.CarouselRepository;

@Service
public class CarouselService {

	@Autowired
	private CarouselRepository carouselRepository;

	public Carousel addCarousel(Carousel carousel) {
		return carouselRepository.save(carousel);
	}

	public List<Carousel> getAllCarousels() {
		List<Carousel> carousels = new ArrayList<>();
		carouselRepository.findAll().forEach(carousels::add);
		return carousels;
	}

	public void deleteCarousel(int id) {
		carouselRepository.deleteById(id);
	}

}
