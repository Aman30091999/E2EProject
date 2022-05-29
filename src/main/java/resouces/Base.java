package resouces;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public Properties pro;

	public WebDriver initializeDriver() throws IOException {
		pro = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resouces\\data.properties");
		pro.load(fis);
		String browserName = pro.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			// WebDriverManager.chromedriver().browserVersion("100.0.4896.75").setup();
			WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			//option.addArguments("headless");
			driver = new ChromeDriver(option);
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public String getScreenShot(String testcaseName, WebDriver driver) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File fs=ts.getScreenshotAs(OutputType.FILE);
		String desnFile=System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
		FileUtils.copyFile(fs, new File(desnFile));
		return desnFile;
	}
}
	