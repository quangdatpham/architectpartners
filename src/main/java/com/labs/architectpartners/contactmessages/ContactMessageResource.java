package com.labs.architectpartners.contactmessages;

public class ContactMessageResource {

    private Long id;

    private String name;

    private String email;

    private String message;

    public ContactMessageResource() {
    }

    public ContactMessageResource(Long id, String name, String email, String message) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
    }

    public ContactMessageResource(ContactMessage domain) {
        this.id = domain.getId();
        this.name = domain.getName();
        this.email = domain.getEmail();
        this.message = domain.getMessage();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
