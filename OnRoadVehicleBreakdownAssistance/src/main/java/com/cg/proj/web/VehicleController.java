package com.cg.proj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.proj.DTO.AddVehicleRequest;
import com.cg.proj.DTO.DeleteVehicleRequest;
import com.cg.proj.DTO.UpdateVehicleReg;
import com.cg.proj.DTO.VehicleDetails;
import com.cg.proj.entity.Vehicle;
import com.cg.proj.service.VehicleService;
import com.cg.proj.util.VehicleUtility;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
@Autowired
	private VehicleService service;
@Autowired 
    private VehicleUtility util;

@PostMapping("/add")
public VehicleDetails addVehicle(@RequestBody AddVehicleRequest requestBody) { //created a object of dto class which is addvehicle request

	Vehicle vehicle = new Vehicle();
	vehicle.setVehicleBrand(requestBody.getVehicleBrand());
	vehicle.setVehicleModel(requestBody.getVehicleModel());
	vehicle.setVehicleRegNo(requestBody.getVehicleRegNo());
	Vehicle saved = service.addVehicle(vehicle);
	return util.toDetails(saved);
	
}
@DeleteMapping("/delete")
public String deleteVehicle(@RequestBody DeleteVehicleRequest requestBody) {
	Integer Id = requestBody.getVehicleId();
	Vehicle vehicle = service.getVehicle(Id);
	service.deleteVehicle(vehicle);
	return "Vehicle for Id " + Id + " is deleted.";
	
	
}
@GetMapping("/fetch/byid/{Id}")
public VehicleDetails fetch(@PathVariable("Id") Integer Id) {
	Vehicle vehicle = service.getVehicle(Id);
	VehicleDetails details = util.toDetails(vehicle);
	return details ;
	}
@PutMapping("/changeregno")
public VehicleDetails changeRegNo(@RequestBody UpdateVehicleReg requestBody) {
	Integer Id = requestBody.getVehicleId();
	Vehicle vehicle = service.getVehicle(Id);
	vehicle.setVehicleRegNo(requestBody.getVehicleRegNo());
	service.updateVehicle(vehicle);
	VehicleDetails details = util.toDetails(vehicle);
	return details;
}
}
