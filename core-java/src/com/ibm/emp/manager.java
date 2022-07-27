package com.ibm.emp;

public class manager extends emp{
private double commission;

public manager() {
	
}

public manager(String empname, int salary, double commission) {
	super(empname, salary);
	this.commission=commission;
}

@Override
public void payslip() {
	super.payslip();
	System.out.println("commission: "+commission);
}


}
