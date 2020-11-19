package com.nirmal.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmal.user.model.UserEntity;
import com.nirmal.user.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("addUser")
	public ResponseEntity<UserEntity> addUser(@RequestBody UserEntity user) {
		return new ResponseEntity<UserEntity>(userService.addUser(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<UserEntity>> getAllUsers() {
		return new ResponseEntity<List<UserEntity>>(userService.getAllUsers(), HttpStatus.OK);
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<String>("Hi from User", HttpStatus.OK);
	}
	
}
