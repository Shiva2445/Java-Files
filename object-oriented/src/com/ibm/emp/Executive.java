package com.ibm.emp;
public class Executive extends Employee {
	private double incentives;

	public Executive() {
		
	}

	public Executive(String empName, double salary,double incentives) {
		super(empName, salary);
		this.incentives = incentives;
	}

	@Override
	public double getSalary() {
	
		return super.getSalary() +incentives;
	}

	@Override
	public void payslip() {
		
		super.payslip();
		System.out.println("Incentives\t:"+incentives);
	}
	

}