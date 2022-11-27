package com.kk.s10.p2;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*1.Write a script to write data from excel sheet using apache poi
Output should be in this format:

UserName		password	result
testemailone@gmail.com  password

2.write a script to read data from excel using @dataprovider annotation.*/

public class dataProvider {

	@Test
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
