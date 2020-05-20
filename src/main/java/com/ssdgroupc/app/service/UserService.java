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

	public User addTour(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	public Optional<User> getUser(long id) {
		return userRepository.findById(id);
	}

	public User updateUser(long id, User user) {
		return userRepository.save(user);
	}

	public void deleteUser(long id) {
		userRepository.deleteById(id);
	}

}
