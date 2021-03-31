//package com.cg.proj.web;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cg.proj.DTO.AddVehicleRequest;
//import com.cg.proj.DTO.VehicleDetails;
//import com.cg.proj.entity.Vehicle;
//import com.cg.proj.service.VehicleService;
//import com.cg.proj.util.VehicleUtility;
//
//@RestController
//@RequestMapping("/vehicles")
//public class VehicleController {
//@Autowired
//	private VehicleService service;
//@Autowired 
//    private VehicleUtility util;
//
//@PostMapping("/addvehicle")
//public VehicleDetails addVehicle(@RequestBody AddVehicleRequest requestBody) {
//
//	Vehicle vehicle = new Vehicle();
//	vehicle.setVehicleBrand(requestBody.getVehicleBrand());
//	vehicle.setVehicleModel(requestBody.getVehicleModel());
//	vehicle.setVehicleRegNo(requestBody.getVehicleRegNo());
//	Vehicle saved = service.addVehicle(vehicle);
//	return util.toDetails(saved);
//	
//}
//}
