package spring.cours.jpa.atelier2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.cours.jpa.atelier2.model.Projet;
import spring.cours.jpa.atelier2.model.ProjetDev;
import spring.cours.jpa.atelier2.model.ProjetRes;
import spring.cours.jpa.atelier2.model.Tache;
import spring.cours.jpa.atelier2.service.ProjetService;
import spring.cours.jpa.atelier2.service.ProjetServiceImpl;

@RestController
@RequestMapping("/projets")
public class ProjetController {
	@Autowired
	ProjetServiceImpl projetService;
	
	@PostMapping
	public void ajouter(@RequestBody Projet p) {
		projetService.ajouter(p);
	}
	
	@PostMapping("/dev")
	public void ajouter(@RequestBody ProjetDev p) {
		projetService.ajouter(p);
	}
	
	@PostMapping("/res")
	public void ajouter(@RequestBody ProjetRes p) {
		projetService.ajouter(p);
	}
	
	@GetMapping
	public List<Projet> obtenirProjets() {
		return projetService.lesProjets();
	}
	
	@PostMapping("/{idProjet}/tache")
	public void ajouter(@PathVariable int idProjet, @RequestBody Tache t) {
		projetService.ajouterTache(idProjet, t);
	}
	
	@GetMapping("/{idProjet}/tache")
	public List<Tache> getTaches(@PathVariable int idProjet) {
		return projetService.getTaches(idProjet);
	}
}
