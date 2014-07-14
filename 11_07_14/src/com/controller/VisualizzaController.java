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

public class VisualizzaController {
	
	 @RequestMapping("/visualizza")
	    public ModelAndView Contacts() {
	    	Contact c = new Contact();
	    	//c.AggiungiContatto();
	    	ModelAndView modelAndView = new ModelAndView("visualizza");
	    	modelAndView.addObject("contatti", c.getContatti());
	    	return modelAndView;
	    }
	 
	 @RequestMapping("/contacts")
	    public ModelAndView showContacts() {
	 
	        return new ModelAndView("contact", "command", new Contact());
	    }

}
