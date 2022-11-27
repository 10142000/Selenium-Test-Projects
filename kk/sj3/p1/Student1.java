package com.kk.sj3.p1;

import java.util.Scanner;

/*Assign and print the roll number, phone number and address
	of two students having names "Sam" and "John" respectively by 
	creating two objects of class 'Student'
	*/

public class Student1 {

	static String samaddress;
	static int samroll_no;
	static long samph_no;
	static String johnaddress;
	static int johnroll_no;
	static long johnph_no;
	

		public void getJohn(String johnaddress, int johnroll_no, long johnph_no) {

			this.johnroll_no = johnroll_no;
			this.johnaddress = johnaddress;
			this.johnph_no = johnph_no;
		}

		public void showJohn() {

			System.out.println("John roll number : " + johnroll_no);
			System.out.println("John Address : " + johnaddress);
			System.out.println("John phone number : " + johnph_no);

		}
		
		

		public void getSam(String samaddress, int samroll_no, long samph_no) {

			this.samroll_no = samroll_no;
			this.samaddress = samaddress;
			this.samph_no = samph_no;
		}

		public void showSam() {

			System.out.println("Sam roll number : " + samroll_no);
			System.out.println("sam Address : " + samaddress);
			System.out.println("Sam phone number : " + samph_no);

		}
		
		

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter john roll no : ");
		int johnroll_no = sc.nextInt();
		System.out.println("enter john address : ");
		String johnaddress = sc.next();
		System.out.println("enter john phone number : ");
		long johnph_no = sc.nextInt();
		System.out.println("enter sam roll no : ");
		int samroll_no = sc.nextInt();
		System.out.println("enter sam address : ");
		String samaddress = sc.next();
		System.out.println("enter sam phone number : ");
		long samph_no = sc.nextInt();
		Student1 s1=new Student1();
		s1.getSam(samaddress, samroll_no, samph_no);
		s1.showSam();
		s1.getJohn(johnaddress, johnroll_no, johnph_no);
		s1.showJohn();
		

	}








}
