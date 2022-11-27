package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenEx {
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.browserstack.com/users/sign_in");
		d.manage().window().maximize();
		d.findElement(By.id("user_email_login")).sendKeys("kk");
		d.findElement(By.id("user_password")).sendKeys("12345");
		Thread.sleep(3000);
		d.findElement(By.id("user_submit")).click();
		d.close();
	}

}
