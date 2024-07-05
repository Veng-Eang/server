package com.vengeang.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloworld() {
		return "helloworld/hello";
	}
}
