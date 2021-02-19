package com.accenture.WebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class WebAppApplication {

	@RequestMapping("/")
	String home()
	{
		return "<html><body><h1><i>Hello World Spring Boot!</i></h1></body><html>";
	}
	@RequestMapping("/new")
	String newForm()
	{
		return "<h2>Create new Thing</h2> ";
	}
	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
	}
}
