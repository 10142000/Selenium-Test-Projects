package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber1 {
	public static WebDriver d;	
	@Given("bopen")
	public void bopen() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
				
	}
	@Given("get URL")
	public void URL() {
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		
	}
	@When("Providing Data")
	public void Providing_data() throws InterruptedException {
		d.findElement(By.name("q")).sendKeys("photography");
		Thread.sleep(3000);	
		d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
	}
	@Then("Close")
	public void close() {
		d.close();
	}
}