package fr.m2i.springfirst.model;

import lombok.Data;

@Data
public class User {
	
	private String nom;
	private String prenom;
	
	public User() {
		
	}
	
	
	public User(String nom, String prenom) {
		this.nom 	= nom;
		this.prenom = prenom;
	}
	
	
	@Override
	public String toString() {
		return this.nom + " " + this.prenom;
	}
	
	

}
