
public class Account {
private double balance;

public Account(double balance) {
	this.balance = balance;
}
public double deposit(double amount)throws NumberFormatException {
	if(amount<0)
		throw new NumberFormatException("Negative num");
	balance=+amount;
	return balance;
}

public double withdrawl(double amount)throws NumberFormatException, BalanceException {
	if(amount<0)
		throw new NumberFormatException("Negative num");
	else if(amount>balance)
		throw new BalanceException("Insufficient balance");

	balance-=amount;
	return balance;
}
}
