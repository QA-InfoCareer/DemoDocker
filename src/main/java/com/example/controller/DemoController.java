package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class DemoController {
	
	@GetMapping("/demo")
	public String demodocker() {
		
		return "HELLO WORLD";		
	}

}
