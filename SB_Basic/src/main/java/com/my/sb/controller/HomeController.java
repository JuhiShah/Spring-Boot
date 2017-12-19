package com.my.sb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	// --------------------------- SIMPLE REQUEST --------------------------------------------------
	@RequestMapping("/home")
	public String hello(){
		return "Hello World !";
	}
	
}
