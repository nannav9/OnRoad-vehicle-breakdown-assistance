package com.cg.proj.service;

import java.util.List;

import com.cg.proj.DTO.MechanicDTO;
import com.cg.proj.entity.Mechanic;

import com.cg.proj.exceptions.MechanicNotFoundException;

public interface MechanicService {

	Mechanic getMechanic(int mechanicId) throws MechanicNotFoundException;

	Mechanic addMechanic(MechanicDTO mechanicdto);

	List<Mechanic> getallMechanic();

}
