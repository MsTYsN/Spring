package iir4.g5.cours.spring.exemple2.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import iir4.g5.cours.spring.exemple2.model.Projet;

@Repository
public class ProjetRepositoryImpl implements ProjetRepository{

	static private List<Projet> projets = new ArrayList<>();
	
	@Override
	public void ajouter(Projet projet) {
		projets.add(projet);
		
	}

	@Override
	public void modifier(Projet projet) {
		for(Projet p : projets) {
			if(p.getId() == projet.getId()) {
				p.setDescription(projet.getDescription());
				break;
			}
		}
	}

	@Override
	public void supprimer(int idProjet) {
		for(Projet p : projets) {
			if(p.getId() == idProjet) {
				projets.remove(p);
				break;
			}
		}
	}

	@Override
	public List<Projet> findAll() {
		return projets;
	}

	@Override
	public Projet findById(int idProjet) {
		for(Projet p : projets) {
			if(p.getId() == idProjet) {
				return p;
			}
		}
		return null;
	}

}
