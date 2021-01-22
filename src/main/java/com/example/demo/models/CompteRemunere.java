package com.example.demo.models;

public class CompteRemunere extends Compte {

	private double taux;

	public CompteRemunere() {
		
	}
	
	public CompteRemunere(double taux) {
		super();
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteRemunere [taux=" + taux + "]";
	}
	
	/**
	 * Cette methode va calculer les interets du compte
	 * @return
	 */
	public double calculerInterets() {
		return super.getSolde() * this.taux;
	}
	
	/**
	 * Cette methode ajoute au solde la totalité des interets
	 */
	public void verserInterets() {
		super.ajouter(this.calculerInterets());
		
	}
	
}
