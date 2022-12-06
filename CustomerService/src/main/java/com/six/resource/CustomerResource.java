package com.six.resource;

import com.six.entity.Customer;
import com.six.entity.CustomerList;
import com.six.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerResource {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path="/customers/{cid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerList searchCustomerById(@PathVariable("cid") int id) {
		return new CustomerList(customerService.searchCustomerById(id));
	}
}
