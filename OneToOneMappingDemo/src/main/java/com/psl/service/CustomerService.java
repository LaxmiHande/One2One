package com.psl.service;

import com.psl.bean.Address;
import com.psl.bean.Customer;

public interface CustomerService {

	Customer getCustomer(long id);

	void save(Customer cust);
	void save (Address add);
}
