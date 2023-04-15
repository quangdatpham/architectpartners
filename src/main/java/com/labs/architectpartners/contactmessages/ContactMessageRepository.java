package com.labs.architectpartners.contactmessages;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactMessageRepository extends CrudRepository<ContactMessage, Long> {
}