package com.kk.s9.p1;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Subtract {
	@Parameters({"a","b"})
	@Test
	public static void subtract(int a,int b) {
		
		System.out.println(a-b);
		
	}

}
