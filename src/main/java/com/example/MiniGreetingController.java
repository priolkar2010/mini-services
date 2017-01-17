package com.example;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

public interface MiniGreetingController {
	
	@CrossOrigin
	@RequestMapping("/greetingFromMini")
	String miniGreeting();
	
}
