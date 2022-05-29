package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement email() {
		return driver.findElement(By.cssSelector("#user_email"));
	}

	public WebElement pwd() {
		return driver.findElement(By.cssSelector("#user_password"));
	}

	public WebElement loginButton() {
		return driver.findElement(By.xpath("//input[@value='Log In']"));
	}

	public WebElement forgetPasswordLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?') and @class='link-below-button']"));
	}

}
