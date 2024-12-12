package com.sadcode.schoolproject.controller;

import com.sadcode.schoolproject.model.Contact;
import com.sadcode.schoolproject.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class ContactController {

//    private static final Logger log = LoggerFactory.getLogger(ContactController.class);

    @Autowired
    private ContactService contactService;

    @GetMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }


    @PostMapping("/saveMsg")
    public ModelAndView saveMessage(Contact contact) {
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");

    }
}
