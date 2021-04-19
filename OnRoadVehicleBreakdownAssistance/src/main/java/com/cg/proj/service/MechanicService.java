package com.cg.proj.service;

import java.util.List;

import com.cg.proj.dto.MechanicDTO;
import com.cg.proj.entity.Mechanic;

import com.cg.proj.exceptions.MechanicNotFoundException;

/**
 * @author Bijit Ghosh
 *
 */
public interface MechanicService {

	Mechanic getMechanic(int mechanicId) throws MechanicNotFoundException; // functionality to get mechanic

	Mechanic addMechanic(MechanicDTO mechanicdto); // functionality to add mechanic

	List<Mechanic> getallMechanic() throws MechanicNotFoundException; // functionality to get all mechanic

}
