package com.cg.proj.DTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * @author Bijit Ghosh
 *
 */
public class MechanicDTO {
	@Min(value = 3, message = "Mechanic ID must be minimum 3")
	private int mechanicId;
	@Size(min = 3, message = "Mechanic name must be minimum 3")
	private String mechanicName;
	@Size(min = 3, message = "Password must be minimum 3")
	private String mechanicPassword;
	@Size(min = 10, message = "Mechanic Mobile Number must be minimum 10")
	private String mechanicMobileNumber;
	@Size(min = 3, message = "Mechanic Location must be minimum 3")
	private String mechanicLocation;

	// Generating getters and setters
	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
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

	public String getMechanicMobileNumber() {
		return mechanicMobileNumber;
	}

	public void setMechanicMobileNumber(String mechanicMobileNumber) {
		this.mechanicMobileNumber = mechanicMobileNumber;
	}

	public String getMechanicLocation() {
		return mechanicLocation;
	}

	public void setMechanicLocation(String mechanicLocation) {
		this.mechanicLocation = mechanicLocation;
	}

}
