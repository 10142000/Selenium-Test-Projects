package com.kk.sj3.p2;

public class Employee {
	String empname;
	String empaddr;
	int empyoj;

	public void get(String empname, int empyoj, String empaddr) {
		this.empname = empname;
		this.empyoj = empyoj;
		this.empaddr = empaddr;
	}

	public void show() {
		System.out.println("emp name" + empname);
		System.out.println("emp yoj" + empyoj);
		System.out.println("emp addr" + empaddr);
	}
}
