package com.nirmal.user.service;

import java.util.List;

//import org.springframework.security.core.userdetails.UserDetailsService;

import com.nirmal.user.model.UserEntity;

//public interface UserService extends UserDetailsService {
public interface UserService {
	public UserEntity addUser(UserEntity user);        //Adds new user to the database
	public List<UserEntity> getAllUsers();             //Fetch the list of all users present in the database
	public boolean isPresent(Object obj);              //Checks if the user is present with given username and password
	//public UserEntity getUserByName(String username);  //Fetch user with given name
}
