package com.kk.sj3.p2;

class Employee2 extends Employee{
	String emp2name;
	String emp2addr;
	int emp2yoj;

	public void employee2(String emp2name, int emp2yoj, String emp2addr) {
		this.emp2name = emp2name;
		this.emp2yoj = emp2yoj;
		this.emp2addr = emp2addr;
	}

	public void show() {
		System.out.println("emp2 name : " + emp2name);
		System.out.println("emp2 yoj : " + emp2yoj);
		System.out.println("emp2 addr : " + emp2addr);
	}
}