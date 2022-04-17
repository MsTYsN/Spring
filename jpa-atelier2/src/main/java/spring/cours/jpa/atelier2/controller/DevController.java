package spring.cours.jpa.atelier2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.cours.jpa.atelier2.model.Developpeur;
import spring.cours.jpa.atelier2.service.DevService;
import spring.cours.jpa.atelier2.service.DevServiceImpl;

@RestController
@RequestMapping("/devs")
public class DevController {
	@Autowired
	DevServiceImpl devService;
	
	@PostMapping
	public void ajouter(@RequestBody Developpeur dev) {
		devService.ajouter(dev);
	}
	
	@PostMapping("/{idDev}/{idTache}")
	public void affecter(@PathVariable int idDev, @PathVariable int idTache) {
		devService.affecterTache(idDev, idTache);
	}
	
	@GetMapping
	public List<Developpeur> get() {
		return devService.getDevs();
	}
	
	@GetMapping("/{id}")
	public List<Developpeur> get(@PathVariable int id) {
		return devService.getDev(id);
	}
	
	@GetMapping("/projet/{idProjet}")
	public List<Developpeur> getDevs(@PathVariable int idProjet) {
		return devService.getDev(idProjet);
	}
}
