package net.Beaches.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.Beaches.project.entity.Lifeguard;
import net.Beaches.project.service.LifeguardService;

@Controller
public class AdminLifeguardController {
    

    private LifeguardService LifeguardService;

    public AdminLifeguardController(LifeguardService LifeguardService) {
        super();
        this.LifeguardService = LifeguardService;
    }

    @GetMapping("/AdminLifeguards")
    public String listLifeguards(Model model) {
        model.addAttribute("Lifeguard", LifeguardService.getAllLifeguards());
        return "adminlifeguard.html";
    }
    @GetMapping("/AdminLifeguards/new")
    public String createLifeguardForm(Model model) {
        
        // create Lifeguard object to hold Lifeguard form data
        Lifeguard Lifeguard = new Lifeguard();
        model.addAttribute("Lifeguard", Lifeguard);
        return "create_Lifeguard.html";
        
    }
    // when the user posts a new Lifeguard it will redirect the user back to the adminLifeguardes page so they can see the updated page
    @PostMapping("/AdminLifeguards")
    public String saveLifeguard(@ModelAttribute("Lifeguard") Lifeguard Lifeguard) {
        LifeguardService.saveLifeguard(Lifeguard);
        return "redirect:/AdminLifeguards";
    }
//get the Lifeguard by id and pass the values into edit Lifeguard html page
    @GetMapping("/AdminLifeguards/edit/{id}")
    public String editLifeguardForm(@PathVariable Long id, Model model) {
        model.addAttribute("Lifeguard", LifeguardService.getLifeguardById(id));
        return "edit_Lifeguard";
    }

    //get the Lifeguard by id and then pass the values to the model and set new values in db
    @PostMapping("/AdminLifeguards/{id}")
    public String updateLifeguard(@PathVariable Long id,
            @ModelAttribute("Lifeguard") Lifeguard Lifeguard,
            Model model) {
        
        // get Lifeguard from database by id
        Lifeguard existingLifeguard = LifeguardService.getLifeguardById(id);
        existingLifeguard.setId(id);
        existingLifeguard.setLifeguardfirstname(Lifeguard.getLifeguardfirstname());
        existingLifeguard.setLifeguardlastname(Lifeguard.getLifeguardlastname());
        existingLifeguard.setLifeguardqualificationlevel(Lifeguard.getLifeguardqualificationlevel());

        
        // save updated Lifeguard object and redirect back to adminLifeguardes html page
        LifeguardService.updateLifeguard(existingLifeguard);
        return "redirect:/AdminLifeguards";		
    }

    // handler method to handle delete Lifeguard request

    @GetMapping("/AdminLifeguards/{id}")
    public String deleteLifeguard(@PathVariable Long id) {
        LifeguardService.deleteLifeguardById(id);
        return "redirect:/AdminLifeguards";
    }
    }

