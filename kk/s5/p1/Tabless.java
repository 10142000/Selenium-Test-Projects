package com.kk.s5.p1;

/*Open http://mycontactform.com/ and test Date of Birth field. To check whether all days
from 1-31 are displayed and print all date values in the console.
*/

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tabless {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.mycontactform.com/samples.php");

		WebElement m = a.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[15]/td/select[1]"));
		m.click();
		Select m1 = new Select(m);
		List<WebElement> v = m1.getOptions();
		for (WebElement q : v) {
			System.out.println(q.getText());
		}

		WebElement d = a.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[15]/td/select[2]"));
		d.click();
		Select d1 = new Select(d);
		List<WebElement> l = d1.getOptions();
		for (WebElement e : l) {
			System.out.println(e.getText());
		}

		WebElement y = a.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[15]/td/select[3]"));
		y.click();
		Select y1 = new Select(y);
		List<WebElement> k = y1.getOptions();
		for (WebElement b : k) {
			System.out.println(b.getText());
		}

	}
}
