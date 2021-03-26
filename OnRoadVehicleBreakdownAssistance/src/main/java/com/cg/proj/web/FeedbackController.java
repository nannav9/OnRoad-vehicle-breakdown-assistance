package com.cg.proj.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cg.proj.entity.Feedback;

import com.cg.proj.exceptions.FeedbackNotFoundException;

import com.cg.proj.service.FeedbackService;

@RestController
public class FeedbackController {
	@Autowired
private FeedbackService feedbackService;
	
	@PostMapping("addFeedback")
	public Feedback addFeedback(@RequestBody Feedback feedback)
		{
		return feedbackService.addFeedback(feedback);
			
		}
	@GetMapping("viewfeedback/{feedbackId}")
	public Optional<Feedback> getFeedback(@PathVariable("feedbackId") int feedbackId) throws FeedbackNotFoundException
	{
		return feedbackService.getFeedback(feedbackId);
		
	}
	@GetMapping("viewallfeedbacks")
	public  List<Feedback> viewAllFeedback() 
	{
		return feedbackService.getAllFeedback();
	}
}
