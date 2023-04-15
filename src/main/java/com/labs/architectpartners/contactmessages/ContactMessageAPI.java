package com.labs.architectpartners.contactmessages;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/contactMessages")
public class ContactMessageAPI {

    private final ContactMessageService contactMessageService;

    public ContactMessageAPI(ContactMessageService contactMessageService) {
        this.contactMessageService = contactMessageService;
    }

    @PostMapping(value = {"", "/"})
    public ResponseEntity<ContactMessageResource> postContactMessage(@RequestBody ContactMessageResource contactMessageResource) {
        ContactMessageResource savedMessageResource = this.contactMessageService.save(contactMessageResource);
        return new ResponseEntity<>(savedMessageResource, HttpStatus.CREATED);
    }
}
