/**
 *
 * @author kharileigh
 * <----- PROJECT : Share Service ----->
 */

package com.six.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Share {
    
    private int shareId;
    private String shareName;
    private double marketPrice;
    
}
