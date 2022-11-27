package pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pack1.Pageclass;
public class Testclass {
	public static WebDriver d;
	@BeforeClass
	public void Open() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.browserstack.com/users/sign_in");
		d.manage().window().maximize();
		
	}
	@Test
	public void test() throws Exception {
		Pageclass p=new Pageclass(d);
		p.validatelogin();
	}
	
}
