/**
 *
 * @author kharileigh
 * <----- INTERACTS WITH VIEW --->
 */

package com.six.controller;

import com.six.entity.CustomerShare;
import com.six.service.CustomerDetailService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerDetailController {
    
    // INJECT DEPENDENCY - Service Layer
    @Autowired
    private CustomerDetailService service;
    
    
    // MAP RELEVANT VIEW TO USER 
    @RequestMapping("/")
    public ModelAndView getCustomerInputPage() {
    
        return new ModelAndView("InputCustomerId");
    }
    
    @RequestMapping("/showStocks")
    public ModelAndView showStocksController(@RequestParam("customerId") int customerId) {
    
        ModelAndView mav = new ModelAndView();
        
        // CREATE LIST : CustomerShare entity - call service to get current customer
        List<CustomerShare> customerDetailList = service.getCustomerShareByCustomerId(customerId);
        
        // SET OBJECT TO MAP DETAILS & OBJECT TO DISPLAY CUSTOMER ID - displays on ShowStocks 
        mav.addObject("customerDetails", customerDetailList);
        mav.addObject("customerId", customerId);
        mav.setViewName("ShowStocks");
        
        return mav;
    }
}
