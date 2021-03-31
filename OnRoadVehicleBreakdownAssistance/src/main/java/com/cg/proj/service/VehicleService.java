package com.cg.proj.service;

import com.cg.proj.entity.Vehicle;

public interface VehicleService {

	Vehicle addVehicle(Vehicle vehicle);

	Vehicle getVehicle(Integer vehicleId);

	Vehicle updateVehicle(Vehicle vehicle);

	Vehicle deleteVehicle(Vehicle vehicle);

}
