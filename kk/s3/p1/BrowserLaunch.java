package com.kk.s3.p1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*Test simple website http://mycontactform.com/. Pass values for textbox, radio box, check
box, text area using selenium web driver and check whether page is properly executing or*/

import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.mycontactform.com/samples.php");
		WebElement email_to = d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]"));
		email_to.click();
//		textbox
		WebElement Subject = d.findElement(By.id("subject"));
		Subject.click();
		Subject.sendKeys("maths");
		WebElement email = d.findElement(By.id("email"));
		email.click();
		email.sendKeys("kirubakk.official@gmail.com");
		WebElement q1 = d.findElement(By.id("q1"));
		q1.click();
		q1.sendKeys("f");
//		text area
		WebElement q2 = d.findElement(By.id("q2"));
		q2.click();
		q2.sendKeys("maths is a good subject");
		
//		radiobox
		WebElement q4 = d.findElement(By.id("q4"));
		q4.click();
		q4.sendKeys("Fourth Option");
		
//		checkbox
		WebElement q5 = d.findElement(By.xpath("//*[@id=\"q5\"]"));
		q5.click();
		q5.sendKeys("single answer");
		WebElement checkbox6 = d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[9]/td/div[1]/input[6]"));
		checkbox6.click();
		checkbox6.sendKeys("Fourth Check Box");
		
		WebElement q6 = d.findElement(By.id("q6"));
		q6.click();
	
	
	
	}

}
