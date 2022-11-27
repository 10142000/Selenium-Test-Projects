package com.kk.s5.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*Select values from table using xpath and print in console.
		Get third row and second column from table.*/

public class GetTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.w3.org/WAI/tutorials/tables/one-header/");
//		WebElement t = a.findElement(By.xpath("//*[@id=\"main\"]/aside[2]/div/table"));
		WebElement t1 = a.findElement(By.xpath("//*[@id=\"main\"]/aside[2]/div/table/tbody/tr[4]/td[2]"));
		System.out.println(t1.getText());

	}

}
