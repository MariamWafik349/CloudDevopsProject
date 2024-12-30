package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomApplication {

    public static void main(String[] args) {
        // Starting the Spring Boot application with custom initialization
        SpringApplication app = new SpringApplication(CustomApplication.class);
        app.setAdditionalProfiles("dev"); // Example of adding a profile
        app.run(args);
    }
}
