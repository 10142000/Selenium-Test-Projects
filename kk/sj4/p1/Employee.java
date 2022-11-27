package com.kk.sj4.p1;

public class Employee extends Member {
	String spec;
	String dept;
	public Employee(String dept, String spec) {
		this.dept = dept;
		this.spec = spec;
	}
	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
