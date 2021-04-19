package com.cg.proj.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class FeedbackDTO {
	private int rating;
	@Size(min = 3, message = "Feedback must have minimum 3 characters")
	private String feedback;
	@Min(value = 3, message = "User ID must be minimum 1")
	private int userId;
	@Min(value = 3, message = "Mechanic ID mut be minimum 1")
	private int mechanicId;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}

}