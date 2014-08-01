package com.psl.bean;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

	private long address_id=1;
	private String city;
	private String country;

	public String getCity() {
		return city;
	}

	@Id
	@Column(name = "address_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/*//new one
	@OneToOne(mappedBy = "address")
	Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/

}
