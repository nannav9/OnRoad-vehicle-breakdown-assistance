package com.cg.proj.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.proj.entity.Vehicle;
import com.cg.proj.exceptions.*;
import com.cg.proj.repository.VehicleDAO;
@Service
public class VehicleServiceImpl implements VehicleService{

	@Autowired
	private VehicleDAO repository;
	
	@Override
	@Transactional
	public Vehicle addVehicle(Vehicle vehicle) {
		validateVehicle(vehicle);
		return repository.save(vehicle);
	}
	//@Override
	@Transactional
	public Vehicle updateVehicle(Vehicle vehicle) {
		Integer id = vehicle.getVehicleId();
		boolean exists = repository.existsById(id);
		if(!exists) {
			throw new VehicleNotFoundException("Vehicle does not exist");
		}
		return repository.save(vehicle);
	}
	//@Override
	@Transactional
	public Vehicle deleteVehicle(Vehicle vehicle) {
		Integer id = vehicle.getVehicleId();
		boolean exists = repository.existsById(id);
		if(!exists) {
			throw new VehicleNotFoundException("Vehicle does not exist");
		}
		 repository.delete(vehicle);
	return vehicle;
	}
	//@Override
	@Transactional
	public Vehicle getVehicle(Integer vehicleId) {
		
		Optional<Vehicle> optional = repository.findById(vehicleId);
		if(!optional.isPresent()) {
			throw new VehicleNotFoundException("Vehicle does not exist");
		}
		return optional.get();
	
	}
	public void validateVehicle(Vehicle vehicle) {
		if(vehicle == null) {   
			throw new NullVehicleException("Invalid Vehicle Passed");
		}
		
		if(vehicle.getVehicleModel().equals("")) {
			throw new InvalidVehicleModelException("Model cannot be empty ");
		}
		
		if(vehicle.getVehicleRegNo().equals("")) {
			throw new InvalidVehicleRegistrationNoException("Registration no. cannot be empty");
		}
		
		if(vehicle.getVehicleBrand().equals("")) {
			throw new InvalidVehicleBrandException("Brand cannot be empty");
		}
	}
}
