package org.lsi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Absence {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_abs;
	
  @ManyToOne
  @JoinColumn(name = "id_seance")
	private Seance seance ;
  @ManyToOne
  @JoinColumn(name = "id_eleve")
	private Eleve eleve;
	@Column(length = 3)
	private String abs ="prs";
	public Absence() {}
	public Absence( Seance seance, Eleve eleve, String abs) {
		super();
		
		this.seance = seance;
		this.eleve = eleve;
		this.abs = abs;
	}
	public int getId_abs() {
		return id_abs;
	}
	public void setId_abs(int id_abs) {
		this.id_abs = id_abs;
	}
	public Seance getSeance() {
		return seance;
	}
	public void setSeance(Seance seance) {
		this.seance = seance;
	}
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	public String isAbs() {
		return abs;
	}
	public void setAbs(String abs) {
		this.abs = abs;
	}
	
	
	
	
}
