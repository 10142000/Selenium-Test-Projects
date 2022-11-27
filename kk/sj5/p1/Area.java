package com.kk.sj5.p1;

import java.util.Scanner;
/*
 * Create a class to print the area of a square and a rectangle. 
 * The class has two methods with the same name but different number of parameters.
 *  The method for printing area of rectangle has two parameters which are length and
 * breadth respectively while the other method for printing area of square has
 * one parameter which is side of square.
 */

public class Area {


	public void area(int length, int breadth) {
		System.out.println("area of the rectangle :" + (length*breadth));

	}

	public void area(int side) {
		System.out.println("side of the Square :" + (side*side));
//		super.area();

	}

	public static void main(String[] args) {
		int length;
		int breadth;
		int side;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the length value : ");
		length = sc.nextInt();
		System.out.println("enter the breadth value : ");
		breadth = sc.nextInt();
		System.out.println("enter the side value : ");
		side = sc.nextInt();
		Area a = new Area();

		a.area( side);
		a.area(breadth,length);
		

	}

}
