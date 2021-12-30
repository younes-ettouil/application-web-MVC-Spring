package org.lsi.service;

import java.util.List;

import org.lsi.entities.Eleve;
import org.lsi.metier.EleveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EleveService   {
	@Autowired
	private EleveRepository eleverepo;
	//ajouter eleve
	public Eleve CreateEleve(Eleve e) {
		return eleverepo.save(e);
	}
	
	//affichage des eleve 
	public List<Eleve> getEleve(){
		return eleverepo.findAll();
	}
	
	public void deleteEleve(int id){
	eleverepo.deleteById(id);
	}
	
}
