package com.codewithasif.security.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithasif.security.app.models.User;
import com.codewithasif.security.app.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	//all users
	@GetMapping("/")
	public List<User> getAllUsers(){
		return this.userService.getAllUsers();
	}
	
	//get single User
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}
	
	//add user
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
