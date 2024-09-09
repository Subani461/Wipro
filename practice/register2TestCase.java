package com.App.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.App.PageObjects.register2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register2TestCase {
	WebDriver driver;
	boolean flag_fname=false;
	 register2 R = new register2(driver);
	@Given("I navigate to the registration page")
	public void i_navigate_to_the_registration_page() {
	    R.clickRegister();
	}
	@When("I select {string} as gender")
	public void i_select_as_gender(String string) {
	    R.setGender(string);
	    if(string.equalsIgnoreCase("Male")) {
	    	Assert.assertTrue((R.male_radio).isSelected(),"Male is selected");
	    	Assert.assertFalse((R.female_radio).isSelected(),"Female Should not be selected");
	    }
	    else if(string.equalsIgnoreCase("Female")) {
	    	Assert.assertTrue((R.female_radio).isSelected(),"Female is selected");
	    	Assert.assertFalse((R.male_radio).isSelected(),"male Should not be selected");
	    }
	}
	@When("I enter {string} as first name")
	public void i_enter_as_first_name(String string) {
	 R.setFirstName(string);
	 String value = (R.fname).getAttribute("value");
	 System.out.println(value);
	 if(value.isEmpty()) {
		System.out.println("Field is empty");
	 }
	 else {
		System.out.println("Field is not empty");
	 }
	 Assert.assertTrue(value.isEmpty(),"The field is not Empty");
	}
	@When("I enter {string} as last name")
	public void i_enter_as_last_name(String string) {
		 R.setLastName(string);
		 String value = (R.lname).getAttribute("value");
		 System.out.println(value);
		 if(value.isEmpty()) {
			System.out.println("Field is empty");
		 }
		 else {
			System.out.println("Field is not empty");
		 }
		 Assert.assertTrue(value.isEmpty(),"The field is not Empty");
	}
	@When("I enter {string} as email")
	public void i_enter_as_email(String string) {
		 R.setEmail(string);
		 String value = (R.Email).getAttribute("value");
		 System.out.println(value);
		 if(value.isEmpty()) {
			System.out.println("Field is empty");
		 }
		 else {
			System.out.println("Field is not empty");
		 }
		 Assert.assertTrue(value.isEmpty(),"The field is not Empty");
	}
	@When("I enter {string} as password")
	public void i_enter_as_password(String string) {
		 R.setPassword(string);
		 String value = (R.pass).getAttribute("value");
		 System.out.println(value);
		 if(value.isEmpty()) {
			System.out.println("Field is empty");
		 }
		 else {
			System.out.println("Field is not empty");
		 }
		 Assert.assertTrue(value.isEmpty(),"The field is not Empty");
	}
	@When("I enter {string} as confirm password")
	public void i_enter_as_confirm_password(String string) {
		 R.setCPassword(string);
		 String value = (R.Cpass).getAttribute("value");
		 System.out.println(value);
		 if(value.isEmpty()) {
			System.out.println("Field is empty");
		 }
		 else {
			System.out.println("Field is not empty");
		 }
		 Assert.assertTrue(value.isEmpty(),"The field is not Empty");
	}
	@When("I submit the registration form")
	public void i_submit_the_registration_form() {
	    R.submit();
	}
	@Then("I should see a registration result message")
	public void i_should_see_a_registration_result_message() {
	    System.out.println("Result Message");
	}
}
