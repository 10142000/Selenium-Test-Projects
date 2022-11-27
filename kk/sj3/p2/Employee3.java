package com.kk.sj3.p2;

class Employee3 extends Employee{
	String emp3name;
	String emp3addr;
	int emp3yoj;

	public void employee3(String emp3name, int emp3yoj, String emp3addr) {
		this.emp3name = emp3name;
		this.emp3yoj = emp3yoj;
		this.emp3addr = emp3addr;
	}

	public void show() {
		System.out.println("emp3 name : " + emp3name);
		System.out.println("emp3 yoj : " + emp3yoj);
		System.out.println("emp3 addr : " + emp3addr);
	}
}