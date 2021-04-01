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

/**
 * @author Bijit Ghosh
 *
 */
@Service
@Transactional
public class MechanicServiceImpl implements MechanicService {

	@Autowired
	private MechanicDAO mechanicDAO;

	@Override // method to add mechanic
	public Mechanic addMechanic(MechanicDTO mechanicdto) {
		Mechanic mechanic = new Mechanic();
		mechanic.setMechanicName(mechanicdto.getMechanicName());
		mechanic.setMechanicId(mechanicdto.getMechanicId());
		mechanic.setMechanicPassword(mechanicdto.getMechanicPassword());
		mechanic.setMechanicMobileNumber(mechanicdto.getMechanicMobileNumber());
		mechanic.setMechanicLocation(mechanicdto.getMechanicLocation());
		return mechanicDAO.save(mechanic);

	}

	@Override // method to get mechanic
	public Mechanic getMechanic(int mechanicId) throws MechanicNotFoundException {
		Optional<Mechanic> optmechanic = mechanicDAO.findById(mechanicId);
		if (optmechanic.isEmpty()) {
			throw new MechanicNotFoundException(VehicleConstants.MECHANICID_NOT_AVAILABLE);
		}
		return optmechanic.get();
	}

	@Override // method to list all mechanics
	public List<Mechanic> getallMechanic() throws MechanicNotFoundException {
		List<Mechanic> optmechanic = mechanicDAO.findAll();
		if (optmechanic.isEmpty()) {
			throw new MechanicNotFoundException(VehicleConstants.MECHANIC_LISTEMPTY);
		}
		return mechanicDAO.findAll();
	}
}