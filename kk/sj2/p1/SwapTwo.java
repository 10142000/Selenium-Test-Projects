package com.kk.sj2.p1;

public class SwapTwo {

	public static void main(String[] args) {
		/*
		 *  first program by using a third variable 2 - second program without using
		 * any third variable
		 * 1 -
		 */
		
		int a=6;
		int b=8;
		b=b-a;
		a=b+a;
		b=-b-(-a); 		//b=-(b-a)
		System.out.println("value of a :"+a);
		System.out.println("value of b :"+b);
	}

}
//a=+b;  ->  a=a+b;