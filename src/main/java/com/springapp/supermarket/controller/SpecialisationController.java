package com.springapp.supermarket.controller;

import com.springapp.supermarket.entity.Specialisation;
import com.springapp.supermarket.service.SpecialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

// in progress now
@RequestMapping("/supermarket")
@Controller
public class SpecialisationController {

    @Autowired
    private SpecialisationService specialisationService;

    // Inject of entities
    @Autowired
    private Specialisation specialisation;

    //Return all specialisation to page from db
    @RequestMapping("allspecialisations")
    public String viewAllSpecialisations(Model model) {
        List<Specialisation> listSpecialisation = specialisationService.getAllSpecialisation();
        model.addAttribute("listSpecialisations", listSpecialisation);
        return "specialisation/specialisations";
    }

    // Return form for editing specialisation
    @RequestMapping(value = "editSpecialisation/{idSpecialisation}", method = RequestMethod.GET)
    public ModelAndView editSpecialisation(@PathVariable("idSpecialisation") int idSpecialisation) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(specialisationService.getOneSpecialisation(idSpecialisation));
        modelAndView.setViewName("specialisation/editSpecialisation");
        return modelAndView;
    }

    // Return form for add new specialisation
    @RequestMapping("addNewSpecialisation")
    public String addSpecialisation() {
        return "specialisation/addSpecialisation";
    }

    // Send entity "Employee" for update
    @RequestMapping(value = "updateSpecialisation", method = RequestMethod.POST)
    public String updateSpecialisation(
            @RequestParam("idSpecialisation") int idSpecialisation,
            @RequestParam("nameSpecialisation") String nameSpecialisation,
            @RequestParam("descriptionSpecialisation") String descriptionSpecialisation) {
        specialisation.setIdSpecialisation(idSpecialisation);
        specialisation.setNameSpecialisation(nameSpecialisation);
        specialisation.setDescriptionSpecialisation(descriptionSpecialisation);
        specialisationService.updateSpecialisation(specialisation);
        return "redirect:/Supermarket/allspecialisations/";
    }

    // Send entity "Employee" for save
    @RequestMapping(value = "successAddingSpec", method = RequestMethod.POST)
    public String addSpecialisation(
            @RequestParam("nameSpecialisation") String nameSpecialisation,
            @RequestParam("descriptionSpecialisation") String descriptionSpecialisation) {
        specialisation.setNameSpecialisation(nameSpecialisation);
        specialisation.setDescriptionSpecialisation(descriptionSpecialisation);
        specialisationService.updateSpecialisation(specialisation);
        return "redirect:/Supermarket/allspecialisations/";
    }

    // Remove entities "Specialisation" id db with help browser
    @RequestMapping("removeSpecialisation/{idSpecialisation}")
    public String removeEmployees(@PathVariable("idSpecialisation") int idSpecialisation) {
        specialisationService.removeSpecialisation(specialisationService.getOneSpecialisation(idSpecialisation));
        return "redirect:/Supermarket/allspecialisations/";
    }
}