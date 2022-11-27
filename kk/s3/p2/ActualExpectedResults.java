package com.kk.s3.p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//	Test http://www.youtube.com/ and check whether expected and actual title is matched
//	or not

public class ActualExpectedResults {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.youtube.com");
		String a = d.getTitle();
		String a1 = "YouTube";
		System.out.println(a.equals(a1));

	}

}
