import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="features",glue= {"stepdefinition"},plugin= {"pretty","html:target/Destination.html"})
public class testrunner extends AbstractTestNGCucumberTests {
	
}
