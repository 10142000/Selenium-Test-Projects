package com.kk.s8.p1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/*TestNG @dependsOnMethods task
Supposing you are testing online email application using selenium WebDriver
and you have two @Test methods in your class:
1. For Login
2. For Check Mail.
Now due to some reasons (Invalid credentials), Login @Test method fails. In
this case you not need to execute Check Mail @Test method because how
can you check mails without Login in email application?
[Note: In this case, You should use dependsOnMethods with @Test
annotation of Check Mail method to skip Its execution.]*/

public class DependsOnMethod {
	@Test(priority = 1)
	public void Login() {
		assertEquals("uname", "pass");
		System.out.println("login");
	}

	@Test(priority = 2, enabled = false, dependsOnMethods = "Login")
	public void CheckMail() {
		System.out.println("CheckMail");
	}

}
