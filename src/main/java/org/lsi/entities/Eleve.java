package org.lsi.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Eleve {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_eleve ;
	private String nom;
	private String prenom;
	private String cne ;
	@OneToMany
	@JoinColumn(name = "id_eleve")
	  List<Absence> abs;
	
	public Eleve() {}

	public Eleve( String nom, String prenom, String cne, List<Absence> abs) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.cne = cne;
		this.abs = abs;
	}

	public int getId_eleve() {
		return id_eleve;
	}

	public void setId_eleve(int id_eleve) {
		this.id_eleve = id_eleve;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public List<Absence> getAbs() {
		return abs;
	}

	public void setAbs(List<Absence> abs) {
		this.abs = abs;
	}
	
	
}
