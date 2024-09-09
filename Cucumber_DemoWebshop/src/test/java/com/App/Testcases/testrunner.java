package com.App.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@SuppressWarnings("unused")
@CucumberOptions(features="src/test/resources/features",glue= {"com.App.Testcases"},plugin= {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm","pretty"})
public class testrunner extends AbstractTestNGCucumberTests{
	/*  @DataProvider(parallel=true)
	  @Test
	  public Object[][] scenarios(){
		  return super.scenarios();
	  }*/
}

