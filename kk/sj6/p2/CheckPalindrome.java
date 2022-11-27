package com.kk.sj6.p2;

public class CheckPalindrome {

	public static void main(String[] args) {
//		Write a program to check if a given string is a Palindrome
//		 A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.
		String s="kiruba";
		boolean flag=true;
		s=s.toLowerCase();
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				flag=false;
				break;
			
			}
		}

		if(flag) {
			System.out.println("given string is palindrome");
		}
		else {
			System.out.println("given string is not palindrome");
		}
	}

}
