package com.sadcode.schoolproject.service;

import com.sadcode.schoolproject.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactService {

//    private static final Logger log = LoggerFactory.getLogger(ContactService.class);

    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }
}
