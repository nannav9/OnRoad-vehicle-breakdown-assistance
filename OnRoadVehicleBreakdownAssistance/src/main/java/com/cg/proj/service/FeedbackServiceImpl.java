package com.cg.proj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.proj.dto.FeedbackDTO;
import com.cg.proj.entity.Feedback;
import com.cg.proj.entity.Mechanic;
import com.cg.proj.entity.User;
import com.cg.proj.exceptions.FeedbackNotFoundException;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.UserNotFoundException;
import com.cg.proj.repository.FeedbackDAO;
import com.cg.proj.repository.MechanicDAO;
import com.cg.proj.repository.UserDAO;
import com.cg.proj.util.VehicleConstants;

@Service
@Transactional
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	private FeedbackDAO feedbackDAO;
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private MechanicDAO mechanicDAO;

	@Override
	public Feedback addFeedback(FeedbackDTO feedbackdto) throws UserNotFoundException, MechanicNotFoundException {

		Optional<User> optuser = userDAO.findById(feedbackdto.getUserId());
		if (optuser.isEmpty()) {
			throw new UserNotFoundException(VehicleConstants.USER_NOT_AVAILABLE);
		}
		Optional<Mechanic> optmechanic = mechanicDAO.findById(feedbackdto.getMechanicId());
		if (optmechanic.isEmpty()) {
			throw new MechanicNotFoundException(VehicleConstants.MECHANIC_EMPTY);
		}
		Feedback feedback = new Feedback();
		feedback.setFeedback(feedbackdto.getFeedback());
		feedback.setRating(feedbackdto.getRating());
		feedback.setUser(optuser.get());
		feedback.setMechanic(optmechanic.get());
		return feedbackDAO.save(feedback);
	}

	@Override
	public Feedback getFeedback(int feedbackId) throws FeedbackNotFoundException {
		Optional<Feedback> optfeedback = feedbackDAO.findById(feedbackId);
		if (optfeedback.isEmpty()) {
			throw new FeedbackNotFoundException(VehicleConstants.FEEDBACK_NOT_AVAILABLE);
		}
		return optfeedback.get();
	}

	@Override
	public List<Feedback> getAllFeedback(int mechanicId) throws MechanicNotFoundException, FeedbackNotFoundException {

		Optional<Mechanic> optmechanic = mechanicDAO.findById(mechanicId);
		if (optmechanic.isEmpty()) {
			throw new MechanicNotFoundException(VehicleConstants.MECHANIC_EMPTY);
		}
		List<Feedback> feedbackList = feedbackDAO.getFeedbacks(mechanicId);
		if (feedbackList.isEmpty()) {
			throw new FeedbackNotFoundException(VehicleConstants.FEEDBACK_NOT_AVAILABLE);
		}
		return feedbackList;

	}

}