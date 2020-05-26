package com.ssdgroupc.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssdgroupc.app.entity.User;
import com.ssdgroupc.app.service.UserService;

import javassist.NotFoundException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

	private static final Logger LOGGER = LogManager.getLogger();

	@Autowired
	private UserService userService;

	@GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> getAllUsers() throws NotFoundException {

		List<User> items = userService.getAllUsers();

		if (items.isEmpty()) {
			LOGGER.info("User records are empty");
			throw new NotFoundException("No User records were found");
		}

		return new ResponseEntity<List<User>>(items, HttpStatus.OK);

	}

	@GetMapping(value = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable(value = "id") long id) throws NotFoundException {

		Optional<User> item = userService.getUser(id);

		if (!item.isPresent()) {
			LOGGER.info("User record not found");
			throw new NotFoundException("No User record were found");
		}

		return new ResponseEntity<User>(item.get(), HttpStatus.OK);
	}

	@PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> addUser(@Valid @RequestBody User user) {

		return new ResponseEntity<User>(userService.addTour(user), HttpStatus.CREATED);
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<Object> deleteTour(@PathVariable(value = "id") long id) {

		userService.deleteUser(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);

	}

//	@GetMapping("/users")
//	public List<User> getAllUsers() {
//		return userService.getAllUsers();
//	}
//
//	@GetMapping("/users/{id}")
//	public Optional<User> getUser(@PathVariable(value = "id") long id) {
//		return userService.getUser(id);
//	}
//
//	@PostMapping("/users")
//	public void addUser(@Valid @RequestBody User user) {
//		userService.addTour(user);
//	}
//
//	@DeleteMapping("/users/{id}")
//	public void deleteTour(@PathVariable(value = "id") long id) {
//		userService.deleteUser(id);
//		
//	}

}
