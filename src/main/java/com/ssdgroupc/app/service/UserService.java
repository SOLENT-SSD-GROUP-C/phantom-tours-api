package com.ssdgroupc.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssdgroupc.app.entity.User;
import com.ssdgroupc.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

//	Add User
	public User addUser(User user) {
		return userRepository.save(user);
	}

//	Get All Users
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

//	Get one user by id
	public Optional<User> getUser(int id) {
		return userRepository.findById(id);
	}

//	Update a user
	public User updateUser(int id, User user) {
		return userRepository.save(user);
	}

//	Delete a user by id
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

}
