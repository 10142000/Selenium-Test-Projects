package com.kk.sj4.p1;
/*1.Create a class named 'Member' having the following members:


Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' 
and 'Manager' classes have data members 'specialization' and 'department' respectively.
 Now, assign name, age, phone number, address and salary to an employee and a manager
 by making an object of both of these classes and print the same*/

import java.util.Scanner;

public class Member {
	static String name;
	static int age;
	static long ph_no;
	static String address;
	static int sal;



	public static void PrintSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter salary details  ");
		sal = sc.nextInt();
		System.out.println(" salary of an employe is : " + sal);
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name : ");
		String name = sc.next();
		System.out.println("enter the age : ");
		int age = sc.nextInt();
		System.out.println("enter the phone number : ");
		long ph_no = sc.nextInt();
		System.out.println("enter the address : ");
		String address = sc.next();
		System.out.println("enter the salary : ");
		int salary = sc.nextInt();

		System.out.println("enter the manager department : ");
		String deptManager = sc.next();
		System.out.println("enter the manager specialization : ");
		String specManager = sc.next();

		System.out.println("enter the employee department : ");
		String deptEmp = sc.next();
		System.out.println("enter the employee specialization : ");
		String specEmp = sc.next();

		Manager m = new Manager(deptManager, specManager);
		Employee e = new Employee(deptEmp, specEmp);
		

		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("phone number : " + ph_no);
		System.out.println("address : " + address);

		System.out.println("Employee department :" + e.getDept() + "Employee specialization  : " + e.getSpec());
		System.out.println("Manager department :" + m.getDept() + "Manager specialization  : " + m.getSpec());
		PrintSalary();

	}

}
