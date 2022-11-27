package com.kk.sj5.p2;

import java.util.Scanner;

/*Take name, roll number and field of interest from user and print in the format below : (Using Scanner class)
Hey, my name is xyz and my roll number is xyz. My field of interest are xyz. */

public class PrintValues {

	public static void main(String[] args) {
		String name;
		int roll_no;
		String foi;
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the name");
		name=s.next();
		System.out.println("enter the roll number");
		roll_no=s.nextInt();
		System.out.println("enter the Field of Interest");
		foi=s.next();
		
		System.out.println("hey");
		System.out.println(" name : "+name);
		System.out.println(" roll number : "+ roll_no);
		System.out.println(" Field of Interest : "+ foi);

	}

}
