package com.example.service_two.feignclient;

import com.example.service_two.circuitbreaker.ServiceOneFeignClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="SERVICE-ONE",fallback = ServiceOneFeignClientFallBack.class)
public interface ServiceOneFeignClient {
    @GetMapping("/message-from-service-one")
    public ResponseEntity<String> sayHello();
}
