package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Compte;

@RestController
@RequestMapping("comptes") //localhost:8080/comptes
public class CompteController {

	private List<Compte> comptes = initCompte();
	
	
	/**
	 * Methode qui creer et retourne une liste instanciée de comptes
	 * @return
	 */
	public List<Compte> initCompte() {
		List<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(1,450.78));
		comptes.add(new Compte(2,740.25));
		comptes.add(new Compte(3,1250.32));
		return comptes;
		
	}
}
