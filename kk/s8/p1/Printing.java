package com.kk.s8.p1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*Write a script with three @test methods as follows:
	   a. Void registerAccount()
	   b. void sendEmail()
	   c. void login()
	   And set priority for the above test methods so the output
	   should be as follows:
	   Register Account
	   Login
	   Email*/
public class Printing {
	@BeforeClass
	public static void BrowserLaunch() {
	}
	@Test(priority=1)
	public void registerAccount(){	
		System.out.println("Register Account");
	}
	@Test(priority=3)
	public void sendEmail(){
		System.out.println("Send Email");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Log In");
		
	}
	@AfterClass
	public static void close() {
		
	}

}
