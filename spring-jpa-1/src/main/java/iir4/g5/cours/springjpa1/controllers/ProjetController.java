package iir4.g5.cours.springjpa1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iir4.g5.cours.springjpa1.model.Projet;
import iir4.g5.cours.springjpa1.repository.ProjetRepository;

@RestController
@RequestMapping("/projects")
public class ProjetController {
	@Autowired
	ProjetRepository projetRepository;
	
	@GetMapping
	public List<Projet> get() {
		return projetRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Projet get(@PathVariable long id) {
		return projetRepository.findById(id).get();
	}
	
	@PostMapping
	public void ajouter(@RequestBody Projet p) {
		projetRepository.save(p);
	}
	
	@DeleteMapping("/{id}")
	public void suppr(@PathVariable long id) {
		projetRepository.deleteById(id);
	}
	
	@PutMapping
	public void modif(@RequestBody Projet nProjet) {
		Projet p = projetRepository.findById(nProjet.getIdProjet()).get();
		if(p != null) {
			p.setNom(nProjet.getNom());
			p.setDescription(nProjet.getDescription());
		}
	}
}
