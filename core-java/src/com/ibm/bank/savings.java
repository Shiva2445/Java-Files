package com.ibm.bank;
public class savings extends Accounts {
	public savings() {
	}

	public savings(String holder) {
		super(holder, MIN_AC_BAL);
		txns = new Transaction[10];
		txns[idx++] = new Transaction("CR", bal, bal);
	}

	@Override
	public void withdrawl(double amount) throws balException {
		if (amount < (bal - MIN_AC_BAL)) {
			bal -= amount;
			txns[idx++] = new Transaction("DR", amount, bal);
		} else
			throw new balException("Insufficient Balance");
	}

	@Override
	public void statement() {
		// TODO Auto-generated method stub
		
	}
}
