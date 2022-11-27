package com.kk.s7.p1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Write a script that contains two @Test annotations and verify the
functioning of all the annotations : 
@BeforeClass,
@AfterClass,
@Test,
@Before,
@After
Link-http://only-testing-blog.blogspot.com/2013/11/new-test.html
Input data for first name text field in the above link
1. User1
2. User2
[Note: In following order script should be executed browser launch, open
URL, send first input data for first name text box, close browser and similar
order for second input data]*/

public class TestAnnotation {
	public static WebDriver d;
	public static WebElement n,v,v1;
	@BeforeClass
	public static void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
	}
	@Before
	public void Openurl() {
		d.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		d.manage().window().maximize();
		n=d.findElement(By.xpath("//*[@id=\"post-body-2641311481947341581\"]/div[1]/form[1]/input[1]"));
		v=d.findElement(By.xpath("//*[@id=\"post-body-2641311481947341581\"]/div[1]/form[1]/input[7]"));
		v1=d.findElement(By.xpath("//*[@id=\"post-body-2641311481947341581\"]/div[1]/form[1]/input[6]"));
	}
	

	@Test
	public void SendFirstInputData() throws InterruptedException {
		n.sendKeys("KK");
		Thread.sleep(3000);
		v.click();
		Thread.sleep(3000);
	}
	@Test
	public void SendSecondInputData() throws InterruptedException {
		n.sendKeys("JK");
		Thread.sleep(3000);
		v1.click();
		Thread.sleep(3000);
	}
	@After
	public void print() {
		System.out.println("completed");
		
	}
	@AfterClass
	public static void close() {
		
		d.close();
	}
	

}
