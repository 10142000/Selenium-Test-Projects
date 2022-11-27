package com.kk.sj3.p2;

public class Rectangle {
	public static void main(String[] args) {

		/*
		 * 1. Write a program to print the area of two rectangles having sides (4,5) and
		 * (5,8) respectively by creating a class named 'Rectangle' with a method named
		 * 'Area' which returns the area and length and breadth passed as parameters to
		 * its constructor.
		 */

		class r {
			int lenght;
			int breath;

			r(int l, int b) {
				this.lenght = l;
				this.breath = b;
			}

			public int area() {
				
				return lenght * breath;
			}
		}
		r obj = new r(4, 5);
		r obj1 = new r(5, 8);

		System.out.println(obj.area());
		System.out.println(obj1.area());

	}

}
