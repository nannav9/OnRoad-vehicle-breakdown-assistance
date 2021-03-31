package com.cg.proj.DTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class MechanicDTO {
	@Min(value = 3, message = "Mechanic ID must be minimum 3")
	private int mechanicId;
	@Size(min = 3, message = "Mechanic name must be minimum 3")
	private String mechanicname;
	@Size(min = 3, message = "Password must be minimum 3")
	private String password;
	@Min(value = 9, message = "Mechanic Mobile Number must be minimum 9")
	private long mechanicMobileNumber;
	@Size(min = 3, message = "Mechanic Location must be minimum 3")
	private String mechanicLocation;

	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}

	public String getMechanicname() {
		return mechanicname;
	}

	public void setMechanicname(String mechanicname) {
		this.mechanicname = mechanicname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMechanicMobileNumber() {
		return mechanicMobileNumber;
	}

	public void setMechanicMobileNumber(long mechanicMobileNumber) {
		this.mechanicMobileNumber = mechanicMobileNumber;
	}

	public String getMechanicLocation() {
		return mechanicLocation;
	}

	public void setMechanicLocation(String mechanicLocation) {
		this.mechanicLocation = mechanicLocation;
	}

}
