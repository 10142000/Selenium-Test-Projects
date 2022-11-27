package com.kk.s10.p2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadData {
	public static WebDriver d;
	@Test(dataProvider = "login")
	@DataProvider(name = "login")
	public void Login() throws Exception {
		String path = "F:\\kk-project\\justprint.xlsx";
		FileInputStream f = new FileInputStream(path);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int rc = s.getLastRowNum();
		int cc = s.getRow(0).getLastCellNum();
		System.out.println("Row Count : " + rc);
		System.out.println("Column Count : " + cc);
		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < cc; j++) {
				String data = s.getRow(i).getCell(j).getStringCellValue();
				System.out.println(" " + data + " ");
			}
		}

	}



}
