package com.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String showLandingPage() {
        return "landing"; // Maps to landing.html
    }

    @GetMapping("/customer-details")
    public String showCustomerDetails() {
        return "customer_details"; // Maps to customer_details.html
    }

    @GetMapping("/customer-name")
    public String showCustomerName() {
        return "customer_name"; // Maps to customer_name.html
    }

    @GetMapping("/customer-proof")
    public String showCustomerProof() {
        return "customer_proof"; // Maps to customer_proof.html
    }

    @GetMapping("/customer-contact")
    public String showCustomerContact() {
        return "customer_contact"; // Maps to customer_contact.html
    }

    @GetMapping("/customer-address")
    public String showCustomerAddress() {
        return "customer_address"; // Maps to customer_address.html
    }
}
