package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceObject implements InitializingBean,DisposableBean{

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public InterfaceObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AnnotatedObject [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// init() method of bean lifecycle
		System.out.println("Inside the InterfaceObject init method");
		
	}

	public void destroy() throws Exception {
		// destroy() method of bean lifecycle
				System.out.println("Inside the InterfaceObject destroy method");
		
	}
	
}
