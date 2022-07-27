package com.ibm.stock;

public class Stock implements Exchanger {
	public void view() {
		System.out.println("View Quote");
	}
	
	public void get() {
		System.out.println("Get Quote");
	}
	
	public void set() {
		System.out.println("Set Quote");
	
	}
}

