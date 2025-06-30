package com.example.Service_B.controller;

import com.example.Service_B.config.Contact;
import com.example.Service_B.dot.ContactDto;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Contact contact;

    @GetMapping("/serviceB-contact")
    public ResponseEntity<?> returnTestData(){
        ContactDto contactDto= new ContactDto();
        contactDto.setAddress(contact.getAddress());
        contactDto.setEmail(contact.getEmail());
        contactDto.setMessage(contact.getMessage());
        contactDto.setNumber(contact.getNumber());
        contactDto.setApplicationName(contact.getApplicationName());
        return ResponseEntity.ok(contactDto);
    }
}
