package com.kk.s9.p1;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/* Create a java test class, say, ParameterizedTest1.java.
 Add test method parameterTest() to your test class. This method takes
a string as input parameter.
 Add the annotation @Parameters(&quot;myName&quot;) to this method. The
parameter would be passed a value from testng.xml,
*/
public class ParameterizedTest1 {

	@Parameters({"myName"})
	@Test
	public void parameterTest(String n) {
		System.out.println(n);	
	}

}
