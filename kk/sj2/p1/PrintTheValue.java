package com.kk.sj2.p1;

public class PrintTheValue {

	public static void main(String[] args) {
	
		/*
		 * Write a program to add 8 to the number 2345 and then divide it by 3. Now, the
		 * modulus of the quotient is taken with 5 and then multiply the resultant value
		 * by 5. Display the final result.
		 */
		int num = 8;
		long numOne = 2345;
		int divisor = 3;
		int modulous = 5;
		int multiplier = 5;
		
		System.out.println("The final Result: "+(((num+numOne)/divisor)%modulous)*multiplier);
//		System.out.println("The final Result: "+(((8+2345)/3)%5)*5);   
	}

}
