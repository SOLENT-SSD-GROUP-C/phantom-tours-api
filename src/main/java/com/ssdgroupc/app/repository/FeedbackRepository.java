package com.ssdgroupc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ssdgroupc.app.entity.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {
//	public List<Feedback> findByUserUserId(int userId);
}
