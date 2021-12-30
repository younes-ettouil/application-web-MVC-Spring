package org.lsi.service;

import java.util.List;


import org.lsi.entities.Seance;

import org.lsi.metier.SeanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SeanceService {
	@Autowired
	private SeanceRepository seancerepo;

	
	//ajouter seance
	public Seance addseance(Seance s) {
		return seancerepo.save(s);
	}
	
	//affichage des seance
	public List<Seance> getsaences(){
		return seancerepo.findAll();
	}
}
