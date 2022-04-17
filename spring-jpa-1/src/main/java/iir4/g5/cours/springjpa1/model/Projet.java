package iir4.g5.cours.springjpa1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Projet {
	@Id
	private long idProjet;
	@Column(nullable = false, length = 50, unique = true)
	private String nom;
	@Column(length = 100)
	private String description;
	
	public long getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(long idProjet) {
		this.idProjet = idProjet;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
