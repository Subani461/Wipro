package com.App.Testcases;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",glue= {"com.App.Testcases"})
public class testrunner extends AbstractTestNGCucumberTests{
  
}
