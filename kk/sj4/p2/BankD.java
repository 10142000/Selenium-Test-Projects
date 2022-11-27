
package com.kk.sj4.p2;

import java.util.Scanner;

/*
 * Create an abstract class 'Bank' with an abstract method 'getBalance'. $100,
 * $150 and $200 are deposited in banks A, B and C respectively. 'BankA',
 * 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method
 * named 'getBalance'. Call this method by creating an object of each of the
 * three classes.
 */
//		write a program using interface for above program instead of abstract class

interface  Bank1 {
	public void getbalance();

}

class BankA1 implements Bank1 {
	public void getbalance() {
		int depositA1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bankA amount");
		depositA1 = sc.nextInt();
		System.out.println("balance of bankA : " + depositA1);
	}
}

class BankB1 implements Bank1 {
	public void getbalance() {
		int depositB1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bankB amount");
		depositB1 = sc.nextInt();
		System.out.println("balance of bankB : " + depositB1);
	}
}

class BankD implements Bank1 {
	public void getbalance() {
		int depositD;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bankC amount ");
		depositD = sc.nextInt();
		System.out.println("balance of banC : " + depositD);
	}

	public static void main(String[] args) {
		BankA1 a = new BankA1();
		BankB1 b = new BankB1();
		BankD c = new BankD();

		a.getbalance();
		b.getbalance();
		c.getbalance();

	}

}
