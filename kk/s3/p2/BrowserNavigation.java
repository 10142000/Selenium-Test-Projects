package com.kk.s3.p2;


//	Open three different website using selenium web driver and perform browser navigation
//	operations

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		RemoteWebDriver a = new ChromeDriver();
		a.navigate().to("https://www.google.com");
		a.navigate().back();
		a.navigate().forward();
		a.navigate().refresh();
		Thread.sleep(3000);
		a.navigate().to("https://www.instagram.com");
		a.navigate().back();
		a.navigate().forward();
		a.navigate().refresh();
		Thread.sleep(3000);
		a.navigate().to("https://www.facebook.com");
		a.navigate().back();
		a.navigate().forward();
		a.navigate().refresh();
		a.close();
	}

}
