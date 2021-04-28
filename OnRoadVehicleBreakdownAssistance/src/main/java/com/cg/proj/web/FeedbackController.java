package com.cg.proj.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.proj.dto.FeedbackDTO;
import com.cg.proj.entity.Feedback;

import com.cg.proj.exceptions.FeedbackNotFoundException;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.UserNotFoundException;
import com.cg.proj.service.FeedbackService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackService;

	@PostMapping("/addFeedback")
	public Feedback addFeedback(@RequestBody FeedbackDTO feedback)
			throws UserNotFoundException, MechanicNotFoundException {
		return feedbackService.addFeedback(feedback);

	}

	@GetMapping("/viewfeedback/{feedbackId}")
	public Feedback getFeedback(@PathVariable("feedbackId") int feedbackId) throws FeedbackNotFoundException {
		return feedbackService.getFeedback(feedbackId);

	}

	@GetMapping("/viewallfeedbacks/{mechanicId}")
	public List<Feedback> viewAllFeedback(@PathVariable("mechanicId") int mechanicId)
			throws MechanicNotFoundException, FeedbackNotFoundException {
		return feedbackService.getAllFeedback(mechanicId);
	}
}