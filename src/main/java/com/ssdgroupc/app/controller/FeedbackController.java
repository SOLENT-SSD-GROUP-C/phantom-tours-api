package com.ssdgroupc.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssdgroupc.app.entity.Feedback;
import com.ssdgroupc.app.service.FeedbackService;

@RestController
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;

	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedback() {
		return feedbackService.getAllFeedbacks();
	}

	@PostMapping("/feedbacks")
	public void addFeedback(@Valid @RequestBody Feedback feedback) {
		feedbackService.addFeedback(feedback);
	}

	@DeleteMapping("/feedbacks/{id}")
	public void deletFeedback(@PathVariable(value = "id") int id) {
		feedbackService.deleteFeedback(id);
	}

}
