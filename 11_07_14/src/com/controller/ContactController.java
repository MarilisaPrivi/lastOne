package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.form.Contact;
 
@Controller
@SessionAttributes
public class ContactController {

    @RequestMapping(value = "/addContact", method = RequestMethod.GET)
    public String addContact(@ModelAttribute("aggiungi")
                            Contact contact) {
 
        contact.AggiungiContatto();
 
        return "redirect:index.jsp";
    }
    
    @RequestMapping("/aggiungi")
    public ModelAndView showContacts() {
 
        return new ModelAndView("aggiungi", "command", new Contact());
    }
    

   	 @RequestMapping(value = "/modifyContact", method = RequestMethod.GET)
   	    public String modifyContact(@ModelAttribute("modifica")Contact contact) {

   	    	contact.ModificaContatto();

   	    	return "redirect:index.jsp";
   	    }
   	 
   	@RequestMapping("/modifica")
    public ModelAndView showModif() {
 
        return new ModelAndView("modifica", "command", new Contact());
    }

	 @RequestMapping("/visualizza")
	    public ModelAndView Contacts() {
	    	Contact c = new Contact();
	    	ModelAndView modelAndView = new ModelAndView("visualizza");
	    	modelAndView.addObject("contatti", c.getContatti());
	    	return modelAndView;
	    }
	 
}
    
    