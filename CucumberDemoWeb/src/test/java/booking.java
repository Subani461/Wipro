

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class booking {
	WebDriver driver;
	WebElement fname;
	WebElement lname;
	WebElement email;
	WebElement mobNumber;
	WebElement dropDown;
	WebElement confirm;
	WebElement forWhom;
	WebElement work;
	WebElement guestName;
	WebElement addToStay;
	WebElement arrivalTime;
	WebElement next;
	WebElement cardNumber;
	WebElement accountName;
	WebElement expiryDate;
	WebElement cvv;
	WebElement consent;
	WebElement completeBooking;
	public booking(WebDriver driver) {
		this.driver=driver;
	}
	public void enterPersonDetails() {
		fname = driver.findElement(By.xpath("//input[@id='firstname']"));
		fname.sendKeys("Asifkhan");
		lname=driver.findElement(By.xpath("(//input[@id='lastname'])[1]"));
		lname.sendKeys("Pathan");
		email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("pathanasifkhan461@gmail.com");
		dropDown = driver.findElement(By.xpath("//select[@id='cc1']"));
		Select S = new Select(dropDown);
		S.selectByValue("India");
		mobNumber = driver.findElement(By.xpath("//input[@id='phone']"));
		mobNumber.sendKeys("6305438229");
		confirm = driver.findElement(By.xpath("//span[@class='bui-checkbox__label']"));
		if(!confirm.isSelected()) {
			confirm.click();
		}
		forWhom = driver.findElement(By.xpath("//span[normalize-space()='I am the main guest']"));
		work = driver.findElement(By.xpath("//fieldset[@id='bp-control-group--travel_purpose']//div[contains(@class,'')]//div[1]//div[1]//label[1]//span[1]"));
		work.click();
		guestName = driver.findElement(By.xpath("//input[@id='guest_name_705831506_295408764_2_1_0']"));
		guestName.sendKeys("Asifkhan");
		addToStay = driver.findElement(By.xpath("//label[contains(@for,'interested_flight')]//div[1]"));
		addToStay.click();
		arrivalTime=driver.findElement(By.xpath("//select[@id='checkin_eta_hour']"));
		Select S1 = new Select(arrivalTime);
		S1.selectByIndex(2);
	}
	public void clickNext() {
		next = driver.findElement(By.xpath("//button[@name='book']"));
		next.click();
	}
	public void enterCardDetails() {
		accountName = driver.findElement(By.xpath("//input[@name='name']"));
		accountName.sendKeys("ASIFKHAN PATHAN");
		cardNumber = driver.findElement(By.xpath("//input[@name='number']"));
		cardNumber.sendKeys("1234 4567 6789 9123");
		expiryDate = driver.findElement(By.xpath("//input[@name='expirationDate']"));
		expiryDate.sendKeys("12/30");
		cvv = driver.findElement(By.xpath("//input[@name='cvc']"));
		cvv.sendKeys("123");
		consent=driver.findElement(By.xpath("//div[contains(@aria-label,'Your consent preferences')]//div[1]//div[1]//label[1]//span[1]"));
		consent.click();
	}
	public void clickSubmit() {
		completeBooking = driver.findElement(By.xpath("//button[contains(@name,'book')]"));
		completeBooking.click();
	}
}
