package com.mtd.Ecomapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mtd.Ecomapp.entity.Customer;
import com.mtd.Ecomapp.entity.LoginCustomer;
import com.mtd.Ecomapp.repository.CustomerRepository;


@RestController
public class CustomerController {
	@Autowired
	 private CustomerRepository repo;
	
	
	@PostMapping(path="/signup")
	 public Customer signUp(@RequestBody Customer customer) {
	     customer.setId(null) ;
	     Customer savedCustomer=repo.save(customer);
	     return savedCustomer;
	}
	
	@PostMapping(path="/login")
	String login(@RequestBody LoginCustomer loginCustomer) {
		Customer customer=repo.findByEmail(loginCustomer.getEmail())
        .orElseThrow(() -> new RuntimeException("Customer not found with that email."));
		return "token" + customer.getId();
	}

}
