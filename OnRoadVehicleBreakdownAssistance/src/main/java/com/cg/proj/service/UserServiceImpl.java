package com.cg.proj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.proj.dto.UserDTO;
import com.cg.proj.entity.User;
import com.cg.proj.entity.Vehicle;
import com.cg.proj.exceptions.UserNotFoundException;
import com.cg.proj.exceptions.VehicleNotFoundException;
import com.cg.proj.repository.UserDAO;
import com.cg.proj.repository.VehicleDAO;
import com.cg.proj.util.VehicleConstants;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	@Autowired
	private VehicleDAO vehicleDAO;

	@Override
	public User addUser(UserDTO userdto) {
		User user = new User();
		user.setUsername(userdto.getUsername());
		user.setUserId(userdto.getUserId());
		user.setPassword(userdto.getPassword());
		user.setUserMobileNumber(userdto.getUserMobileNumber());
		user.setUserRole(userdto.getUserRole());
//		Optional<Vehicle> optvehicle = vehicleDAO.findById(userdto.getVehicleId());
//		if (optvehicle.isEmpty()) {
//			throw new VehicleNotFoundException(VehicleConstants.VEHICLE_NOT_AVAILABLE);
//		}
		return userDAO.save(user);

	}

	@Override
	public User getUser(int userId) throws UserNotFoundException {
		Optional<User> optuser = userDAO.findById(userId);
		if (optuser.isEmpty()) {
			throw new UserNotFoundException(VehicleConstants.USER_NOT_AVAILABLE);
		}
		return optuser.get();
	}

	@Override
	public List<User> getallUser() {
		return userDAO.findAll();
	}
}