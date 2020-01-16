package com.example.elasticBeansstalkwar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class ElasticBeanController {

	@GetMapping("/hello")
	public String helloAWS() {
		return "Hello AWS";
	}
}
