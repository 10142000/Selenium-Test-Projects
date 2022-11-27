package com.kk.s13.p2;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jframework {

	public static void main(String[] args) throws Exception {
		Logger l=Logger.getLogger("get");
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		l.debug("Browser is Opened");
		d.get("http://demo.guru99.com/test/login.html");
		l.debug("Login page is Opened");
	
		d.findElement(By.id("email")).sendKeys("kk");
		Thread.sleep(3000);
		d.findElement(By.id("passwd")).sendKeys("123456");
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		Thread.sleep(3000);
		l.debug("User Dashboard is Opened");
		d.close();
		l.debug("Browser is closed");
	}

}
