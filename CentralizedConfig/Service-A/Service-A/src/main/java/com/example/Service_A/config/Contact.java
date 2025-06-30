package com.example.Service_A.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties
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

    // Getter methods
    public String getMessage() {
        return message;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    // Setter methods (optional but recommended for full functionality)
    public void setMessage(String message) {
        this.message = message;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}