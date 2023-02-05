package net.Beaches.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import net.Beaches.project.service.BeachService;
import net.Beaches.project.service.LifeguardService;
import net.Beaches.project.entity.Beach;
// https://www.youtube.com/watch?v=Ku3gsv7_bCc (50:15-1:51:30)
@Controller
public class BeachController {
	@Autowired
	private BeachService BeachService;
	@Autowired
	private LifeguardService LifeguardService;
	
	// public BeachController(BeachService BeachService) {
	// 	super();
	// 	this.BeachService = BeachService;
	// }

	//mapping for get request for when no parameter is entered, instead of erroring returns user to homepage
	@GetMapping("/")
	public String index() {
		return "index.html";
	}

	// handler method to handle list all Beaches and return mode and view
	@GetMapping("/Beaches")
	public String listBeaches(Model model) {
		model.addAttribute("Beaches", BeachService.getAllBeaches());
		model.addAttribute("Lifeguards", LifeguardService.getAllLifeguards());
		return "beaches.html";
	}
	// handler method to handle list Beach by id and return mode and view
	
	@GetMapping("/Beaches/view/{id}")
	public String listBeach(@PathVariable Long id, Model model) {
 	Beach beach = BeachService.getBeachById(id);
  	model.addAttribute("Beach", beach);
  	model.addAttribute("Lifeguards", LifeguardService.getLifeguardsByBeachId(beach.getId()));
  	return "viewbeach.html";
}

	

}
