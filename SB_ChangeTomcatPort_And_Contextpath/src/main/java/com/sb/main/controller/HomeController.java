package com.sb.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value="/home")
	public String helloMethod(){
		return "Hello World!";
	}
}
