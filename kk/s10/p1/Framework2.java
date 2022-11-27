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
	@Test(dataProvider = "login")
	public void One(String u, String p) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
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
	public void Login() throws Exception{
		String path="F:\\kk-project\\mail2.xlsx";
		FileInputStream f=new FileInputStream(path);
		Workbook w=new XSSFWorkbook(f);
		Sheet s=w.getSheet("Sheet1");
		int rc=s.getLastRowNum();
		int cc=s.getRow(0).getLastCellNum();
		System.out.println("Row Count : "+rc);
		System.out.println("Column Count : "+cc);
		for(int i=0;i<rc;i++) {
			for(int j=0;j<cc;j++) {
				String data=s.getRow(i).getCell(j).getStringCellValue();
				System.out.println(" "+data+" ");
			}
		}	
	}
	
}

