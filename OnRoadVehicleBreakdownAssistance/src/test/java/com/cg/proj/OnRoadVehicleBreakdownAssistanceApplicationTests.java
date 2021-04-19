package com.cg.proj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.proj.entity.Request;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.RequestNotFoundException;
import com.cg.proj.repository.RequestDAO;
import com.cg.proj.service.RequestServiceImpl;

/**
 * @author SHOBHANA & Navaneeth
 *
 */
@SpringBootTest
 class OnRoadVehicleBreakdownAssistanceApplicationTests {
	public static Optional<Request> optrequest;
	@MockBean
	private RequestDAO requestdao;
	@Autowired
	private RequestServiceImpl requestservice;

	@BeforeEach
	public void beforeeach() {
		optrequest = Optional.of(new Request());
		Mockito.when(requestdao.findById(3)).thenReturn(optrequest);
		Mockito.when(requestdao.findById(100)).thenThrow(RequestNotFoundException.class);

	}

	//checking not null
	@Test
	 void testRequestById_01() throws RequestNotFoundException {
		assertNotNull(requestservice.viewRequest(3));

	}

	//checking if exception gets thrown for request id
	@Test
	 void testRequestById_02() throws RequestNotFoundException {
		assertThrows(RequestNotFoundException.class, () -> requestservice.viewRequest(100));

	}

	//checking status update
	@Test
	 void testRequestStatusById_03() throws RequestNotFoundException {

		assertEquals("Request Status updated", requestservice.requestStatusUpdate(3, "request"));
	}

	//checking if exception is thrown for mechanic
	@Test
	 void testSearchMechanicByLocation() throws MechanicNotFoundException {
		assertThrows(MechanicNotFoundException.class, () -> requestservice.searchMechanic("saligramam"));

	}

}
