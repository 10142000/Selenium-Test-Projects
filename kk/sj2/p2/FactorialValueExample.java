package com.kk.sj2.p2;

public class FactorialValueExample {
		
		
		/*
		 * Write a program to find the factorial value of any number[Factorial of any
		 * number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.- 
		 * 4! =1*2*3*4 = 24
		 *  3! = 3*2*1 = 6 
		 *  2! = 2*1 = 2
		 */
		    // method to find factorial of given number
		    static int factorial(int n)
		    {
		        if (n == 0)
		            return 1;
		 
		        return n * factorial(n - 1);
		    }
		 
		    // Driver method
		    public static void main(String[] args)
		    {
		        int num = 4;
		        System.out.println("Factorial of " + num
		                           + " is " + factorial(4));
		    }
	}


