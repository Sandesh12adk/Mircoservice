package com.example.service_two.feignclient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@CircuitBreaker(name = "myCircuitBreaker", fallbackMethod = "fallbackSayHello")
@FeignClient("SERVICE-ONE")
public interface ServiceOneFeignClient {
    @GetMapping("/message-from-service-one")
    public ResponseEntity<String> sayHello();
}
