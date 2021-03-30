package com.cg.proj.service;

import java.util.List;
import java.util.Optional;

import com.cg.proj.DTO.RequestDTO;
import com.cg.proj.entity.Mechanic;
import com.cg.proj.entity.Request;
import com.cg.proj.entity.User;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.RequestNotFoundException;
import com.cg.proj.exceptions.UserNotFoundException;

public interface RequestService {

	Request sendRequest(RequestDTO requestdto) throws UserNotFoundException, MechanicNotFoundException;

	Request viewRequest(int requestId) throws RequestNotFoundException;

	List<Request> viewAllRequest();

	String requestStatusUpdate(int requestId, String requestStatus) throws RequestNotFoundException;

	List<Mechanic> searchMechanic(String userLocation) throws MechanicNotFoundException;
}
