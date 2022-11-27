package com.kk.s7.p1;
import static org.testng.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 1.Write a script to verify whether check box 1 is selected or not in a given
 * link using
 * 
 * @Before,
 * 
 * @After and
 * 
 * @Test annotations alone
 * Link-http://only-testing-blog.blogspot.com/2013/11/new-test.html
*/

public class JunitAnnotation {
	public static WebDriver d;
	public static String t,t1,t2,t3,t4;
	@Before
	public void open() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
	}
	

	@Test
	public void test() throws InterruptedException {
		
		t=d.getTitle();
		System.out.println(t);	
		d.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
		d.findElement(By.xpath("//*[@id=\"B09M7P15CW\"]/a[2]/span/div")).click();
		d.findElement(By.id("buy-now-button")).click();
		t1=d.getTitle();
		assertEquals(t1,t);
		d.navigate().back();
		t2=d.getTitle();
		assertEquals(t2,t);
		Thread.sleep(5000);
	}
	@After
	public void close() {
		d.close();
	}
}
