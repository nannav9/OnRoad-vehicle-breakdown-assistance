package com.cg.proj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.proj.entity.Feedback;
import com.cg.proj.exceptions.FeedbackNotFoundException;
import com.cg.proj.repository.FeedbackDAO;
import com.cg.proj.util.VehicleConstants;

@Service
@Transactional
public class FeedbackServiceImpl implements FeedbackService{
	@Autowired
	private FeedbackDAO feedbackDAO;

	@Override
	public Feedback addFeedback(Feedback fdb) {
		// TODO Auto-generated method stub
		return feedbackDAO.save(fdb);
	}

	@Override
	public List<Feedback> getAllFeedback() {
		// TODO Auto-generated method stub
		return feedbackDAO.findAll();
		
	}

	@Override
	public Optional<Feedback> getFeedback(int feedbackId) throws FeedbackNotFoundException{
		if(feedbackDAO.findById(feedbackId).isEmpty())
		{
			throw new FeedbackNotFoundException(VehicleConstants.FEEDBACK_NOT_AVAILABLE);
		}
		return feedbackDAO.findById(feedbackId);
	}

}
