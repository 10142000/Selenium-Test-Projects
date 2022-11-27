package com.kk.sj4.p1;

public class Manager extends Member {
	private String spec;
	private String dept;
	public Manager(String spec, String dept) {
		super();
		this.spec = spec;
		this.dept = dept;
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