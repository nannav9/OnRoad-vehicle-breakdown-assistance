package com.cg.proj.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.proj.entity.Mechanic;
import com.cg.proj.entity.Request;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.RequestNotFoundException;
import com.cg.proj.service.RequestService;

@RestController
public class RequestController {
	@Autowired
private RequestService requestService;
	
	@GetMapping("viewmechanicsbyloc/{userLocation}")
	public List<Mechanic> getMechanics(@PathVariable("userLocation") String userLocation) throws MechanicNotFoundException
	{
		return requestService.searchMechanic(userLocation);
		
	}
//	@GetMapping("viewrequestbyid/{requestId}")
//	public Optional<Request> viewRequest(@PathVariable("requestId") int requestId) throws RequestNotFoundException
//	{
//		return requestService.viewRequest(requestId);
//	}
}
