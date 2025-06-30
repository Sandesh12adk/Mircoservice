package com.example.Service_A.dto;

public class ContactDto {
    private String message;
    private String applicationName;
    private String email;
    private String address;
    private String number;

    // Getters
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

    // Setters
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

    // Optional: toString() method
    @Override
    public String toString() {
        return "ContactDto{" +
                "message='" + message + '\'' +
                ", applicationName='" + applicationName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}