package com.cg.proj.DTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class RequestDTO {
	@Min(value = 3, message = "User ID must be minimum 3")
	private int userId;
	@Min(value = 3, message = "Mechanic ID mut be minimum 3")
	private int mechanicId;
	@Size(min = 3, message = "User location must have minimum 3 characters")
	private String userLocation;
	@Size(min = 3, message = "Request Description must have minimum 3 characters")
	private String requestDescription;
//setters and getters
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

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public String getRequestDescription() {
		return requestDescription;
	}

	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}

}
