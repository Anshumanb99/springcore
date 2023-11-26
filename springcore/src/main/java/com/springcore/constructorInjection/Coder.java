package com.springcore.constructorInjection;

public class Coder {
	private String name;
	private int coderId;
	private Certi certi;
	
	public Coder(String name, int coderId, Certi certi) {
		
		this.name = name;
		this.coderId = coderId;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return this.name+"   "+this.coderId+"  "+this.certi;
	}
}
