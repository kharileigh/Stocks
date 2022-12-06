package com.six.service;

import com.six.entity.Customer;
import com.six.persistence.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Customer searchCustomerById(int id) {
		return customerDao.findById(id).orElse(null);
	}

}
