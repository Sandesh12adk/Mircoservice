package com.example.service_two.controller;
import com.example.service_two.circuitbreaker.ServiceOneFeignClientFallBack;
import com.example.service_two.feignclient.ServiceOneFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {
    @Autowired
    private ServiceOneFeignClient serviceOneFeignClient;

    @GetMapping("/sayhello")
    public ResponseEntity<String> sayHello() {
        return serviceOneFeignClient.sayHello();
    }
}

