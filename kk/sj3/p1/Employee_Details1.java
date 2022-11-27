package com.kk.sj3.p1;

import java.util.Scanner;

/*
	 * 2.Create a class named ‘Employee’ with variable id, name and salary and
	 * methods insert () and display ().at least print three employees record in
	 * output Java Program to demonstrate the working of a banking-system
	 */

class Employee {

	int id;
	String name;
	int salary;

	public void insert(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public void display() {
		System.out.println("employee name :" + name);
		System.out.println("employee id :" + id);
		System.out.println("employee salary :" + salary);
	}

}

public class Employee_Details1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee id");
		int id = sc.nextInt();
		System.out.println("enter employee name");
		String name = sc.next();
		System.out.println("enter employee salary");
		int salary = sc.nextInt();
		Employee e = new Employee();
		e.insert(id,name,salary);
		e.display();
	}

}
