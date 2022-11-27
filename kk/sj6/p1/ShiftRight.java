package com.kk.sj6.p1;

//Write a program to shift every element of an array to circularly right

public class ShiftRight {

	static int i, j, last, n;

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		n=3;
		
		System.out.println("Original array");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ "");
			
		}
		for(i=0;i<n;i++) {
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				
				arr[j]=arr[j-1];
				
			}
			arr[0]=last;
		}
		
System.out.println("array after right Rotation");
for(i=0;i<arr.length;i++) {
	System.out.println(arr[i]+ "");
}
	
}

	
}
		
		
		
		
		



