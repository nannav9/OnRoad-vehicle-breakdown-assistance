package com.cg.proj.entity;

import javax.persistence.*;

@Entity
@Table(name = "vehicle_mechanic")
public class Mechanic {
	@Id
	@Column(name = "mechanic_id")
	private int mechanicId;
	private long mechanicMobileNumber;
	private String mechanicName;
	private String mechanicPassword;
	private String mechanicLocation;

	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}

	public long getMechanicMobileNumber() {
		return mechanicMobileNumber;
	}

	public void setMechanicMobileNumber(int mechanicMobileNumber) {
		this.mechanicMobileNumber = mechanicMobileNumber;
	}

	public String getMechanicName() {
		return mechanicName;
	}

	public void setMechanicName(String mechanicName) {
		this.mechanicName = mechanicName;
	}

	public String getMechanicPassword() {
		return mechanicPassword;
	}

	public void setMechanicPassword(String mechanicPassword) {
		this.mechanicPassword = mechanicPassword;
	}

	public String getMechanicLocation() {
		return mechanicLocation;
	}

	public void setMechanicLocation(String mechanicLocation) {
		this.mechanicLocation = mechanicLocation;
	}

	public Mechanic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mechanic(int mechanicId, int mechanicMobileNumber, String mechanicName, String mechanicPassword,
			String mechanicLocation) {
		super();
		this.mechanicId = mechanicId;
		this.mechanicMobileNumber = mechanicMobileNumber;
		this.mechanicName = mechanicName;
		this.mechanicPassword = mechanicPassword;
		this.mechanicLocation = mechanicLocation;
	}

	@Override
	public String toString() {
		return "Mechanic [mechanicId=" + mechanicId + ", mechanicMobileNumber=" + mechanicMobileNumber
				+ ", mechanicName=" + mechanicName + ", mechanicPassword=" + mechanicPassword + ", mechanicLocation="
				+ mechanicLocation + "]";
	}

}