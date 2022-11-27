package com.kk.s11.p1;

public class KeywordDrivenFramework {

	public static void main(String[] args) throws Exception {
		String path="F:\\kk-project\\TestData.xlsx";
		ReadXL.data(path,0);
		for(int i=1;i<=7;i++) {
			String s=ReadXL.data(i, 0);
			System.out.println(s);
			if(s.equals("Open_Browser")) {
				TestCase.Open_Browser();				
			}
			else if(s.equals("Enter_URL")) {
				TestCase.Enter_URL();
			}
			else if(s.equals("Click_On_Link")) {
				TestCase.Click_On_Link();
			}
			else if(s.equals("Enter_Text")) {
				TestCase.Enter_Text();
			}
			
			else if(s.equals("Click_On_Button")) {
				TestCase.Click_On_Button();
			}
			else if(s.equals("Close_Browser")) {
				TestCase.Close_Browser();
			}
			
		}
			
			
	}

}
