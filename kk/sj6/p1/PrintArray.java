package com.kk.sj6.p1;

import java.util.Scanner;

public class PrintArray {
	static int sumE=0 , sumO=0;

	public static void main(String[] args) {
		/*
		 * Take 10 integer inputs from user and print the following: number of positive
		 * numbers number of negative numbers number of odd numbers number of even
		 * number number of 0s.
		 */
		Scanner sc = new Scanner(System.in);
		int a1[] = { -1, -2, -3, -4, 0, 1, 2, 3, 4, 5 };
		System.out.println("print the 10 integer values");

		for (int i = 0; i < a1.length; i++) {

			System.out.println(a1[i]);

		}

		System.out.println("user input positive : ");
		for (int i = 0; i < a1.length; i++) {

			if (a1[i] < 0) {

				System.out.println(a1[i]);
			}
		}

		System.out.println("user input negative : ");
		for (int i = 0; i < a1.length; i++) {

			if (a1[i] > 0) {

				System.out.println(a1[i]);

			}
		}

		System.out.println("user input zero : ");
		for (int i = 0; i < a1.length; i++) {

			if (a1[i] == 0) {

				System.out.println(a1[i]);
			}
		}
		System.out.println("sum of the Even number " + sumE);
		System.out.println("sum of the odd number " + sumO);
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] % 2 == 0) {

				sumE = sumE + a1[i];
				
			} else {
				sumO = sumO + a1[i];
				
			}

		}

	}
}
