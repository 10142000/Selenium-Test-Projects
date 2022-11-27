package com.kk.sj3.p1;

import java.util.Scanner;

/*
		 * where we deposit and withdraw amount from our account. Creating an Account
		 * class which has deposit () and withdraw () methods
		 */

public class Account {

	static int amount;
	static int withdrawamount;
	static int depositamount;

	public void deposit(int amount, int depositamount) {
		this.amount = amount;
		this.depositamount = depositamount;
	}

	public void showdeposit() {
		System.out.println(" amount : " + amount);
		System.out.println("deposit amount : " + (amount + depositamount));

	}
	
	

	public void withdraw(int amount, int withdrawamount) {
		this.amount = amount;
		this.withdrawamount = withdrawamount;
	}

	public void showwithdraw() {
		System.out.println(" amount : " + amount);
		System.out.println("deposit amount : " + (amount - withdrawamount));

	}
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account details");
		System.out.println("account amount : ");
		amount = sc.nextInt();
		System.out.println("deposit amount : ");
		depositamount = sc.nextInt();
		System.out.println("withdraw amount : " );
		withdrawamount = sc.nextInt();
		Account a = new Account();
		a.deposit(amount, depositamount);
		a.withdraw(amount, withdrawamount);
		a.showdeposit();
		a.showwithdraw();

	}

}
