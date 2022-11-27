package com.kk.s4.p1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Open http://only-testing-blog.blogspot.com/ Select multiple countries from dropdown.	
public class DropdownHandles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://only-testing-blog.blogspot.com/");
		d.manage().window().maximize();
		WebElement c=d.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div[1]/form[2]/table/tbody/tr/td[1]/select"));
		Select c1=new Select(c);
		c1.selectByIndex(0);
		Thread.sleep(3000);
		c1.selectByIndex(1);
		Thread.sleep(3000);
		c1.selectByIndex(2);
		Thread.sleep(3000);
		c1.selectByIndex(3);
		Thread.sleep(3000);
		c1.selectByIndex(4);
		Thread.sleep(3000);
		c1.selectByIndex(5);
		Thread.sleep(3000);
		c1.selectByIndex(6);
		Thread.sleep(3000);
		c1.selectByIndex(7);
		Thread.sleep(3000);
		c1.selectByIndex(8);
		Thread.sleep(3000);
		c1.selectByIndex(9);
		Thread.sleep(3000);
		c1.selectByIndex(10);
		Thread.sleep(3000);
		
		List<WebElement> l=c1.getOptions();		
		for(WebElement e:l) {
			System.out.println(e.getText());
		}
		d.close();

	}

}
