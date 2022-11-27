package com.kk.sj4.p2;

import java.util.Scanner;

abstract class Shape {
	abstract void RectangleArea();

	abstract void SquareArea1();

	abstract void CircleArea1();
}

public class FindArea extends Shape {

	void RectangleArea() {
		int length=0, breadth=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("length of Rectangle : " + length);
		length = sc.nextInt();
		System.out.println("breadth of Rectangle : " + breadth);
		breadth = sc.nextInt();
		System.out.println("REctangle Area "+ (length*breadth));
		
		

	}

	void SquareArea1() {
		int side=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("side of Square : " + side);
		side = sc.nextInt();
		System.out.println("Square Area "+ (side*side));

	}

	void CircleArea1() {
		int r;
		float pi = 3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Radius of Circle : " );
		r = sc.nextInt();
		System.out.println("Circle Area "+ (pi*r*r));

	

	}

	public static void main(String[] args) {
		/*
		 * We have to calculate the area of a rectangle, a square and a circle. Create
		 * an abstract class 'Shape' with three abstract methods namely 'RectangleArea'
		 * taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter
		 * each. The parameters of 'RectangleArea' are its length and breadth, that of
		 * 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create
		 * another class 'Area' containing all the three methods 'RectangleArea',
		 * 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and
		 * circle respectively. Create an object of class 'Area' and call all the three
		 * methods. I
		 */

		FindArea fa = new FindArea();
		fa.RectangleArea();
		fa.SquareArea1();
		fa.CircleArea1();

	}

}
