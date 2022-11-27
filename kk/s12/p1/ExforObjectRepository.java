package com.kk.s12.p1;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExforObjectRepository {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		FileInputStream fi=new FileInputStream("F:\\Selenium-Tasks\\Task-selenium\\Selenium Task\\a.properties");
		p.load(fi);
		String path=p.getProperty("path");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get(p.getProperty("link"));
		d.findElement(By.name(p.getProperty("Username"))).sendKeys("mgr123");
		Thread.sleep(3000);
		d.findElement(By.name(p.getProperty("Password"))).sendKeys("mgr!23");
		Thread.sleep(3000);
		d.findElement(By.name(p.getProperty("button"))).click(); 	
		Thread.sleep(3000);
		System.out.println("log in succesfully");
		d.close();
	}

}
