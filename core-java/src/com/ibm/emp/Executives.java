package com.ibm.emp;

public class Executives extends emp{
	private double incentives;
	
	public Executives() {
		
	}

	public Executives(String empname, int salary,double incentives) {
		super(empname, salary);
		this.incentives=incentives;
	}
	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Incentives: "+incentives);
	}

	}


