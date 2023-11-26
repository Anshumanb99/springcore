package com.springcore.annotationAutowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	//autowiring through object
	//qualifier annotation is used to tell ioc which bean it need to autowire exactly by user instead of assigning by ioc.
	@Autowired
	@Qualifier("temp2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	//autowiring through setter
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	//autowiring through constructor
//	@Autowired
	public Emp(Address address) {
		
		super();
		
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	

	
	
}
