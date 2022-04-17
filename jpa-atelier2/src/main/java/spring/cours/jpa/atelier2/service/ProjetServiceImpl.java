package spring.cours.jpa.atelier2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.cours.jpa.atelier2.model.Projet;
import spring.cours.jpa.atelier2.model.ProjetDev;
import spring.cours.jpa.atelier2.model.Tache;
import spring.cours.jpa.atelier2.repository.ProjetRepository;
import spring.cours.jpa.atelier2.repository.TacheRepository;

@Service
public class ProjetServiceImpl implements ProjetService{
	@Autowired
	ProjetRepository projetRepository;
	@Autowired
	TacheRepository tacheRepository;
	
	@Override
	public void ajouter(Projet projet) {
		projetRepository.save(projet);
		
	}
	@Override
	public List<Projet> lesProjets() {
		return projetRepository.findAll();
	}
	@Override
	public void supprimer(int idProjet) {
		projetRepository.deleteById(idProjet);
		
	}
	@Override
	public void modifier(Projet projet) {
		Projet p = getProjet(projet.getIdProjet());
		if(p != null) {
			p.setDescription(projet.getDescription());
			projetRepository.save(p);
		}
		
	}
	@Override
	public Projet getProjet(int idProjet) {
		return projetRepository.getById(idProjet);
	}
	@Override
	public void ajouterTache(int idProjet, Tache tache) {
		ProjetDev p = getProjetDev(idProjet);
		if(p != null) {
			tache.setProjet(p);
			tacheRepository.save(tache);
		}
		
	}
	@Override
	public List<Tache> getTaches(int idProjet) {
		return projetRepository.getTaches(idProjet);
	}
	@Override
	public List<ProjetDev> lesProjetsDev() {
		return projetRepository.getProjetDev();
	}
	@Override
	public ProjetDev getProjetDev(int idProjet) {
		return projetRepository.getProjetDev(idProjet);
	}
}
