package com.kk.s9.p1;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Sum {
	@Parameters({"a","b"})
	@Test
	public static void sum(int a , int b) {

		System.out.println(a+b);
		
		
		
	}

}
