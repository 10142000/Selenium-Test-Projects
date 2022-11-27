package com.kk.s10.p1;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Framework2 {
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
		String path = "F:\\kk-project\\mail2.xlsx";
		FileInputStream f = new FileInputStream(path);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int rc = s.getLastRowNum();
		int cc = s.getRow(0).getLastCellNum();
		System.out.println("Row Count : " + rc);
		System.out.println("Column Count : " + cc);
		String data[][] = new String[rc][cc];
		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < cc; j++) {
				data[i][j] = s.getRow(i).getCell(j).getStringCellValue();

			}
		}
		return data;
	}

}
