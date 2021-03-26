package com.cg.proj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.proj.DTO.RequestDTO;
import com.cg.proj.entity.Mechanic;
import com.cg.proj.entity.Request;
import com.cg.proj.entity.User;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.RequestNotFoundException;
import com.cg.proj.exceptions.UserNotFoundException;
import com.cg.proj.repository.MechanicDAO;
import com.cg.proj.repository.RequestDAO;
import com.cg.proj.repository.UserDAO;
import com.cg.proj.util.VehicleConstants;

@Service
@Transactional
public class RequestServiceImpl implements RequestService {
	@Autowired
	private MechanicDAO mechanicDAO;
	@Autowired
	private RequestDAO requestDAO;
	@Autowired
	private UserDAO userDAO;

	@Override
	public Request sendRequest(RequestDTO requestdto) throws MechanicNotFoundException, UserNotFoundException {
		
	Optional <User> optuser=userDAO.findById(requestdto.getUserId());
	if(optuser.isEmpty())
	{
		throw new UserNotFoundException(VehicleConstants.USER_NOT_AVAILABLE);
	}
	Optional<Mechanic> optmechanic=mechanicDAO.findById(requestdto.getMechanicId());
	if(optmechanic.isEmpty())
	{
		throw new MechanicNotFoundException(VehicleConstants.MECHANIC_EMPTY);
	}
	Request request=new Request();
	request.setMech(optmechanic.get());
	request.setUser(optuser.get());
	request.setRequestDescription(requestdto.getRequestDescription());
	request.setUserLocation(requestdto.getUserLocation());
	request.setRequestStatus(VehicleConstants.REQ_NEW);
		return requestDAO.save(request);
	}

	@Override
	public Request viewRequest(int requestId) throws RequestNotFoundException {
		Optional<Request> optreq=requestDAO.findById(requestId);
		if(optreq.isEmpty())
		{
			throw new RequestNotFoundException(VehicleConstants.REQUEST_NOT_AVAILABLE);
		}
		return optreq.get();
	}

	@Override
	public List<Request> viewAllRequest() {
		return requestDAO.findAll();
	}

	@Override
	public String requestStatusUpdate(int requestId,String requestStatus)throws RequestNotFoundException {
	Optional<Request> optreq=requestDAO.findById(requestId);
		if(optreq.isEmpty())
		{
			throw new RequestNotFoundException(VehicleConstants.REQUEST_NOT_AVAILABLE);
		}
		Request req=optreq.get();
		req.setRequestStatus(requestStatus);
		return VehicleConstants.REQ_STATUS_UPDATED;
	}

	@Override
	public List<Mechanic> searchMechanic(String userLocation) throws MechanicNotFoundException {
		List<Mechanic> mechanics = mechanicDAO.getMechanics(userLocation);
		if (mechanics.isEmpty()) {
			throw new MechanicNotFoundException(VehicleConstants.MECHANIC_NOT_AVAILABLE);

		}
		return mechanics;
	}

}
