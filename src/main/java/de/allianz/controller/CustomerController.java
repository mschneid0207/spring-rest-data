package de.allianz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.allianz.entity.Customer;
import de.allianz.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable String id) {
		System.out.println("id: " + id);
		
		
		System.out.println("juhu");
		
		return customerService.getCustomerById(Integer.parseInt(id));
	}

}
