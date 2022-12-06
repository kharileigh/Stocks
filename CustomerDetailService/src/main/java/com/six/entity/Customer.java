/**
 *
 * @author kharileigh
 * <----- PROJECT : Customer Service ----->
 */

package com.six.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    
    private int detailId;
    private int customerId;
    private int shareId;
    private String shareType;
    private int quantity;
    
}
