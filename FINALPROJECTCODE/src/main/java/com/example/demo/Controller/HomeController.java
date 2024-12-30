package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class CustomHomeController {

    @GetMapping("/")
    public String home(Model model) {
        try {
            // Get the local IP address of the server
            String ipAddress = InetAddress.getLocalHost().getHostAddress();
            model.addAttribute("ipAddress", ipAddress);
            
            // Add custom data to the model
            model.addAttribute("message", "Welcome to our application!");
            model.addAttribute("serverStatus", "Active");

        } catch (UnknownHostException e) {
            e.printStackTrace();
            model.addAttribute("ipAddress", "Unable to fetch IP");
            model.addAttribute("message", "Error fetching server details.");
            model.addAttribute("serverStatus", "Inactive");
        }

        return "index";
    }
}
