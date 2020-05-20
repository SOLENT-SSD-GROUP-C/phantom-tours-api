package com.ssdgroupc.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssdgroupc.app.entity.User;
import com.ssdgroupc.app.service.UserService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable(value = "id") int id) {
		return userService.getUser(id);
	}

	@PostMapping("/users")
	public void addUser(@Valid @RequestBody User user) {
		userService.addTour(user);
	}

	@DeleteMapping("/users/{id}")
	public void deleteTour(@PathVariable(value = "id") long id) {
		userService.deleteUser(id);
		
	}

}
