package com.ibm.bank;

public interface Bank {

	 int ACNO = 1;
	int MIN_AC_BAL = 1000;
	double OPENING_CURR_AC_BAL = 5000;
	double MIN_CURRENT_BAL = 0;
	double OVERDRAFT = 10000;
	
	void deposit(double amount);
	void withdrawl(double amount) throws balException;
	void summary();
	void statement();
	
}
