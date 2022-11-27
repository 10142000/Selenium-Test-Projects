package com.kk.sj5.p2;

import java.util.Scanner;

/*Ask user to give two double input for length and breadth of a rectangle and
print area type casted to int. (Using Scanner class)*/


public class DoubleInput {

	public static void main(String[] args) {
		double length;
		double breadth;
		Scanner sc = new Scanner(System.in);
		System.out.println("length of a Rectangle : ");
		length = sc.nextDouble();
		System.out.println("breadth of a Rectangle : " );
		breadth = sc.nextDouble();
		
		System.out.println("length of Rectangle : " + length);
	
		System.out.println("breadth of Rectangle : " + breadth);

		System.out.println("REctangle Area : "+ (length*breadth));
		
		
		

	}

}
