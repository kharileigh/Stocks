/**
 *
 * @author kharileigh
 * <----- NEW INTEGRATED ENTITY ---->
 */

package com.six.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerShare {
    
    private int customerId;
    private String shareName;
    private int quantity;
    private double unitPrice;
    private double totalValuation;
    private String shareType;
    
}
