package com.example.demo.models;

public class Client {
	
	private String nom;
	private String prenom;
	private int age;
	private int numero;
	private Compte comptes[];
	
	public Client() {
		
	}
	
	public Client(String nom, String prenom, int age, int numero, Compte[] comptes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
		this.comptes = comptes;
	}
	
	

}
