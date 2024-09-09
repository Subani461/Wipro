package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class register2 {
	 WebDriver driver;
	public WebElement gender;
	 public  WebElement fname;
	 public  WebElement lname;
	 public  WebElement Email;
	 public  WebElement pass;
	public   WebElement Cpass;
	   public WebElement male_radio;
	   public WebElement female_radio;
		public register2(WebDriver driver) {
			this.driver=driver;
		}
		public void clickRegister() {
			driver.findElement(By.linkText("Register")).click();
		}
		public void setGender(String gender) {
			male_radio=driver.findElement(By.xpath("//input[@id='gender-male']"));
			female_radio=driver.findElement(By.xpath("//input[@id='gender-female']"));
			
			if(male_radio.isSelected()) {
				male_radio.click();
			}
			else if(female_radio.isSelected()){
				female_radio.click();
			}
			
			if(gender.equalsIgnoreCase("Male")) {
				male_radio.click();
			}
			else if(gender.equalsIgnoreCase("Female")) {
				female_radio.click();
			}
		}
		public void setFirstName(String first_name) {
			fname = driver.findElement(By.xpath("//input[@id='FirstName']"));
			fname.sendKeys("first_name");
		}
		public void setLastName(String last_name) {
			lname = driver.findElement(By.xpath("//input[@id='LastName']"));
			lname.sendKeys("last_name");
		}
		public void setEmail(String email) {
			Email = driver.findElement(By.xpath("//input[@id='Email']"));
			Email.sendKeys("email");
		}
		public void setPassword(String password) {
			pass = driver.findElement(By.xpath("//input[@id='Password']"));
			pass.sendKeys("password");
		}
		public void setCPassword(String confirm_password) {
			Cpass = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
			Cpass.sendKeys("confirm_password");
		}
		public void submit() {
			driver.findElement(By.xpath("//input[@id='register-button']")).click();
		}
}
