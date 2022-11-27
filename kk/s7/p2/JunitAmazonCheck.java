package com.kk.s7.p2;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/*Automate all the Menu links of amazon.in and Verify page titles
Steps to Automate:

1. Launch browser of your choice say., Firefox, chrome etc.
2. Open this URL -  https://www.amazon.in/
3. Maximize or set size of browser window.
4. Get the page title and print it.
5. Click on first menu link, say &#39;Amazon Pay&#39;.
6. Get Page title and verify it with expected value.
7. Navigate back to Home Page. 
8. Get Page title and verify it with expected value.
9. Repeat steps 5 to 8 for other menu links.(At least 2 Links)
10. Close the browser.
[Note: use assert equals for validation]*/

public class JunitAmazonCheck {
	public static WebDriver d;
	public static String t, t1, t2, t3, t4,t5;

	@BeforeClass
	public static void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
	}

	@Test
	public void test() throws InterruptedException {
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		t = d.getTitle();
		System.out.println(t);
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"B0B3DKDP9G\"]/a[2]/span/div")).click();
		Thread.sleep(3000);
		d.findElement(By.id("buy-now-button")).click();
		Thread.sleep(3000);
		d.findElement(By.id("ap_email")).sendKeys("kkiruba639@gmail.com");
		d.findElement(By.id("continue")).click();
		d.findElement(By.id("ap_password")).sendKeys("filmmaker");
		d.findElement(By.id("signInSubmit")).click();
		t1 = d.getTitle();
		assertNotEquals(t, t1);
		d.navigate().to("https://www.amazon.in/");
		t2 = d.getTitle();
		assertEquals(t, t2);
		Thread.sleep(3000);
	}
	@Test
	public void test1() throws InterruptedException {
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		t3 = d.getTitle();
		System.out.println(t3);
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"acs-product-block-0\"]/a/span/span[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.id("buy-now-button")).click();
		Thread.sleep(3000);
		t4 = d.getTitle();
		assertNotEquals(t3, t4);
		d.navigate().to("https://www.amazon.in/");
		t5 = d.getTitle();
		assertEquals(t3, t5);
	}
	@AfterClass
	public static void close() {
		d.close();
	}
	
}

