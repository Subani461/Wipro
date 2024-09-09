package com.App.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@SuppressWarnings("unused")
@CucumberOptions(features="src/test/resources/features",glue= {"com.App.Testcases"},tags="@search")
public class testrunner extends AbstractTestNGCucumberTests{
	
}

