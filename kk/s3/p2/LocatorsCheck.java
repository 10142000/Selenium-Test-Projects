package com.kk.s3.p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test http://mycontactform.com/ and apply all locators like className,
 * cssSelector, id, linkText, partialLinkText, name, tagName and check whether
 * values are submitting through selenium web driver. Perform this test using
 * both Chrome driver .
 */

public class LocatorsCheck {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		  WebDriver d = new ChromeDriver();
		  d.get("http://mycontactform.com/samples.php");
		  WebElement email_to = d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]"));
		  email_to.click(); 
		  // textbox 
		  WebElement Subject = d.findElement(By.className("subject")); Subject.click();
		  Subject.sendKeys("maths");
		  WebElement email = d.findElement(By.id("email"));
		  email.click(); 
		  email.sendKeys("kirubakk.official@gmail.com"); 
		  WebElement q1 = d.findElement(By.cssSelector("q1")); q1.click();
		  q1.sendKeys("f");
		  // text area
		  WebElement q2 = d.findElement(By.partialLinkText("q2")); 
		  q2.click();
		  q2.sendKeys("maths is a good subject");
		  // radiobox 
		  WebElement q4 =  d.findElement(By.id("q4"));
		  q4.click();
		  q4.sendKeys("Fourth Option");
		
		


	}

}
