package com.psl.bean;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
	private long cust_id;
	private String name;


	@Id
	@Column(name = "cust_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getCust_id() {
		return cust_id;
	}

	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Address address;


	@OneToOne
	@JoinColumn(name = "address_id")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
