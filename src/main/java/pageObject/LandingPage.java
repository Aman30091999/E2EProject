package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resouces.Base;

public class LandingPage extends Base {
	public WebDriver driver;

	@FindBy(xpath = "//span[text()='Login']")
	public WebElement login;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement text() {
		return driver.findElement(By.xpath("//span[text()='Login']"));
	}

	public WebElement crossButton() {
		return driver.findElement(By.xpath("//button[text()='NO THANKS']"));
	}

	public WebElement headingInHome() {
		return driver.findElement(By.xpath("//h2[text()='Featured Courses']"));
	}
}
