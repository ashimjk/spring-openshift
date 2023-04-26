package com.ashimjk.spring.openshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Spring-OpenShift";
	}

	@GetMapping("/welcome")
	public String welcomeToSpring() {
		return "Welcome to Spring Using REST API";
	}

}
