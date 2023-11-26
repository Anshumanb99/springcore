package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	private String Empname;
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> courses;
	
	public Emp(String empname, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		Empname = empname;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Emp [Empname=" + Empname + ", phones=" + phones + ", address=" + address + ", courses=" + courses + "]";
	}
	
	
}
