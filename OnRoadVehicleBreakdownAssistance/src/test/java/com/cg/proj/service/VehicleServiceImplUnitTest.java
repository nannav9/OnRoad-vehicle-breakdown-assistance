package com.cg.proj.service;

import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.proj.entity.Vehicle;
import com.cg.proj.exceptions.VehicleNotFoundException;
import com.cg.proj.repository.VehicleDAO;

@ExtendWith(MockitoExtension.class)
public class VehicleServiceImplUnitTest {
	@Mock
	VehicleDAO repository;

	@Spy
	@InjectMocks
	VehicleServiceImpl service;
	// when vehicle object is added successfully.
	@Test
	void test_addVehicle_1() {

		Vehicle vehicle = mock(Vehicle.class);
		Vehicle saved = mock(Vehicle.class);
		doNothing().when(service).validateVehicle(vehicle);
		when(repository.save(vehicle)).thenReturn(saved);
		Vehicle result = service.addVehicle(vehicle);
		Assertions.assertNotNull(result);
		Assertions.assertSame(saved, result);
		verify(repository).save(vehicle);
	}
	// when vehicle object is null.
	@Test
	void test_addVehicle_2() {

		Vehicle vehicle = mock(Vehicle.class);
		doThrow(VehicleNotFoundException.class).when(service).validateVehicle(vehicle);
		Executable executable = () -> service.addVehicle(vehicle);
		Assertions.assertThrows(VehicleNotFoundException.class, executable);
		verify(repository, never()).save(vehicle);
	}
	
	//when vehicle object to be updated exists in store and is updated successfully
	 
	@Test
	    void test_updateVehicle_1() {

		Vehicle vehicle = mock(Vehicle.class);
		doNothing().when(service).validateVehicle(vehicle);
		Mockito.when(repository.save(vehicle)).thenReturn(vehicle);
		Vehicle result = service.updateVehicle(vehicle);
		Assertions.assertNotNull(result);
		Assertions.assertSame(vehicle, result);
		verify(repository).save(vehicle);
}
	
	//when vehicle object to be deleted does not exist in store
	@Test
	void test_deleteVehicle_1() {

		Vehicle vehicle = mock(Vehicle.class);
		doThrow(VehicleNotFoundException.class).when(service).validateVehicle(vehicle);
		Executable executable = () -> service.deleteVehicle(vehicle);
		Assertions.assertThrows(VehicleNotFoundException.class, executable);
		verify(repository, never()).delete(vehicle);
	}
	
	@Test
	void test_getById_3() {

		Integer id = 1;
		Vehicle vehicle = mock(Vehicle.class);
		
		doNothing().when(service).validateVehicle(vehicle);;
		Vehicle fetched = mock(Vehicle.class);
		Optional<Vehicle> optional = Optional.of(fetched);
		Mockito.when(repository.findById(id)).thenReturn(optional);
		Vehicle result = service.getVehicle(id);
		Assertions.assertNotNull(result);
		Assertions.assertSame(fetched, result);
		verify(repository).findById(id);
	}
}
