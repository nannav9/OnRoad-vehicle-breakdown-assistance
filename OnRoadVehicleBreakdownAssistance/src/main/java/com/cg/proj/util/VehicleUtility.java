package com.cg.proj.util;

import org.springframework.stereotype.Component;

import com.cg.proj.dto.VehicleDetails;
import com.cg.proj.entity.Vehicle;

@Component
public class VehicleUtility {

	public VehicleDetails toDetails(Vehicle vehicle) {
		VehicleDetails details = new VehicleDetails();
		details.setVehicleBrand(vehicle.getVehicleBrand());
		details.setVehicleModel(vehicle.getVehicleModel());
		details.setVehicleRegNo(vehicle.getVehicleRegNo());
		return details;
	}
}
