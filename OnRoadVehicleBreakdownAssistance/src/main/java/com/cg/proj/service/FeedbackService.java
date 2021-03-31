package com.cg.proj.service;

import java.util.List;


import com.cg.proj.DTO.FeedbackDTO;
import com.cg.proj.entity.Feedback;
import com.cg.proj.exceptions.FeedbackNotFoundException;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.UserNotFoundException;

public interface FeedbackService {
	Feedback addFeedback(FeedbackDTO fdb) throws UserNotFoundException, MechanicNotFoundException;

	Feedback getFeedback(int feedbackId) throws FeedbackNotFoundException;
	// feedback by mechid returns list of mech

	List<Feedback> getAllFeedback(int mechanicId) throws MechanicNotFoundException, FeedbackNotFoundException;

}