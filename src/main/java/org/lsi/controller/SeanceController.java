package org.lsi.controller;

import java.util.List;

import org.lsi.entities.Absence;
import org.lsi.entities.Eleve;
import org.lsi.entities.Seance;
import org.lsi.service.AbsenceService;
import org.lsi.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SeanceController {

	@Autowired
	private SeanceService seanceService;
	@Autowired
	private AbsenceService absservice;
	
	@GetMapping("/seance")
	public String saence(Model model) {
		model.addAttribute("seance",new Seance());
		List<Seance> listseance = seanceService.getsaences(); 
		model.addAttribute("listSeance", listseance);
		return "seance.html";
	}
	
	@PostMapping("/addseance")
	public String addseance(Seance s) {
		seanceService.addseance(s);
		return "redirect:/seance";
	}
	@GetMapping("seance_eleves")
	public String getListbySeance(@RequestParam int id ,Model model) {
		List<Absence> listeleve_seance= absservice.getElevesBySeance(id);
		for(int i=0 ;i<listeleve_seance.size();i++) {
			System.out.println(listeleve_seance.get(i).isAbs());
		}
		model.addAttribute("list_e_s", listeleve_seance);
		return "eleve_seance.html";
	}
	
	
}
