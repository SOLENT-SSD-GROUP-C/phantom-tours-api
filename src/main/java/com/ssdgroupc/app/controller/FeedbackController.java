package com.ssdgroupc.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssdgroupc.app.entity.Feedback;
import com.ssdgroupc.app.entity.Tour;
import com.ssdgroupc.app.service.FeedbackService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;

	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks() {
		return feedbackService.getAllFeedbacks();
	}

	@PostMapping("tours/{tourId}/feedbacks")
	public void addFeedback(@Valid @RequestBody Feedback feedback, @PathVariable int tourId) {
		feedback.setTour(new Tour(tourId));
		feedbackService.addFeedback(feedback);
	}

	@DeleteMapping("feedbacks/{id}")
	public void deletFeedback(@PathVariable int id) {
		feedbackService.deleteFeedback(id);
	}

}
