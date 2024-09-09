import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"stepdefinitions"},plugin= {"pretty","html:target/Destination"})
public class testrunner {
  @Test
  public void f() {
  }
}
