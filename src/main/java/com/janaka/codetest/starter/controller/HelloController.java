package com.janaka.codetest.starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping
	public String sayHi() {
		
		return "Spring Boot Start!";
	}

}
