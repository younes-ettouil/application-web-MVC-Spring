package org.lsi.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Seance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_seance;
	private String matier ;
	private String date ;
	@OneToMany
	@JoinColumn(name = "id_seance")
	  List<Absence> abs;
	
	public Seance() {}
	public Seance( String matier, String date, List<Absence> abs) {
		super();
	
		this.matier = matier;
		this.date = date;
		this.abs = abs;
	}
	public int getId_seance() {
		return id_seance;
	}
	public void setId_seance(int id_seance) {
		this.id_seance = id_seance;
	}
	public String getMatier() {
		return matier;
	}
	public void setMatier(String matier) {
		this.matier = matier;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<Absence> getAbs() {
		return abs;
	}
	public void setAbs(List<Absence> abs) {
		this.abs = abs;
	}
	
	
}
