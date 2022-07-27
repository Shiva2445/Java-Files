package com.ibm.bank;

public class currentTrans extends Transaction {
private double overdraft;
	public currentTrans(String txn_Type, double amount, double bal, double overdraft) {
		super(txn_Type, amount, bal);
		this.overdraft=overdraft;
	}
	@Override
	public String toString() {
		return super.toString()+"\t"+ overdraft;
	}

}
