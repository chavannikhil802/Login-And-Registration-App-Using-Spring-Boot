package com.skydivine.user.login.registration.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.skydivine.user.login.registration.model.User;
import com.skydivine.user.login.registration.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);
	
}
