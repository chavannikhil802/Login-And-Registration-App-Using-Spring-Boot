package com.skydivine.user.login.registration.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skydivine.user.login.registration.service.UserService;
import com.skydivine.user.login.registration.web.dto.UserRegistrationDto;

// CONTROLLER CLASS WHIHC IS CALLED WHEN THE USER TRIES TO REGISTER HIMSELF

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		this.userService = userService;
	}
	
	// METHOD USED TO STORE THE USER DATA PRESENT IN THE REGISTRATION FORM
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	// METHOD TO REDIRECT TO THE REGISTRATION PAGE
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	// METHOD USED TO REGISTER THE USER
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
}
