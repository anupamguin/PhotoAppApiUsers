package com.photo.api.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/status")
	public String status() { // to access eureka will assign a random port on this port we can access
		return "Working";
	}
}
