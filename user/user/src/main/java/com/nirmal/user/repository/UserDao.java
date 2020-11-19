package com.nirmal.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nirmal.user.model.UserEntity;

@Repository
public interface UserDao extends JpaRepository<UserEntity, Integer> {

	//@Query("select u from UserEntity u where u.userName like %?1")
	//UserEntity findByName(String name);
	//UserEntity findByEmail(String email);
}
