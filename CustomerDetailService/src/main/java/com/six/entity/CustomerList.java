
/**
 *
 * @author kharileigh
 * <----- PROJECT : Share Service ----->
 */

package com.six.entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerList {
    
    List<Customer> shares;
}
