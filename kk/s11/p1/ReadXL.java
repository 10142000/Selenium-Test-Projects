package com.kk.s11.p1;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadXL {
	public static XSSFWorkbook wb;
	public static XSSFSheet xs;
	
	public static void data(String path,int snum) throws Exception {
		FileInputStream fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		xs=wb.getSheetAt(snum);				
	}
	public static String data(int rc,int cc) {
		String data=xs.getRow(rc).getCell(cc).getStringCellValue();
		return data;
	}
}
