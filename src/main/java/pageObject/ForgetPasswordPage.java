package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPasswordPage {
	public WebDriver driver;

	public ForgetPasswordPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement email() {
		return driver.findElement(By.cssSelector("#user_email"));
	}

	public WebElement sendMeInstruction() {
		return driver.findElement(By.xpath("//input[@value='Send Me Instruction']"));
	}
}
