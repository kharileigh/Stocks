package com.six.persistence;

import com.six.entity.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
    
    public List<Customer> searchCustomerByCustomerId(int customerId); //By customerid or detail id?

}
