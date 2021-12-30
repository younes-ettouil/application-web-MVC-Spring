package org.lsi.controller;

import java.util.List;

import org.lsi.entities.Absence;
import org.lsi.entities.Eleve;
import org.lsi.entities.Seance;
import org.lsi.service.AbsenceService;
import org.lsi.service.EleveService;
import org.lsi.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AbsController {
	@Autowired
	private AbsenceService absServive;
	@Autowired
	private SeanceService seanceservice;
	@Autowired
	private EleveService eleveservice;
	
	@GetMapping("/absence")
	public String ListAbsence(Model model) {
		model.addAttribute("abs", new Absence());
		List<Absence> Listabs = absServive.absenceList();
		model.addAttribute("Listabs", Listabs);
		List<Seance> ls = seanceservice.getsaences();
		model.addAttribute("ls", ls);
		List<Eleve> le = eleveservice.getEleve();
		model.addAttribute("le", le);
		return "absence.html";
	}
	
	@PostMapping("/absence")
	public String addAbsence(Absence abs, String abse  ) {
		
			
			try {
				if (abse.equals("abs")) { abs.setAbs("abs"); absServive.save(abs);}
			} catch (Exception e) {
				absServive.save(abs);
			}
		
		
		return "redirect:/absence";
	}
	
	@GetMapping("/delete_abs")
	public String deleteEmployee(@RequestParam int id) {
		   absServive.deleteAbs(id);
		    return "redirect:/absence";
	}
	
	
}
