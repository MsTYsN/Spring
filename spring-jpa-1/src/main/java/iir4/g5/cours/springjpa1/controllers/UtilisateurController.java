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

import iir4.g5.cours.springjpa1.model.Utilisateur;
import iir4.g5.cours.springjpa1.repository.UtilisateurRepository;

@RestController
@RequestMapping("/users")
public class UtilisateurController {
	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	@GetMapping
	public List<Utilisateur> get() {
		return utilisateurRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Utilisateur get(@PathVariable int id) {
		return utilisateurRepository.findById(id).get();
	}
	
	@PostMapping
	public void ajouter(@RequestBody Utilisateur u) {
		utilisateurRepository.save(u);
	}
	
	@DeleteMapping("/{id}")
	public void suppr(@PathVariable int id) {
		utilisateurRepository.deleteById(id);
	}
	
	@PutMapping
	public void modif(@RequestBody Utilisateur nUser) {
		Utilisateur u = utilisateurRepository.findById(nUser.getId()).get();
		if(u != null) {
			u.setNom(nUser.getNom());
			u.setEmail(nUser.getEmail());
		}
	}
}
