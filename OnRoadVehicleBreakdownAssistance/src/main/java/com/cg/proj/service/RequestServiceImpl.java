package com.cg.proj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.proj.entity.Mechanic;
import com.cg.proj.entity.Request;
import com.cg.proj.entity.User;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.RequestNotFoundException;
import com.cg.proj.repository.MechanicDAO;
import com.cg.proj.repository.RequestDAO;
import com.cg.proj.util.VehicleConstants;

@Service
@Transactional
public class RequestServiceImpl implements RequestService {
	@Autowired
	private MechanicDAO mechanicDAO;
	
	private RequestDAO requestDAO;
	
//	@Override
//	public Request sendRequest(User user) {
//		return requestDAO.save(user);
//	}
//
//	@Override
//	public Optional<Request> viewRequest(int requestId) throws RequestNotFoundException {
//	}

//	@Override
//	public List<Request> viewAllRequest() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String requestStatusUpdate(int requestId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Mechanic> searchMechanic(String userLocation) throws MechanicNotFoundException {
		List<Mechanic> mechanics = mechanicDAO.getMechanics(userLocation);
		if (mechanics.isEmpty()) {
			throw new MechanicNotFoundException(VehicleConstants.MECHANIC_NOT_AVAILABLE);

		}
		return mechanics;
	}

}
