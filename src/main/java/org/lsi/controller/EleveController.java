package org.lsi.controller;

import java.util.List;

import org.lsi.entities.Eleve;
import org.lsi.metier.EleveRepository;
import org.lsi.service.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EleveController {
	@Autowired
	private EleveService eleveService;
//	private EleveRepository eleverepo;
	
	//AjouterEleve 
//	@GetMapping("/eleves")
//	public String getAlleleve() {
//		return "ListEleve.html";
//	}
	@GetMapping("/eleves")
	public String eleve(Model model) {
		model.addAttribute("eleve", new Eleve());
		List<Eleve> listeleve = eleveService.getEleve();
		model.addAttribute("ListEeleve", listeleve);
		return "eleve.html";
	}
	@PostMapping("/addeleve")
	public String addEleve(Eleve e) {
		eleveService.CreateEleve(e);
		return "redirect:eleves";
	}
	
	
	@GetMapping("/delete_eleve")
	public String deleteEmployee(@RequestParam int id) {
		   eleveService.deleteEleve(id);
		    return "redirect:/eleves";
	}

	
	
	
	
	
	
}
