package com.kk.s6.p2;

import java.io.File;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteOperation {

	public static void main(String[] args) throws Exception {
		File f = new File("F:\\kk-project\\11.xls");
		WritableWorkbook wb = Workbook.createWorkbook(f);
		WritableSheet sh = wb.createSheet("data", 0);

		Label l = new Label(0, 0, "name");
		sh.addCell(l);
		sh.addCell(new Label(0, 1, "kk"));
		sh.addCell(new Label(0, 2, "kiruba"));

		Label l2 = new Label(1, 0, "location");
		sh.addCell(l2);
		sh.addCell(new Label(1, 1, "chennai"));
		sh.addCell(new Label(1, 2, "bangalore"));
		wb.write();
		wb.close();
		System.out.println("Done");
		}

}
