package spring.cours.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.cours.mvc.model.Projet;
import spring.cours.mvc.services.ProjetService;

@Controller
@RequestMapping("/projets")
public class ProjetController {
	
	@Autowired
	private ProjetService projetService;
	
	@GetMapping
	public String liste(Model m) {
		m.addAttribute("projets", projetService.lesProjets());
		return "projets/liste";
	}
	
	@GetMapping("/add")
	public String ajout(Model m) {
		Projet p = new Projet();
		m.addAttribute("projet", p);
		return "projets/ajout";
	}
	
	@PostMapping("/add")
	public String enregistrer(@ModelAttribute("projet") Projet projet) {
		Projet p = projetService.getProjet(projet.getIdProjet());
		if(p != null)
			projetService.modifier(projet);
		else
			projetService.ajouter(projet);
		return "redirect:/projets";
	}
	
	@GetMapping("/edit/{id}")
	public String modifier(@PathVariable long id, Model m) {
		Projet p = projetService.getProjet(id);
		if(p != null) {
			m.addAttribute("projet", p);
			return "projets/ajout";
		}
		return "redirect:/projets";
	}
	
	@GetMapping("/delete/{id}")
	public String suppr(@PathVariable int id) {
		projetService.supprimer(id);
		return "redirect:/projets";
	}
}
