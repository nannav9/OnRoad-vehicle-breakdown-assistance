package com.cg.proj.entity;

import javax.persistence.*;

@Entity
@Table(name = "mech")
public class Mechanic {
    @Id
	private int mechanicId;
	private int mechanicMobileNumber;
	private String mechanicName;
	private String mechanicPassword;
	private String mechanicLocation;

	public Mechanic(int mechanicId, int mechanicMobileNumber, String mechanicName, String mechanicPassword,
			String mechanicLocation) {
		super();
		this.mechanicId = mechanicId;
		this.mechanicMobileNumber = mechanicMobileNumber;
		this.mechanicName = mechanicName;
		this.mechanicPassword = mechanicPassword;
		this.mechanicLocation = mechanicLocation;
	}

	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}

	public int getMechanicMobileNumber() {
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

	@Override
	public String toString() {
		return "Mechanic [mechanicId=" + mechanicId + ", mechanicMobileNumber=" + mechanicMobileNumber
				+ ", mechanicName=" + mechanicName + ", mechanicPassword=" + mechanicPassword + ", mechanicLocation="
				+ mechanicLocation + "]";
	}

}