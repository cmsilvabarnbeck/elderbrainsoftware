package com.elderbrainsoftware.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String homeControllerHandler() {
		return "Hello World!";
	
	}
	@GetMapping("/training")
	public String homeControllerHandler2() {
		return "Training Landing";
	}
	//@PutMapping
	//@PostMapping
	//@DeleteMapping

}
