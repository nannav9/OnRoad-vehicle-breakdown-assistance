package com.cg.proj.service;

import java.util.List;

import com.cg.proj.entity.Feedback;

public interface FeedbackService {
	Feedback addFeedback(Feedback fdb);
	Feedback getFeedback(Feedback fdb);
	List<Feedback> getAllFeedback();
}
