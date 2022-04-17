package spring.cours.jpa.atelier2.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Developpeur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDeveloppeur;
	@Column(nullable = false)
	private String nom;
	@Column(unique = true)
	private String email;
	@ManyToMany(targetEntity=Tache.class)
    private List<Tache> taches;
	public int getIdDeveloppeur() {
		return idDeveloppeur;
	}
	public void setIdDeveloppeur(int idDeveloppeur) {
		this.idDeveloppeur = idDeveloppeur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Tache> getTaches() {
		return taches;
	}
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
}
