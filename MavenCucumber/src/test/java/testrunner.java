import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="features",glue= {"stepdefinition"},tags="@feature2")
public class testrunner extends AbstractTestNGCucumberTests {
	
}
