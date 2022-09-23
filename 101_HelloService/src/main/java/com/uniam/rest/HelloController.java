package com.uniam.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

	@GetMapping(value = "/hello/{name}")
	public String sayHello( @PathVariable  String  name)
	{
		return "Welcome : " + name;
	}
}
