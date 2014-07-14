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
public class AggiungiController {

    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact")
                            Contact contact) {
 
        contact.AggiungiContatto();
 
        return "redirect:index.jsp";
    }
    
    @RequestMapping("/contacts")
    public ModelAndView showContacts() {
 
        return new ModelAndView("contact", "command", new Contact());
    }

   
}