package com.ibm.lib;
public class member {
private String name;
private Book bk;

public String getname() {
	return name;
}

public void setBk(Book bk) {
	this.bk = bk;
}

public member(String name) {
	this.name = name;
}

public void status() {
	if(bk==null) {
		System.out.println(name+"is not issued");
	}
	else {
		System.out.println(name+"is issued to "+bk.gettitle());
	}
}



}
