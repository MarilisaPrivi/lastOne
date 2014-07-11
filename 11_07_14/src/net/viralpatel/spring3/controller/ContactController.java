package net.viralpatel.spring3.controller;

import net.viralpatel.spring3.form.Contact;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
@SessionAttributes
public class ContactController {
 
    /* L'annotazione @RequestMapping dice a Spring che questo controller deve elaborare tutte le richieste che iniziano 
       con il pattern /addContact nel percorso del path (quindi gestisce percorsi del tipo /addContact.html).
       L'attributo method=”RequestMethod.POST” significa che IL METODO addContact() VIENE CHIAMATO SOLO QUANDO L'UTENTE
       GENERA UNA RICHIESTA DI TIPO POST AD UNA PAGINA /addContact.html
 
       L'annotazione @ModeLAttribute del parametro di input eseguirà il binding tra i dati della richiesta POST e l'oggetto 
       di tipo Contact usato come parametro di input del metodo
     */
    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact")
                            Contact contact, BindingResult result) {
 
        System.out.println("First Name:" + contact.getFirstname() +
                    "Last Name:" + contact.getLastname());
 
        return "redirect:contacts.html";
    }
 
    /* L'annotazione @RequestMapping dice a Spring che questo controller deve elaborare tutte le richieste che iniziano 
     * con il pattern /contacts nel percorso del path. */
    @RequestMapping("/contacts")
    public ModelAndView showContacts() {
 
        return new ModelAndView("contact", "command", new Contact());
    }
}