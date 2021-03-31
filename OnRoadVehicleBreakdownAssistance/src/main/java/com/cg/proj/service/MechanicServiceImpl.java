package com.cg.proj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.proj.DTO.MechanicDTO;
import com.cg.proj.entity.Mechanic;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.repository.MechanicDAO;
import com.cg.proj.util.VehicleConstants;

@Service
@Transactional
public class MechanicServiceImpl implements MechanicService {

	@Autowired
	private MechanicDAO mechanicDAO;

	@Override
	public Mechanic addMechanic(MechanicDTO mechanicdto) {
		Mechanic mechanic = new Mechanic();
		mechanic.setMechanicName(mechanicdto.getMechanicname());
		mechanic.setMechanicId(mechanicdto.getMechanicId());
		mechanic.setMechanicPassword(mechanicdto.getPassword());
		mechanic.setMechanicMobileNumber(mechanicdto.getMechanicMobileNumber());
		mechanic.setMechanicLocation(mechanicdto.getMechanicLocation());
		return mechanicDAO.save(mechanic);

	}

	@Override
	public Mechanic getMechanic(int mechanicId) throws MechanicNotFoundException {
		Optional<Mechanic> optmechanic = mechanicDAO.findById(mechanicId);
		if (optmechanic.isEmpty()) {
			throw new MechanicNotFoundException(VehicleConstants.MECHANICID_NOT_AVAILABLE);
		}
		return optmechanic.get();
	}

	@Override
	public List<Mechanic> getallMechanic() {
		return mechanicDAO.findAll();
	}
}