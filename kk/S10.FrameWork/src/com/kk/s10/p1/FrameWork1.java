package com.kk.s10.p1;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;

public class FrameWork1 {
	public static WebDriver d;

	@Test(dataProvider = "login")
	public static void One(String u, String p) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.browserstack.com/users/sign_in");
		d.manage().window().maximize();
		d.findElement(By.id("user_email_login")).sendKeys(u);
		Thread.sleep(3000);
		d.findElement(By.id("user_password")).sendKeys(p);
		d.findElement(By.id("accept-cookie-notification")).click();
		Thread.sleep(3000);
		d.findElement(By.id("user_submit")).click();
		d.close();
	}

	@DataProvider(name = "login")
	public String[][] Login() throws Exception {
		File f = new File("F:\\kk-project\\justprint.xls");
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
