package com.kk.sj2.p1;

import java.util.Scanner;

public class LeapYear {
	   public static void main(String[] args){
		   
			/*
			 * Write a program to check if a year is leap year or not. If a year is
			 * divisible by 4 then it is leap year but if the year is century year like
			 * 2000, 1900, 2100 then it must be divisible by 400.
			 */
	      int year;
	      System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))  
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	   }
	}


