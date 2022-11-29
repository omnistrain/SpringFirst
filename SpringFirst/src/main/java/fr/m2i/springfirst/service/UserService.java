package fr.m2i.springfirst.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.m2i.springfirst.model.User;


@Service
public class UserService {
	
	
	public User getUser() {
		
		return new User("Balasko", "Josiane");
	}

}
