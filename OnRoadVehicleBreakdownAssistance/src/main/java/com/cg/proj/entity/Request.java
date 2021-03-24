package com.cg.proj.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Req")
public class Request {
	@Id
	@GeneratedValue
	private int requestId;
	private User user;
	private Mechanic mech;
	private String userLocation;
	private String requestStatus;

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Mechanic getMech() {
		return mech;
	}

	public void setMech(Mechanic mech) {
		this.mech = mech;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Request(int requestId, User user, Mechanic mech, String userLocation, String requestStatus) {
		super();
		this.requestId = requestId;
		this.user = user;
		this.mech = mech;
		this.userLocation = userLocation;
		this.requestStatus = requestStatus;
	}

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Request [requestId=" + requestId + ", userLocation=" + userLocation + ", requestStatus=" + requestStatus
				+ "]";
	}

}
