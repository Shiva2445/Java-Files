package com.ibm.stock;

public final class stocksingleton {
	private stocksingleton() {
	}
	private static Stock s;
	public static Stock getstock() {
		if (s==null)
			s=new Stock();
		return s;
	}

}
