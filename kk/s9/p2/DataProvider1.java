package com.kk.s9.p2;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

/*1.check the sign in with three username and password for the below link
http://automationpractice.com/index.php?controller=authentication&amp;back=my-account
input data:
username password
TestOne @gmail.com one
TestTwo@gmail.com Two
TestThree@gmail.com Three*/
public class DataProvider1 {
	public static WebDriver d;

	@Test(dataProvider = "login")
	public void One(String u, String p) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://automationpractice.com/index.php?controller=authentication&amp;back=my-account");
		d.manage().window().maximize();
		d.findElement(By.id("email")).sendKeys(u);
		Thread.sleep(3000);
		d.findElement(By.id("passwd")).sendKeys(p);
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		Thread.sleep(3000);
		d.close();
	}

	@DataProvider(name = "login")
	public String[][] Login() throws Exception {
		File f = new File("F:\\kk-project\\mail1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
		int rc = s.getRows();
		int cc = s.getColumns();
		String[][] s1 = new String[rc][cc];
		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < cc; j++) {
				s1[i][j] = s.getCell(j, i).getContents();
			}
		}
		return s1;
	}

}
