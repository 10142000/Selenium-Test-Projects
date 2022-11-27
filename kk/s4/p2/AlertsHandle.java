package com.kk.s4.p2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Open https://demoqa.com/alerts , Access all types of pop up window and get values from
	every pop up and print in console.*/

public class AlertsHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/alerts");

		WebElement a = d.findElement(By.xpath("//*[@id=\"alertButton\"]"));
		a.click();
		Alert sa1 = d.switchTo().alert();
		System.out.println("alertButton : " + sa1.getText());
		Thread.sleep(3000);
		sa1.accept();

		WebElement c = d.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
		c.click();
		Alert ca = d.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("confirmButton : " + ca.getText());
		ca.accept();

		WebElement p = d.findElement(By.xpath("//*[@id=\"promtButton\"]"));
		p.click();
		Alert pa = d.switchTo().alert();
		p.sendKeys("kk");
		System.out.println("promtButton : " + pa.getText());
		Thread.sleep(3000);
		pa.accept();

		

	}

}
