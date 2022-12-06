package com.six.service;

import com.six.entity.Customer;
import com.six.persistence.CustomerDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> searchCustomerById(int id) {
		return customerDao.searchCustomerByCustomerId(id);
	}

}
