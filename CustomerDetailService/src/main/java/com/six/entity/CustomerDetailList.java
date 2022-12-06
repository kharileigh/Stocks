/**
 *
 * @author kharileigh
 * <----- NEW INTEGRATED ENTITY LIST ----->
 */

package com.six.entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetailList {
   
    List<CustomerDetailList> customerShares;
}
