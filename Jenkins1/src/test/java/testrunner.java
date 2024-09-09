

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@SuppressWarnings("unused")
@CucumberOptions(features="src/test/resources/features",glue= {"stepdefinitions"})
public class testrunner extends AbstractTestNGCucumberTests{
  
}

