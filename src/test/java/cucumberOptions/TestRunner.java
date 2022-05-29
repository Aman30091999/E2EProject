package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefination")
public class TestRunner extends AbstractTestNGCucumberTests {

}
