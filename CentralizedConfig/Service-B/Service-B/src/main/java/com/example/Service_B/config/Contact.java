package com.example.Service_B.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@Data
@RefreshScope
public class Contact {
    @Value("${common}")
    private String message;
    @Value("${application.name}")
    private String applicationName;
    @Value("${contact.email}")
    private String email;
    @Value("${contact.address}")
    private String address;
    @Value("${contact.number}")
    private String number;
}
