package com.example.springbootbasicsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootBasicSecurityApplication {

	@GetMapping("/getMessage/{name}")
	public String getMessage(@PathVariable String name){
		return "Hello" +name;

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicSecurityApplication.class, args);
	}

}
