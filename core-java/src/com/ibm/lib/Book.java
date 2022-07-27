package com.ibm.lib;
public class Book {
private String title;
private member mb;

public Book(String title) {
	this.title = title;
}

public String gettitle() {
	return title;
}
public void status() {
	if(mb==null) {
		System.out.println(title+"is not issued");
	}
	else {
		System.out.println(title+"is issued to "+mb.getname());

	}
}

public void issued(member m) throws LibException {
this.mb=m;
m.setBk(this);
throw new LibException(title+"is issued");
}


public void returned(member m) {
	mb=null;
	m.setBk(null);
		System.out.println(title+"is not issued");
	}
}



