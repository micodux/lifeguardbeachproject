package net.Beaches.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.Beaches.project.entity.Beach;

import net.Beaches.project.service.BeachService;
// https://www.youtube.com/watch?v=Ku3gsv7_bCc (50:15-1:51:30)
@Controller
public class AdminBeachController {

    private BeachService BeachService;
   

	public AdminBeachController(BeachService BeachService) {
		super();
		this.BeachService = BeachService;
	}

    // handler method to handle list Beaches and return mode and view for admin page

    @GetMapping("/AdminControls")
	public String listBeaches(Model model) {
		model.addAttribute("Beaches", BeachService.getAllBeaches());
		return "adminbeach.html";
	}

    
// handler method to handle of return mode and view for adding a new beach
    @GetMapping("/AdminBeaches/new")
    public String createBeachForm(Model model) {
        
        // create Beach object to hold Beach form data
        Beach beach = new Beach();
        model.addAttribute("Beach", beach);
        return "create_Beach.html";
        
    }
    // when the user posts a new beach it will redirect the user back to the adminbeaches page so they can see the updated page
    @PostMapping("/AdminBeaches")
    public String saveBeach(@ModelAttribute("Beach") Beach beach) {
        BeachService.saveBeach(beach);
        return "redirect:/AdminControls";
    }
//get the beach by id and pass the values into edit beach html page
    @GetMapping("/AdminBeaches/edit/{id}")
    public String editBeachForm(@PathVariable Long id, Model model) {
        model.addAttribute("Beach", BeachService.getBeachById(id));
        return "edit_Beach";
    }

    //get the beach by id and then pass the values to the model and set new values in db
    @PostMapping("/AdminBeaches/{id}")
    public String updateBeach(@PathVariable Long id,
            @ModelAttribute("Beach") Beach Beach,
            Model model) {
        
        // get Beach from database by id
        Beach existingBeach = BeachService.getBeachById(id);
        existingBeach.setId(id);
        existingBeach.setBeachname(Beach.getBeachname());
        existingBeach.setLocation(Beach.getLocation());
        existingBeach.setCounty(Beach.getCounty());
        existingBeach.setImage(Beach.getImage());
        existingBeach.setBeachinfoboard(Beach.isBeachinfoboard());
        existingBeach.setDogsallowed(Beach.isDogsallowed());
        existingBeach.setLifebouy(Beach.isLifebouy());
        existingBeach.setLifeguardhut(Beach.isLifeguardhut());
        existingBeach.setParking(Beach.isParking());
        existingBeach.setLitterbin(Beach.isLitterbin());
        existingBeach.setFirstaid(Beach.isFirstaid());
        existingBeach.setWatersafetysigns(Beach.isWatersafetysigns());
        existingBeach.setComments(Beach.getComments());

        
        // save updated Beach object and redirect back to adminbeaches html page
        BeachService.updateBeach(existingBeach);
        return "redirect:/AdminControls";		
    }

    // handler method to handle delete Beach request

    @GetMapping("/AdminBeaches/{id}")
    public String deleteBeach(@PathVariable Long id) {
        BeachService.deleteBeachById(id);
        return "redirect:/AdminControls";
    }
    }