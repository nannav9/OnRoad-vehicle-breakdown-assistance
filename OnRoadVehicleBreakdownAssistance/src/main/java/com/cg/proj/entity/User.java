package com.cg.proj.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
    @Id
	int userId;
	String username;
	String password;
	int userMobileNumber;
	String userVehicle;
	String userRole;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(int userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getUserVehicle() {
		return userVehicle;
	}

	public void setUserVehicle(String userVehicle) {
		this.userVehicle = userVehicle;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public User(int userId, String username, String password, int userMobileNumber, String userVehicle,
			String userRole) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.userMobileNumber = userMobileNumber;
		this.userVehicle = userVehicle;
		this.userRole = userRole;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", userMobileNumber="
				+ userMobileNumber + ", userVehicle=" + userVehicle + ",userRole=" + userRole + "]";
	}

}