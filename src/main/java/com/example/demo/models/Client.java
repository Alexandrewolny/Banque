package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String nom;
	private String prenom;
	private int age;
	private int numero;
	private List<Compte> comptes = new ArrayList<>();
	
	public Client() {
		
	}
	
	public Client(String nom, String prenom, int age, int numero, List<Compte> comptes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
		this.comptes = comptes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numero=" + numero + ", comptes="
				+ comptes + "]";
	}
	
	/**
	 * Cette methode permet d'ajouter un compte
	 * @param unCompte
	 */
	public void ajouterCompte(Compte unCompte) {
		this.comptes.add(unCompte);
	}
	
	/**
	 * Cette methode permet de recupere un compte
	 * @param numeroCompte
	 * @return
	 */
	//public Compte getCompte(int numeroCompte) {
	
		//}
		
	}
