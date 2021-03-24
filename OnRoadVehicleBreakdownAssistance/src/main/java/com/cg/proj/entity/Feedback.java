package com.cg.proj.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
public class Feedback {
	String userName;
	String mechanicName;
	int rating;
	String feedback;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMechanicName() {
		return mechanicName;
	}
	public void setMechanicName(String mechanicName) {
		this.mechanicName = mechanicName;
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
	public Feedback(String userName, String mechanicName, int rating, String feedback) {
		super();
		this.userName = userName;
		this.mechanicName = mechanicName;
		this.rating = rating;
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Feedback [userName=" + userName + ", mechanicName=" + mechanicName + ", rating=" + rating
				+ ", feedback=" + feedback + "]";
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
}