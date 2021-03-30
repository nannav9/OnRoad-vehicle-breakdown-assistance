package com.cg.proj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_feedback")
public class Feedback {
	@Id
	@Column(name = "feedback_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedbackId;
	private int rating;

	private String feedback;
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name = "mechanic_id", referencedColumnName = "mechanic_id")
	private Mechanic mechanic;

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Mechanic getMechanic() {
		return mechanic;
	}

	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}

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

	public Feedback(int feedbackId, int rating, String feedback, User user, Mechanic mechanic) {
		super();
		this.feedbackId = feedbackId;
		this.rating = rating;
		this.feedback = feedback;
		this.user = user;
		this.mechanic = mechanic;
	}

	@Override
	public String toString() {
		return "Feedback [ rating=" + rating + ", feedback=" + feedback + "]";
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
}