package spring.cours.jpa.atelier2.service;

import java.util.List;

import spring.cours.jpa.atelier2.model.Projet;
import spring.cours.jpa.atelier2.model.ProjetDev;
import spring.cours.jpa.atelier2.model.Tache;

public interface ProjetService {
	void ajouter(Projet projet);
	List<Projet> lesProjets();
	void supprimer(int idProjet);
	void modifier(Projet projet);
	Projet getProjet(int idProjet);
	void ajouterTache(int idProjet, Tache tache);
	List<Tache> getTaches(int idProjet);
	List<ProjetDev> lesProjetsDev();
	ProjetDev getProjetDev(int idProjet);
}
