package com.six.service;

import com.six.entity.Customer;
import java.util.List;

public interface CustomerService {

	public List<Customer> searchCustomerById(int id);
}
