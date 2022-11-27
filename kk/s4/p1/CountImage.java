package com.kk.s4.p1;

import java.util.List;

import org.openqa.selenium.By;

//Open Naukri home page and check count of image available from homepage.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountImage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/");
		d.manage().window().maximize();
		List<WebElement> l = d.findElements(By.tagName("img"));
		System.out.println("the number of image available is :" + l.size());
		d.close();

	}

}
