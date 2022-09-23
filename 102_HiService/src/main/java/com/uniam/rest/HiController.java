package com.uniam.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@GetMapping("/hi/{name}")
	public String sayHi(@PathVariable    String name)
	{	
		return "Welcome :" + name;
	}
}
