package com.ibm.shop;

import com.ibm.bank.balException;

public class shoppingCart {
private product products[];
private double total;
private int idx;
public shoppingCart() {
	products=new product[5];

}
public void addToCart(product p)throws shopException {
	//double price=10000;
	if(idx==products.length)
		throw new shopException("Your cart is full");
	else {
		products[idx++]=p;
		total+=p.getprice();
		throw new shopException("added");
	}

}
public void checkout() {
	System.out.println("Products in your cart");
	for(int i=0;i<idx;i++)
		products[i].description();
	System.out.println("Cart Total:"+total);
	
}

}
