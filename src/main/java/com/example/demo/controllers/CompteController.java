package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Compte;

@RestController
@RequestMapping("comptes") //localhost:8080/comptes
public class CompteController {

	private List<Compte> comptes = initCompte();
	
	//READ
	@GetMapping() //localhost:8080/comptes --> GET
	public List<Compte> findAll() {
		return this.comptes;
	}
	
	@GetMapping("/{id}") //localhost:8080/comptes/id --> GET
	public Compte findById(@PathVariable int id) {
		return this.comptes.get(id);
	}
	
	@PostMapping() //localhost:8080/comptes --> POST
	public Compte create(@RequestBody Compte compte) {
		this.comptes.add(compte);
		return compte;
	}
	
	//UPDATE
	@PutMapping("/{id}") //localhost:8080/id --> PUT
	public Compte udpate(@PathVariable int id,@RequestBody Compte compte) {
		Compte newCompte = findById(id);
		newCompte.setNumero(compte.getNumero());
		newCompte.setSolde(compte.getSolde());
		return newCompte;
	}
	
	//DELETE 
	@DeleteMapping("/{id}") 
	public Compte delete(@PathVariable int id) {
		return this.comptes.remove(id);
	}
	
	/**
	 * Cette méthode permet de rajouter un montant au compte
	 * @param id
	 * @param montant
	 * @return
	 */
	@PostMapping("/{id}/ajouter/{montant}") 
	public Compte ajouterMontant(@PathVariable int id, @PathVariable int montant) {
		Compte newCompte = findById(id);
		
		newCompte.ajouter(montant);
		
		return newCompte;
	}
	
	/**
	 * Cette methode permet de retirer un montant du compte
	 * @param id
	 * @param montant
	 * @return
	 * @throws Exception 
	 */
	@PostMapping("/{id}/retirer/{montant}") 
	public Compte retirerMontant(@PathVariable int id, @PathVariable int montant) throws Exception {
		Compte newCompte = findById(id);
		if (newCompte.getSolde() > montant) {
			newCompte.retirer(montant);
		}else
		{
			throw new Exception ("Votre solde n'est pas suffisant pour retirer ce montant");
		}
		
		return newCompte;
	}
	
	/**
	 * Methode qui creer et retourne une liste instanciée de comptes
	 * @return
	 */
	public List<Compte> initCompte() {
		List<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(1,450.78));
		comptes.add(new Compte(2,740.25));
		comptes.add(new Compte(3,1250.32));
		return comptes ;
		
	}
}
