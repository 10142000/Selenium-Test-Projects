package com.kk.sj2.p2;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		/*
		 * Write a program that reads a set of integers, and then prints the sum of the
		 * even and odd integers.
		 */

		int n, sumE = 0, sumO = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of element in array");
		n = s.nextInt();
		int[] a = new int[n];
		System.out.println("enter the element of array");
		for (int i = 0; i < n; i++) {

			a[i] = s.nextInt();

		}
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {

				sumE = sumE + a[i];
			} else {
				sumO = sumO + a[i];
			}

		}
		System.out.println("sum of the odd number" + sumO);
		System.out.println("sum of the Even number" + sumE);
	}
}
