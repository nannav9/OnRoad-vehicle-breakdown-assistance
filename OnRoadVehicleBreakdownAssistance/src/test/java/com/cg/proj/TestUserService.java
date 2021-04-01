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
import com.cg.proj.entity.User;
import com.cg.proj.exceptions.FeedbackNotFoundException;
import com.cg.proj.exceptions.UserNotFoundException;
import com.cg.proj.repository.UserDAO;
import com.cg.proj.service.UserServiceImpl;

@SpringBootTest
public class TestUserService {
	public static Optional<User> optuser;
	@MockBean
	private UserDAO userdao;
	@Autowired
	private UserServiceImpl userservice;
	@BeforeEach public void beforeeach()
	{ 
		optuser=Optional.of(new User());
		Mockito.when(userdao.findById(120)).thenReturn(optuser);
		Mockito.when(userdao.findById(150)).thenThrow(UserNotFoundException.class);
	}
	@Test
	public void testuserById_01() throws UserNotFoundException
	{
		assertNotNull(userservice.getUser(120));
		
	}
	@Test
	public void testUserById_02() throws UserNotFoundException
	{
		assertThrows(UserNotFoundException.class,()->userservice.getUser(150));
		
	}


}