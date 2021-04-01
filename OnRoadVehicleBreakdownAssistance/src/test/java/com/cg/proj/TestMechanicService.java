package com.cg.proj;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.proj.entity.Mechanic;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.repository.MechanicDAO;

import com.cg.proj.service.MechanicServiceImpl;

/**
 * @author Bijit Ghosh
 *
 */
@SpringBootTest
public class TestMechanicService {
	public static Optional<Mechanic> optmechanic;
	@MockBean //creating mockbean class
	private MechanicDAO mechanicdao;
	@Autowired
	private MechanicServiceImpl mechanicservice;

	@BeforeEach
	public void beforeeach() {
		optmechanic = Optional.of(new Mechanic());
		Mockito.when(mechanicdao.findById(1)).thenReturn(optmechanic);
		Mockito.when(mechanicdao.findById(100)).thenThrow(MechanicNotFoundException.class);
	}

	@Test //checking null value
	public void testMechanicById_01() throws MechanicNotFoundException {
		assertNotNull(mechanicservice.getMechanic(1));

	}

	@Test //checking if it is throwing exception for mechanic_id
	public void testMechanicById_02() throws MechanicNotFoundException {
		assertThrows(MechanicNotFoundException.class, () -> mechanicservice.getMechanic(100));

	}

}