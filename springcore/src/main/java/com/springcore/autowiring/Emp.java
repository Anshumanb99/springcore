package com.springcore.autowiring;

public class Emp {

	//always lkeep reference variable and bean name same in xml file for autowiring
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress1(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
}
