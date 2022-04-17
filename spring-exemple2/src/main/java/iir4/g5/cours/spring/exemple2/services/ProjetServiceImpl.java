package iir4.g5.cours.spring.exemple2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iir4.g5.cours.spring.exemple2.model.Projet;
import iir4.g5.cours.spring.exemple2.repository.ProjetRepository;

@Service
public class ProjetServiceImpl implements ProjetService{
	@Autowired
	ProjetRepository projetRepository;
	@Override
	public void ajouter(Projet projet) {
		projetRepository.ajouter(projet);
		
	}

	@Override
	public void modifier(Projet projet) {
		projetRepository.modifier(projet);
		
	}

	@Override
	public void supprimer(int idProjet) {
		projetRepository.supprimer(idProjet);
		
	}

	@Override
	public List<Projet> findAll() {
		return projetRepository.findAll();
	}

	@Override
	public Projet findById(int idProjet) {
		return projetRepository.findById(idProjet);
	}

}
