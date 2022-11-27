package com.kk.sj3.p2;

public class RectangleExample {
	public static void main(String[] args) {
		
//		Write a program find a rectangle's area and perimeter. Using parameterized constructor
		
		
		class r {
			int length;
			int breadth;
			int width;

			r(int l, int b) {
				this.length = l;
				this.breadth = b;
			}

			public int Area() {
				return length * breadth;
			}

			public int Perimeter() {
				return 2*(length + width);
			}

		}
		r obj = new r(4, 5);
		r obj1 = new r(4, 5);
		System.out.println(obj.Area());
		System.out.println(obj1.Perimeter());
	}
}