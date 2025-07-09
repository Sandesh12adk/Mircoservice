package com.example.service_two.circuitbreaker;

import com.example.service_two.feignclient.ServiceOneFeignClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceOneSafeCaller {

    private final ServiceOneFeignClient feignClient;
    @Autowired
    public ServiceOneSafeCaller(ServiceOneFeignClient feignClient) {

      this.feignClient = feignClient;
    }

    @CircuitBreaker(name = "myCircuitBreaker", fallbackMethod = "fallbackSayHello")
    public ResponseEntity<String> sayHello() {
     return feignClient.sayHello();
    }

    // fallback method must have same signature + Throwable as last param
    public ResponseEntity<String> fallbackSayHello(Throwable t) {
        System.out.println("Circuit breaker fallback triggered due to: " + t.getMessage());
        return ResponseEntity.status(503).body("Service is unavailable right now (fallback)");
    }
}
