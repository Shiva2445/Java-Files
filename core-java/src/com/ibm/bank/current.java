package com.ibm.bank;
public class current extends Accounts{
private double overdraft;
	public current() {
	}

	public current(String holder) {
		super(holder, OPENING_CURR_AC_BAL);
		this.overdraft=OVERDRAFT;

		txns = new currentTrans[10];
		txns[idx++] = new currentTrans("CR", bal, bal, overdraft);
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: "+overdraft);
	}

	@Override
	public void deposit(double amount) {
		if(overdraft<OVERDRAFT) {
			overdraft+=amount;
			System.out.println("Overdraft: "+overdraft);
		}
			else  {
				bal+=amount;
				System.out.println("Balance: "+bal);

			}
	}

	@Override
	public void withdrawl(double amount) throws balException {

		if(bal>=OPENING_CURR_AC_BAL) {
			bal-=amount;
			System.out.println(bal);
			System.out.println(overdraft);

		}
		else if(bal<OPENING_CURR_AC_BAL) {
				overdraft-=amount;
				System.out.println(overdraft);
	}


		else {
			throw new balException("Insufficient Balance");
		}
		}

	@Override
	public void statement() {
		// TODO Auto-generated method stub
		
	}}
