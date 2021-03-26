package com.cg.proj.service;

import java.util.List;
import java.util.Optional;

import com.cg.proj.entity.Feedback;
import com.cg.proj.exceptions.FeedbackNotFoundException;


public interface FeedbackService {
	Feedback addFeedback(Feedback fdb);
	Feedback getFeedback(int feedbackId) throws FeedbackNotFoundException;
	//feedback by mechid returns list of mech
	
	List<Feedback> getAllFeedback();
	
}
