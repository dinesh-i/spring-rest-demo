package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@RequestMapping
	public String greeting(@RequestParam(value = "name", defaultValue = "world") String name){
		return "Hello " + name + " !!!";
	}
}
