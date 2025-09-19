package com.mtd.Ecomapp.controller;

import com.mtd.Ecomapp.entity.LoginCustomer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/login")
    public ResponseEntity<?> loginCustomer(@RequestBody LoginCustomer loginCustomer) {
        String email = loginCustomer.getEmail();
       // String password = loginCustomer.getPassword();

        System.out.println("Attempting login for email: " + email);
        return ResponseEntity.ok("Login successful for " + email);
    }
}