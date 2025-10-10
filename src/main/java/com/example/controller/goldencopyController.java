package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class goldencopyController {

	// Added the comments for the Check1 project.
	@GetMapping("/getName")
	public String getName(@RequestParam(name = "userName") String name)
	{
		System.out.println("Name is" + name);
		return name;
	}

	@GetMapping("/getName2")
	public String getName2(@RequestParam(name = "userName") String name)
	{
		System.out.println("Name is" + name);
		return name;
	}


}
