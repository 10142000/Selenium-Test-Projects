package com.kk.s11.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	public static WebDriver d;
	public static void Open_Browser() {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
	}
	public static void Enter_URL() {
		d.manage().window().maximize();
		d.get("http:\\\\google.com");	
	}
	public static void Click_On_Link() {
		d.findElement(By.linkText("Gmail")).click();
		d.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
	}
	public static void Enter_Text() throws InterruptedException {
		d.findElement(By.id("identifierId")).sendKeys("testuser");
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(3000);
	}

	public static void Click_On_Button() throws InterruptedException {
		d.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(3000);
	}
	public static void Close_Browser() {
		d.close();
	}

}
