	package com.skydivine.user.login.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skydivine.user.login.registration.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	// METHOD TO FETCH THE USER DETAILS USING EMAIL
	User findByEmail(String email);
}
