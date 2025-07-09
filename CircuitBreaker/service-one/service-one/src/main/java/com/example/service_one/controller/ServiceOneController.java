package com.example.service_one.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {
    @GetMapping("/message-from-service-one")
    public ResponseEntity<String> sayHello()throws InterruptedException{
       return ResponseEntity.ok("This is the message from service-one controller");
    }
}
