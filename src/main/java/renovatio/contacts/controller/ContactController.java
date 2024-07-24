package renovatio.contacts.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import renovatio.contacts.model.Contact;
import renovatio.contacts.service.ContactService;

import java.util.List;

@Controller
public class ContactController {
    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
    @Autowired
    ContactService contactService;

    @GetMapping("/")
    public String start(ModelMap modelMap){
        List<Contact> contacts = contactService.ListContacts();
        contacts.forEach((contact) -> logger.info(contact.toString()));
        modelMap.put("contacts", contacts);
        return "index";//index
    }

    @GetMapping("/add-contact")
    public String showAddContact(){
        return "add-contact";//add-contact
    }

    @PostMapping("/add-contact")
    public String addContact(@ModelAttribute("contactForm") Contact contact){
        logger.info("Adding Contact: " + contact);
        contactService.saveContact(contact);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable(value = "id") Integer idContact, ModelMap modelMap){
        Contact contact = contactService.searchContactById(idContact);
        logger.info("Editing contact: " + contact);
        modelMap.put("contact", contact);
        return "edit"; //Edit.html
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("contact") Contact contact){
        logger.info("Contact to save_:" + contact);
        contactService.saveContact(contact);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Integer idContact) {
        Contact contact = contactService.searchContactById(idContact);
        contact.setIdContact(idContact);
        logger.info("Eliminando contacto: " + contact);
        contactService.deleteContact(contact);
        return "redirect:/";
    }
}
