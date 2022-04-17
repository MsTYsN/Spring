package iir4.g5.cours.springjpa1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utilisateur {
	@Id
	private int id;
	private String nom;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
}
