package com.mtd.Ecomapp.entity;

// This is a simple Data Transfer Object (DTO).
// Its only job is to carry data from the client to the server.
public class LoginCustomer {
    private String email;
    private String password;

    // Getters and Setters
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // Constructors (optional but good practice)
    public LoginCustomer() {}

    public LoginCustomer(String email, String password) {
        this.email = email;
        this.password = password;
    }
}