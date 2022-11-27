package com.kk.s6.p1;
import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
public class ReadOp {
	public static void main(String[] args) throws Exception {
		File f=new File("F:\\kk-project\\11.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh=wb.getSheet(0);
		int rc=sh.getRows();
		int cc=sh.getColumns();
		System.out.println("Column count :  "+rc);
		System.out.println("Row count :  "+cc);
		String s=sh.getCell(1,2).getContents();
		System.out.println(s);
		for(int i=0;i<rc;i++) {
			for(int j=0;j<cc;j++) {
				String data=sh.getCell(j,i).getContents();
				System.out.println(data+": ");
			}
			System.out.println(" ");
		}
		

	}

}
