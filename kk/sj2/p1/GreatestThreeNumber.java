package com.kk.sj2.p1;
import java.util.Scanner; 

public class GreatestThreeNumber {

	public static void main(String[] args) {
//		Write a Program to find greatest of three numbers
		int a, b, c, largest, temp;  
		Scanner sc = new Scanner(System.in); //object of the Scanner class  
		//reading input from the user  
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		//comparing a and b and storing the largest number in a temp variable  
		temp=a>b?a:b;  //temp= 10>20->> fail   temp = 10:20->>
		//comparing the temp variable with c and storing the result in the variable  
		largest=c>temp?c:temp;  //largest=30>20->>> true,then get c  else,false means get temp
		//prints the largest number  
		System.out.println("The largest number is: "+largest);  
		
		

	}
}
