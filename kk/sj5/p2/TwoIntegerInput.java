package com.kk.sj5.p2;

import java.util.Scanner;

/*Write a program to take two integer inputs from user and 
print sum and product of them. (Using Scanner class)*/

public class TwoIntegerInput {

	public static void main(String[] args) {
		int i, j;
		Scanner s = new Scanner(System.in);
		System.out.println("first input : ");
		i = s.nextInt();
		System.out.println("second input : ");
		j = s.nextInt();
		System.out.println("sum of two inputs : " + (i + j));

	}

}
