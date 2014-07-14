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

public class ModificaController {

	 @RequestMapping(value = "/modifyContact", method = RequestMethod.POST)
	    public String modifyContact(@ModelAttribute("modifica")Contact contact) {

	    	contact.ModificaContatto();

	    	return "redirect:index.jsp";
	    }    
	 
	 @RequestMapping("/modifica")
	    public ModelAndView showModif() {
	 
	        return new ModelAndView("modifica", "command", new Contact());
	    }
}
