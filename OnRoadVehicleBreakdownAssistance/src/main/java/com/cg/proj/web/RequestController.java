package com.cg.proj.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.proj.DTO.RequestDTO;
import com.cg.proj.DTO.SuccessMessageDTO;
import com.cg.proj.entity.Mechanic;
import com.cg.proj.entity.Request;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.RequestNotFoundException;
import com.cg.proj.exceptions.UserNotFoundException;
import com.cg.proj.exceptions.ValidateException;
import com.cg.proj.service.RequestService;
import com.cg.proj.util.VehicleConstants;


@RestController
public class RequestController {
	@Autowired
	private RequestService requestService;

	@GetMapping("viewmechanicsbyloc/{userLocation}")
	public List<Mechanic> getMechanics(@PathVariable("userLocation") String userLocation)
			throws MechanicNotFoundException {
		return requestService.searchMechanic(userLocation);

	}

	@GetMapping("viewrequestbyid/{requestId}")
	public Request viewRequest(@PathVariable("requestId") int requestId) throws RequestNotFoundException {
		return requestService.viewRequest(requestId);
	}

	@GetMapping("viewallrequests")
	public List<Request> viewAllRequest() {
		return requestService.viewAllRequest();
	}
	
	@PostMapping("addrequest")
	public SuccessMessageDTO sendRequest(@Valid @RequestBody RequestDTO requesrdto, BindingResult br) throws ValidateException, UserNotFoundException, MechanicNotFoundException
	{
		if(br.hasErrors()) 
			throw new ValidateException(br.getFieldErrors());
		Request rs=requestService.sendRequest(requesrdto);
		return new SuccessMessageDTO(VehicleConstants.REQ_SENT+ rs.getRequestId());
	}

}
