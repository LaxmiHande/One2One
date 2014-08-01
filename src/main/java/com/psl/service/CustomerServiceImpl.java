package com.psl.service;

import java.io.Serializable;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.psl.bean.Address;
import com.psl.bean.Customer;

public class CustomerServiceImpl extends HibernateDaoSupport implements
		CustomerService {

	public Customer getCustomer(long id) {
		// TODO Auto-generated method stub
		return (Customer) getHibernateTemplate().get(Customer.class, id);
	}

	public void save(Customer customer) {
		getHibernateTemplate().save(customer);

	}

	@Override
	public void save(Address add) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(add);

	}

}
