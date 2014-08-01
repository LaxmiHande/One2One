package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Address;
import com.psl.bean.Customer;
import com.psl.service.CustomerService;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Address address = new Address();
		address.setCity("Solapur");
		address.setCountry("India");

		Customer cust = new Customer();
		cust.setAddress(address);
		cust.setName("LaxmiHande");

		/*
		 * SessionFactory factory = new AnnotationConfiguration().configure()
		 * .buildSessionFactory(); Session session = factory.openSession();
		 * Transaction tx = session.beginTransaction();
		 * System.out.println("in"); session.save(address); session.save(cust);
		 * 
		 * System.out.println("done");
		 * 
		 * CustomerServiceImpl cs = new CustomerServiceImpl(); Customer customer
		 * = cs.getCustomer(1L); System.out.println("Customer details :");
		 * System.out.println("Customer name:" + customer.getName());
		 * System.out.println("City:" + customer.getAddress().getCity());
		 * System.out.println("Counrty:" + customer.getAddress().getCountry());
		 * 
		 * tx.commit(); session.close(); factory.close();
		 */

		System.out.println("Hello World!");

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring/config/BeanLocation.xml");

		CustomerService cs = (CustomerService) appContext.getBean("customer");

		cs.save(address);
		cs.save(cust);

		Customer customer = cs.getCustomer(2L);
		System.out.println("Customer details :");
		System.out.println("Customer name:" + customer.getName());
		System.out.println("City:" + customer.getAddress().getCity());
		System.out.println("Counrty:" + customer.getAddress().getCountry());

		System.out.println("Done");
	}
}
