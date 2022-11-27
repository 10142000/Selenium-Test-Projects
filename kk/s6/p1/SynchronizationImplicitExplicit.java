package com.kk.s6.p1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SynchronizationImplicitExplicit {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
//		WebDriverWait w=new WebDriverWait(d,10);
		d.get("https://geodata.solutions/");
		Select s=new Select(d.findElement(By.xpath("//*[@id=\"countryId\"]")));
		String c="India";
		s.selectByVisibleText(c);
		System.out.println("country : "+c);
		
		Select s1=new Select(d.findElement(By.xpath("//*[@id=\"stateId\"]")));
		String st="Tamil Nadu";
		s1.selectByVisibleText(st);
		System.out.println("State : "+st);
		
		Select s2=new Select(d.findElement(By.xpath("//*[@id=\"cityId\"]")));
		String city="Chennai";
		s2.selectByVisibleText(city);
		System.out.println("City : "+city);
		
	}

}
