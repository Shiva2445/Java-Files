package com.ibm.shop;
public class product {
private String name;
private int price;

public product() {	
}
public product(String name, int price) {
	this.name = name;
	this.price = price;
}
public void description() {
	System.out.println("Name: "+name);
}
public int getprice() {
	System.out.println("price: "+price);
return price;
}
public static void main(String[] args) {
	product p=new product("shiva",500);
	p.description();
	p.getprice();
}
}
