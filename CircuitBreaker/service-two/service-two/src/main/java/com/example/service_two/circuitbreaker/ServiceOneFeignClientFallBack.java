package com.example.service_two.circuitbreaker;

import com.example.service_two.feignclient.ServiceOneFeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ServiceOneFeignClientFallBack implements ServiceOneFeignClient {
    @Override
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Service one is down");
    }
}
