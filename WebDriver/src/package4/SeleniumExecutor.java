package package4;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumExecutor {
	WebDriver driver;
	public SeleniumExecutor(WebDriver driver) {
		this.driver = driver;
	}
	public List<String> getDropDownValues(){
		WebElement dropdown = driver.findElement(By.id("dropdown-main"));
		Select select = new Select(dropdown);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		List<String> values = new ArrayList<>();
		for(WebElement option:selectedOptions) {
			values.add(option.getText());
		}
		return values;	
	}
	public void setInput(String text) {
		@SuppressWarnings("unchecked")
		List<WebElement> textBoxes = (List<WebElement>) driver.findElement(By.className("text-box"));
		for(WebElement textBox:textBoxes) {
			textBox.clear();
			textBox.sendKeys(text);
		}
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		try {
			URL fileUrl = SeleniumExecutor.class.getClassLoader().getResource("files/index.html");
			if(fileUrl==null) {
				throw new RuntimeException("index.html not found in resources");
			}
			SeleniumExecutor executor = new SeleniumExecutor(driver);
			@SuppressWarnings("unused")
			List<String> dropdownvalues = executor.getDropDownValues();
			System.out.println("DropDown Values are : "+dropdownvalues);
			String inputText = "";
			executor.setInput(inputText);
		}
		finally {
			driver.quit();
		}
	}
}
