package com.cg.proj.service;

import java.util.List;

import com.cg.proj.DTO.UserDTO;
import com.cg.proj.entity.User;

import com.cg.proj.exceptions.UserNotFoundException;

public interface UserService {

	User getUser(int userId) throws UserNotFoundException;

	User addUser(UserDTO userdto);

	List<User> getallUser();

}
