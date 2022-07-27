package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class customer {
	@Id
	@Column(name = "cust_id")
	private int custId;
	@Column(name = "cname")

	private String custname;
	@Column(name = "cr_limit")

	private int custlimit;

	public customer() {

	}

	public customer(int custId, String custname, int custlimit) {
		this.custId = custId;
		this.custname = custname;
		this.custlimit = custlimit;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getCustlimit() {
		return custlimit;
	}

	public void setCustlimit(int custlimit) {
		this.custlimit = custlimit;
	}

	@Override
	public String toString() {
		return "customer [custId=" + custId + ", custname=" + custname + ", custlimit=" + custlimit + "]";
	}
	

}
