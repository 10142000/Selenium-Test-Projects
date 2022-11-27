package com.kk.s5.p2;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement t = a.findElement(By.xpath("//*[@id=\"email_create\"]"));
		t.click();
		t.sendKeys("kirbakk.official.com");
		WebElement ca = a.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		ca.click();
		
		File s = ((TakesScreenshot) a).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File("F:\\Selenium-Tasks\\1.png"));
		a.close();

	}

}
