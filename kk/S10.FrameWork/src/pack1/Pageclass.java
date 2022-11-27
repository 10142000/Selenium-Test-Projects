package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageclass {
	WebDriver d;
	@FindBy(id="user_email_login")
	WebElement uname;
	@FindBy(id="user_password")
	WebElement pass;
	@FindBy(id="accept-cookie-notification")
	WebElement btton;
	@FindBy(id="user_submit")
	WebElement next;
	public Pageclass(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	public void validatelogin() throws InterruptedException {
		uname.sendKeys("kk");
		Thread.sleep(3000);
		pass.sendKeys("pass123");
		Thread.sleep(3000);
		btton.click();
		
		next.click();
	}

}
