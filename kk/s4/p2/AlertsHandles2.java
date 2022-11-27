package com.kk.s4.p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Open https://www.mycontactform.com/ and select date from calendar pop up.
Selected Date: 10-04-2000 (Month/Date/Year)*/

public class AlertsHandles2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.mycontactform.com/samples.php");
		d.manage().window().maximize();
		WebElement mon = d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[15]/td/select[1]"));
		mon.click();
		Select a = new Select(mon);
		String s1 = "10";
		a.selectByVisibleText(s1);
		mon.click();

		WebElement day = d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[15]/td/select[2]"));
		day.click();
		Select a1 = new Select(day);
		String s = "4";
		a1.selectByVisibleText(s);
		day.click();

		WebElement yr = d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[15]/td/select[3]"));
		yr.click();
		Select a2 = new Select(yr);
		String s2 = "2000";
		a2.selectByVisibleText(s2);
		yr.click();

		System.out.println(s1 + "-" + s + "-" + s2);

	}
}
