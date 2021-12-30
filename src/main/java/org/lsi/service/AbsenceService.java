package org.lsi.service;

import java.util.List;

import org.lsi.entities.Absence;
import org.lsi.entities.Eleve;
import org.lsi.entities.Seance;
import org.lsi.metier.AbsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbsenceService {
	@Autowired
	private AbsRepository absrepo;
	//ajouter eleve
	public Absence Createabs(Absence a) {
		return absrepo.save(a);
	}
	

	public List<Absence> getElevesBySeance(int id) {
		return absrepo.getByseance(id);
	}
	
	//affichage des eleve 
	public List<Absence> getEleve(){
		return absrepo.findAll();
	}


	public List<Absence> absenceList() {
		
		return absrepo.getAbs();
	}


	public Absence save(Absence a) {
		
		return absrepo.save(a);
		
	}
	public void deleteAbs(int id) {
		absrepo.deleteById(id);
	}
	
}
