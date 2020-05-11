package com.ssdgroupc.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssdgroupc.app.entity.Feedback;
import com.ssdgroupc.app.repository.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;

	public Feedback addFeedback(Feedback feedback) {
		return feedbackRepository.save(feedback);
	}

	public List<Feedback> getAllFeedbacks() {
		List<Feedback> feedbacks = new ArrayList<>();
		feedbackRepository.findAll().forEach(feedbacks::add);
		return feedbacks;
	}

	public void deleteFeedback(int id) {
		feedbackRepository.deleteById(id);
	}

}
