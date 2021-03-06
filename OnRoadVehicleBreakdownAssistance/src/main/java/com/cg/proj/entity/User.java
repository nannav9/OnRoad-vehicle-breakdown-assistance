package com.cg.proj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_user")
public class User {
	@Id
	@Column(name = "user_id")
	private int userId;
	private String userName;
	private String password;
	private long userMobileNumber;
	private String userRole;

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

	public User(int userId, String userName, String password, int userMobileNumber,
			String userRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userMobileNumber = userMobileNumber;
		this.userRole = userRole;
	}

	public User() {
		super();

	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", userMobileNumber="
				+ userMobileNumber + ",userRole=" + userRole + "]";
	}

}