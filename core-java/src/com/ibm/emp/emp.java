package com.ibm.emp;

public class emp {
private int empid;
private String empname;
private int salary;
private static int empnum=1;
/** default constructor*/
public emp() {
	
}
/**
 * parameterized constructor.
 * @param empname
 * @param salary
 */
public emp(String empname,int salary) {
	this.empid=empnum++;
	this.empname=empname;
	this.salary=salary;
}

	public void payslip() {
		System.out.println("ID: "+empid +" "+ "Name: " +empname+" "+"Salary: "+salary);
		
		}
public int getsalary() {
	return salary;
}
}
