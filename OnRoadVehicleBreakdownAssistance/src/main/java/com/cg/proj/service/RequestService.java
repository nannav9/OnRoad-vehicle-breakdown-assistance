package com.cg.proj.service;

import java.util.List;
import java.util.Optional;

import com.cg.proj.entity.Mechanic;
import com.cg.proj.entity.Request;
import com.cg.proj.entity.User;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.RequestNotFoundException;

public interface RequestService {

	//Request sendRequest(User user);

	Optional<Request> viewRequest(int requestId) throws RequestNotFoundException;

	List<Request> viewAllRequest();

//	String requestStatusUpdate(int requestId);
	
	List<Mechanic> searchMechanic(String userLocation) throws MechanicNotFoundException;
}
