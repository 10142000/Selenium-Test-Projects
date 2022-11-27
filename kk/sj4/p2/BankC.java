package com.kk.sj4.p2;

import java.util.Scanner;
/*
 * Create an abstract class 'Bank' with an abstract method 'getBalance'. $100,
 * $150 and $200 are deposited in banks A, B and C respectively. 'BankA',
 * 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method
 * named 'getBalance'. Call this method by creating an object of each of the
 * three classes.
 */

abstract class Bank {
	abstract void getbalance();

}

class BankA extends Bank {
	void getbalance() {
		int depositA;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bankA amount");
		depositA = sc.nextInt();
		System.out.println("balance of bankA : " + depositA);
	}
}

class BankB extends Bank {
	void getbalance() {
		int depositB;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bankB amount");
		depositB = sc.nextInt();
		System.out.println("balance of bankB : " + depositB);
	}
}

class BankC extends Bank {
	void getbalance() {
		int depositC;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bankC amount ");
		depositC = sc.nextInt();
		System.out.println("balance of banC : " + depositC);
	}

	public static void main(String[] args) {
		BankA a=new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
		
		a.getbalance();
		b.getbalance();
		c.getbalance();

	}

}
