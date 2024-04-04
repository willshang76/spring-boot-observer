package com.will.observer.controller;

import com.will.observer.event.DemoCustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	ApplicationContext context;

	@GetMapping("/hello")
	public String hello(){
		// Publish a custom event.
		context.publishEvent(new DemoCustomEvent(new Object()));

		return "hello";
	}
}
