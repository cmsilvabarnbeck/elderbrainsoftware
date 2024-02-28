package com.elderbrainsoftware.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elderbrainsoftware.models.User;

@RestController
public class UserController {
	
	@GetMapping("/users/{userId}")
	public User getUserById(@PathVariable("userId") Integer id) {
		User user1 = new User(1,"Chris","Barnbeck","test@gmail.com","password");
		user1.setId(id);
		return user1;
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		User newUser = new User();
		newUser.setEmail(user.getEmail());
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setPassword(user.getPassword());
		newUser.setId(user.getId());
		
		
		return newUser;
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		User user1 = new User(1,"Chris","Barnbeck","test@gmail.com","password");
		if (user.getFirstName() != null) {
			user1.setFirstName(user.getFirstName());
		}
		if (user.getLastName() != null) {
			user1.setLastName(user.getLastName());
		}
		if (user.getEmail() != null) {
			user1.setEmail(user.getEmail());
		}
		return user1;
	}
	
	public String deleteUser() {
		return("User Deleted Successfully!");
	}

}
