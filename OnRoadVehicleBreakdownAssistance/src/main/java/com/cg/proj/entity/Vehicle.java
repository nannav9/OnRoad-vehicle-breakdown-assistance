package com.cg.proj.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Shivam Mishra
 *
 */
@Entity
@Table(name = "vehicle_deatils")
public class Vehicle {
	@Id
	private int vehicleId;
	private String vehicleBrand;
	private String vehicleModel;
	private String vehicleRegNo;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleRegNo() {
		return vehicleRegNo;
	}

	public void setVehicleRegNo(String vehicleRegNo) {
		this.vehicleRegNo = vehicleRegNo;
	}

	public Vehicle(int vehicleId, String vehicleBrand, String vehicleModel, String vehicleRegNo) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleBrand = vehicleBrand;
		this.vehicleModel = vehicleModel;
		this.vehicleRegNo = vehicleRegNo;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleBrand=" + vehicleBrand + ", vehicleModel=" + vehicleModel
				+ ", vehicleRegNo=" + vehicleRegNo + "]";
	}

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
}