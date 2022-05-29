package automationknowledge.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.*;
import resouces.Base;

public class HomePage extends Base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void setup() throws IOException {
		driver = initializeDriver();
		driver.get(pro.getProperty("url"));
		log.info("url");
		log.info("url"+"Sucess fully hit");
	}

	@Test(dataProvider = "dataLogin", dataProviderClass = Dataprovider.class)
	public void basePageNavigation(String username, String pwd) throws IOException, InterruptedException {
		driver.manage().window().maximize();
		LandingPage land = new LandingPage(driver);
		LoginPage loginpage = new LoginPage(driver);
		ForgetPasswordPage forget = new ForgetPasswordPage(driver);
		Thread.sleep(10000);
		land.crossButton().click();
		Assert.assertTrue(land.headingInHome().isDisplayed());
		land.text().click();
		Thread.sleep(5000);
		loginpage.email().click();
		loginpage.email().sendKeys(username);
		Thread.sleep(5000);
		loginpage.pwd().click();
		loginpage.pwd().sendKeys(pwd);
		loginpage.forgetPasswordLink().click();
		Thread.sleep(5000);
		forget.email().sendKeys("xxxxxx");
		forget.sendMeInstruction().click();
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
