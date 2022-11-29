package fr.m2i.springfirst.service;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Exemple {

	
	@Bean
	public String getMessage() {
		
		return "Say Hello";
		
	}
	
	
	@Bean
	@Scope("prototype")
	public LocalTime now() {
		return LocalTime.now();
	}
	
	
}
