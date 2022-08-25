package com.example.vWaiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagingMqServiceApplication {

	@GetMapping("/message")
	public String message() {
		return "Congratulations!!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(MessagingMqServiceApplication.class, args);
	}

}
