package com.ibm.bank;

public class Transaction {

	private String txn_Type;
	private double amount;
	private double bal;

	public Transaction(String txn_Type, double amount, double bal) {
		this.txn_Type = txn_Type;
		this.amount = amount;
		this.bal = bal;
	}

	@Override
	public String toString() {
		return txn_Type +"\t"+ amount +"\t"+ bal;
	}
}
