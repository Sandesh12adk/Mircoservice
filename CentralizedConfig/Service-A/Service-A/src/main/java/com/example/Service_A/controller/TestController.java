package com.example.Service_A.controller;

import com.example.Service_A.config.Contact;
import com.example.Service_A.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Contact contact;
    @GetMapping("/serviceA-contact")
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