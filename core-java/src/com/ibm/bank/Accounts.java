package com.ibm.bank;
/**
 * 
 * @author 003RSR744
 *
 */
public abstract class Accounts implements Bank{
	private int accno;
	private String holder;
	protected double bal;
	private static int autogen = ACNO;
	protected Transaction[] txns;
	protected int idx;
/** @Default constructor.*/
	public Accounts() {

	}
/**
 * @parameterized constructor.
 */
	public Accounts(String holder, double bal) {
		this.accno = autogen++;
		this.holder = holder;
		this.bal = bal;
	}
/**
 * 
 */
	public void summary() {
		System.out.println("A/c No:" + accno);
		System.out.println("Holder:" + holder);
		System.out.println("Balance:" + bal);
	}
/**
 * 
 */
	public void deposit(double amount) {
		bal += amount;
		System.out.println("After deposit: " + bal);

	}
/**
 * 
 */
	public void withdrawl(double amount) throws balException {
		if (amount <= bal) {
			bal -= amount;
		} else {
			System.out.println("Insufficient Balance");
		}
	}
}
