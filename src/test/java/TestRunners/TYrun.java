package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDefinition" }, plugin = {
		"html:target/cucumber-reports/html-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
)
public class TYrun extends AbstractTestNGCucumberTests {
	
	

}
