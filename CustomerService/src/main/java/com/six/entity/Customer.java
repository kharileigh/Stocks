package com.six.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customerService")
public class Customer {

	@Id
	private int detailId;
	private int customerId;
        private int shareId;
        private String shareType;
        private int quantity;
}
