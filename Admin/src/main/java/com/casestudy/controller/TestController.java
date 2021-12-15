package com.casestudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Hello")
public class TestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, from ADMIN";
		
	}

}
