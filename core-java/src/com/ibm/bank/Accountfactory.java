package com.ibm.bank;

public final class Accountfactory {
	public static savings opensavings(String holder) {
		return new savings(holder);
	}

		public static current opencurrent(String holder) {
			return new current(holder);
	}
}
