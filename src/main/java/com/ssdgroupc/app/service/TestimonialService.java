package com.ssdgroupc.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssdgroupc.app.entity.Testimonial;
import com.ssdgroupc.app.repository.TestimonialRepository;

@Service
public class TestimonialService {

	@Autowired
	private TestimonialRepository testimonialRepository;

	public Testimonial addTestimonial(Testimonial testimonial) {
		return testimonialRepository.save(testimonial);
	}

	public List<Testimonial> getAllTestimonials() {
		List<Testimonial> testimonials = new ArrayList<>();
		testimonialRepository.findAll().forEach(testimonials::add);
		return testimonials;
	}

	public void deleteTestimonial(int id) {
		testimonialRepository.deleteById(id);
	}

}
