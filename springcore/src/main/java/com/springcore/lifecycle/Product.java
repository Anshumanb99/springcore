package com.springcore.lifecycle;

public class Product {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	public void initialize() {
		System.out.println("Inside init() method");
	}
	public void destruction() {
		System.out.println("Inside destroy() method");
	}
	
}
