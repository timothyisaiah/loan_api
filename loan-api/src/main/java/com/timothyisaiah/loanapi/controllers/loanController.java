package com.timothyisaiah.loanapi.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class loanController {
    
	@RequestMapping("/home")
	public String home() {
		return "This is the home page";
	}
	@RequestMapping("/")
	public String root() {
		return "This is the Index page";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "this is the user profile";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "Admin Page";
	}
	
	@RequestMapping("/loan")
	public String calcualateloan() {
		return "Your interest is %)";
	}
}
