package com.nirmal.user.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nirmal.user.model.UserEntity;
import com.nirmal.user.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	@Transactional
	public UserEntity addUser(UserEntity user) {
		return userDao.save(user);
	}

	@Override
	@Transactional
	public List<UserEntity> getAllUsers() {
		return userDao.findAll();
	}

	@Override
	@Transactional
	public boolean isPresent(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = userDao.findByName(username);

		if (userEntity == null) {
			throw new UsernameNotFoundException(username);
		}

		return (UserDetails) new User(userEntity.getUserName(), userEntity.getPassword(), true, true, true, true,
				new ArrayList<>());
	}

	@Override
	public UserEntity getUserByName(String username) {
		UserEntity userEntity = userDao.findByName(username);
		//if (userEntity == null) {
			//throw new UsernameNotFoundException("User not found");
		//}
		return userEntity;
	}*/

}
