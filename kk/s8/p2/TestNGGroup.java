package com.kk.s8.p2;

import org.testng.annotations.Test;
/*1.TestNG Groups
Create @test with four methods
1. void logIn()
2. void viewNews()
3. void checkMail()
4. void logOut()
You have 4 different test methods in single test case and from them you
want to run only those test methods which are related to checking E-Mail.
So, create logIn(), checkMail(), logOut() with same group name and execute it
[Note: use testNg.xml also]*/

public class TestNGGroup {
	@Test(groups = { "Functional Testing" })
	public void LogIn() {
		System.out.println("Log in");
	}

	@Test(groups = { "Functional Testing" })
	public void ViewNews() {
		System.out.println("View News");
	}

	@Test(groups = { "Functional Testing" })
	public void checkMail() {
		System.out.println("CheckMail");
	}

	@Test(groups = { "Functional Testing" })
	public void logOut() {
		System.out.println("Log out");
	}

}
