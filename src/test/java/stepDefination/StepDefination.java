package stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObject.ForgetPasswordPage;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resouces.Base;

@RunWith(Cucumber.class)
public class StepDefination extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Given("^Initalize chrome driver$")
	public void initalize_chrome_driver() throws Throwable {
		driver = initializeDriver();
	}

	@When("^user enter (.+) and (.+) and login$")
	public void user_enter_something_and_something_and_login(String strArg1, String strArg2) throws Throwable {
		driver.get(pro.getProperty("url"));
		log.info("url");
		log.info("url" + "Sucess fully hit");
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
		loginpage.email().sendKeys(strArg1);
		Thread.sleep(5000);
		loginpage.pwd().click();
		loginpage.pwd().sendKeys(strArg2);
		loginpage.forgetPasswordLink().click();
		Thread.sleep(5000);
		forget.email().sendKeys("xxxxxx");
		forget.sendMeInstruction().click();
		driver.close();
	}

	@And("^Navigate to QAClick academy$")
	public void navigate_to_qaclick_academy() throws Throwable {
		System.out.println("1");
	}

	@And("^Click on signin button in home page$")
	public void click_on_signin_button_in_home_page() throws Throwable {
		System.out.println("1");
	}

}
