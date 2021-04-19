package com.example.demo;

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
import com.cg.proj.exceptions.RequestNotFoundException;
import com.cg.proj.repository.RequestDAO;
import com.cg.proj.service.RequestService;
import com.cg.proj.service.RequestServiceImpl;
@SpringBootTest
 class OnRoadVehicleBreakdownAssistanceApplicationTests {
	public static Optional<Request> optrequest;
	@MockBean
	private RequestDAO requestdao;
	@Autowired
	private RequestServiceImpl requestservice;
	@BeforeEach public void beforeeach()
	{ optrequest=Optional.of(new Request());
	Mockito.when(requestdao.findById(3)).thenReturn(optrequest);
	Mockito.when(requestdao.findById(100)).thenThrow(RequestNotFoundException.class);
	
	}
	@Test
	 void testRequestById_01() throws RequestNotFoundException
	{
		assertNotNull(requestservice.viewRequest(3));
		
	}
	@Test
	 void testRequestById_02() throws RequestNotFoundException
	{
		assertThrows(RequestNotFoundException.class,()->requestservice.viewRequest(100));
		
	}

}
