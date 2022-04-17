package spring.cours.jpa.atelier2.service;

import java.util.List;

import spring.cours.jpa.atelier2.model.Developpeur;

public interface DevService {
	void ajouter(Developpeur dev);
	List<Developpeur> getDevs();
	void supprimer(int idDev);
	void modifier(Developpeur dev);
	Developpeur getDeveloppeur(int idDev);
	Developpeur getDeveloppeur(String email);
	List<Developpeur> getDev(int idProjet);
	void affecterTache(int idDev, int idTache);
}
