package com.kk.sj4.p1;

import java.util.Scanner;

/*
 * Create a class named 'Rectangle' with two data members 'length' and 'breadth'
 * and two methods to print the area and perimeter of the rectangle
 * respectively. Its constructor having parameters for length and breadth is
 * used to initialize length and breadth of the rectangle. Let class 'Square'
 * inherit the 'Rectangle' class with its constructor having a parameter for its
 * side (suppose s) calling the constructor of its parent class . Print the area
 * and perimeter of a rectangle and a square.
 */

public class Rectangle {
	static int length;
	static int breadth;
	

	public void area(int length, int breadth) {
//		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void showarea() {
		System.out.println("length of the area :" + length);
		System.out.println("breadth of the area :" + breadth);
	}

	public void perimeter(int length, int breadth) {
//		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void showperimeter() {
		System.out.println("length of the perimeter :" + length);
		System.out.println("breadth of the perimeter :" + breadth);

	}

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length value : ");
		length = sc.nextInt();
		System.out.println("enter the breadth value : ");
		breadth = sc.nextInt();
	
		

		Rectangle r = new Rectangle();
		Square s = new Square();

		r.area(length, breadth);
		r.perimeter(length, breadth);
		r.showarea();
		r.showperimeter();

		s.side(length);
		s.showarea();

	}

}

class Square extends Rectangle {

	public void side(int length) {
//		super();
		this.length = length;
	}

	public void showarea() {
		System.out.println("side of the area : " + length);

	}

}