package com.example.demo.models;

public class Compte {

	//Fields
	private int numero;
	private double solde;
	
	//Constructeurs
	public Compte() {
		
	}
	public Compte(int numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}
	
	//Getters&Setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}
	
	/**
	 * Cette méthode permet d'ajouter de l'argent au solde du compte
	 * @param unMontant qui sera ajouté
	 */
	public void ajouter(double unMontant) {
		this.solde += unMontant;
	}
	
	/**
	 * Cette méthode permet de retirer de l'argent au solde du compte
	 * @param unMontant qui sera ajouté
	 */
	public void retirer(double unMontant) {
		this.solde -= unMontant;
	}
	
	
	
	
	
	
}
