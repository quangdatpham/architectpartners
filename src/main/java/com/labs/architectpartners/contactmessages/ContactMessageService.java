package com.labs.architectpartners.contactmessages;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ContactMessageService {

    private final ContactMessageRepository contactMessageRepository;

    public ContactMessageService(ContactMessageRepository contactMessageRepository) {
        this.contactMessageRepository = contactMessageRepository;
    }

    public ContactMessageResource save(ContactMessageResource resource) {
        ContactMessage savedMessage = contactMessageRepository.save(new ContactMessage(resource));
        return new ContactMessageResource(savedMessage);
    }
}
