package com.kk.sj2.p1;

public class ConditionCheck {

	public static void main(String[] args) {

		/*
		 * Assign values of variables 'a' and 'b' as 55 and 70 respectively and then
		 * check if both the conditions 'a < 50' and 'a < b' are true. Now solve the
		 * above question to check if atleast one of the conditions 'a < 50' or 'a < b'
		 * is true
		 */

		int a = 45;
		int b = 48;

		if (a < 50 && a < b) //both condition true
		{
			System.out.println("conDion true");
			if (a < 50 || a<b) {  //anyone condition true
				System.out.println("the conDion is  true");
			} 
			else {
				System.out.println("both are false");
			}
		}else {
			System.out.println("conDition failed");
		}
	}

}
