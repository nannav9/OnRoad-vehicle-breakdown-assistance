package com.cg.proj.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class UserDTO {
	@Min(value = 3, message = "User ID must be minimum 3")
	private int userId;
	@Size(min = 3, message = "User name must be minimum 3")
	private String userName;
	@Size(min = 3, message = "password must be minimum 3")
	private String password;
	@Min(value = 9, message = "User MobileNumber must be minimum 9")
	private long userMobileNumber;
	@Size(min = 4, message = "User ID must be minimum 3")
	private String userRole;
//	@Min(value = 3, message = "Vehicle ID must be minimum 3")
//	private int vehicleId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(long userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
//
//	public int getVehicleId() {
//		return vehicleId;
//	}
//
//	public void setVehicleId(int vehicleId) {
//		this.vehicleId = vehicleId;
//	}
}
