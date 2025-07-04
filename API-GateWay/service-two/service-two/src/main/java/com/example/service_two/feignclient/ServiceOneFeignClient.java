package com.example.service_two.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SERVICE-ONE")
public interface ServiceOneFeignClient {
    @GetMapping("message-from-service-one")
    public ResponseEntity<String> sayHello();
}
