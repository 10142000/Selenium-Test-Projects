package com.kk.sj3.p2;

import java.util.Scanner;

public class RuntimeInput {

	public static void main(String[] args) {
		/*
		 * 2. Write a program that would print the information (name, year of joining,
		 * salary, address) of three employees by creating a class named 'Employee'. The
		 * output should be as follows:
		 *  Name     Year of joining          Address
		 * Robert       1994           	 64C-WallsStreat 
		 * Sam          2000			 68D- WallsStreat
		 * John 		1999 			  26B- WallsStreat
		 */

		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Employee name : ");
		String empname = sc.next();
		System.out.println("Employee year of joining : ");
		int empyoj = sc.nextInt();
		System.out.println("Employee address : ");
		String empaddr = sc.next();
		e.get(empname, empyoj, empaddr);
		e.show();
	}

}
