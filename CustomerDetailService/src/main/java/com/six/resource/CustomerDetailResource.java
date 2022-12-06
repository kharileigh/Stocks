/**
 *
 * @author kharileigh
 * <---- MAKE CALL TO 
 */

package com.six.resource;

import com.six.entity.CustomerShareList;
import com.six.service.CustomerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDetailResource {
    
    // INJECT DEPENDENCY : Customer Detail Service
    @Autowired
    private CustomerDetailService service;
    
    // GET OPERATION 
    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerShareList getCustomerShareList(@PathVariable("customerId") int customerId) {
    
        return new CustomerShareList(service.getCustomerShareByCustomerId(customerId));
    }
}
