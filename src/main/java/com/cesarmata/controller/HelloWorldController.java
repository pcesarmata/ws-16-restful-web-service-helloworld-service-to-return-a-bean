package com.cesarmata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarmata.bean.HelloWorldBean;

/**
 * @author Cesar Mata.
 */
@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World!!");
	}
}