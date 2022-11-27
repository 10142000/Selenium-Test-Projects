package com.kk.sj3.p1;

import java.util.Scanner;

/*
 * 1.Create a class named 'Student' with String variable 'name' and integer
 * variable 'roll no'.
 *  Assign the value of ‘roll no’ as '2' and that of name as
 * "John" by creating an object of the class Student. 
 */

public class Student {

	String name;
	int roll_no;
	String address;
	long ph_no;
	public void get(String name , String address,int roll_no,long ph_no) {
		this.name=name;
		this.roll_no=roll_no;
		this.address=address;
		this.ph_no=ph_no;
	}
	
	public void show() {
		System.out.println("Student name : "+name);
		System.out.println("Student roll number : "+roll_no);
		System.out.println("student Address : "+address);
		System.out.println("Student phone number : "+ph_no);
		
	}
}

class StudentDetails {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter student name : ");
		String name = sc.next();
		System.out.println("enter student roll no : ");
		int roll_no = sc.nextInt();
		System.out.println("enter student address : ");
		String address = sc.next();
		System.out.println("enter student phone number : ");
		long ph_no = sc.nextInt();
		Student s= new Student();
		s.get(name,address,roll_no,ph_no);
		s.show();
	}
} 