package com.kk.s5.p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://demo.guru99.com/test/upload/");
		a.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Oviyaa\\Desktop\\Selenium task\\S2.1.txt");
		a.findElement(By.id("terms")).click();
		a.findElement(By.id("submitbutton")).click();
		a.close();

	}

}
