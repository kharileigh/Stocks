/**
 *
 * @author kharileigh
 * <---- USES REST TEMPLATE TO MAKE CALLS TO CUSTOMER SERVICE PROJECT FOR DETAILS ----> 
 */

package com.six.service;

import com.six.entity.Customer;
import com.six.entity.CustomerDetail;
import com.six.entity.CustomerList;
import com.six.entity.Share;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerDetailServiceImpl implements CustomerDetailService {

    // INJECT DEPENDENCY : RestTemplate
    @Autowired
    private RestTemplate restTemplate;
    
    @Override
    public List<CustomerDetail> getCustomerDetailByCustomerId(int customerId) {
        
        // CREATE LIST : CustomerDetail entity 
        List<CustomerDetail> customerDetailsList = new ArrayList<CustomerDetail>();
        
        // CALL CUSTOMER SERVICE : GET - List of Customers, store in customers
        CustomerList customerList = restTemplate.getForObject("" + customerId, CustomerList.class);
        
        // ITERATE OVER CUSTOMERS : GET - shares
        for(Customer customer : customerList.getCustomers()) {
        
            // CALL SHARE SERVICE : GET - shareId
            Share share = restTemplate.getForObject("" + customer.getShareId(), Share.class);
            
            
            String shareName = share.getShareName();
            double unitPrice = share.getMarketPrice();
            double totalValuation = unitPrice * customer.getQuantity();
        
            // INSTANTIATE OBJECT : CustomerDetail entity (OUTPUT DETAILS)
            // customerId - shareName - quantity - unitPrice - totalValuation - shareType
            CustomerDetail customerDetail = new CustomerDetail(customer.getCustomerId(), shareName, customer.getQuantity(), unitPrice, totalValuation, customer.getShareType());
            
            // ADD CUSTOMER DETAIL OBJECT - LIST OF CUSTOMER DETAILS ENTITY
            customerDetailsList.add(customerDetail);
        }
        
        return customerDetailsList;
    }
    
    
}
