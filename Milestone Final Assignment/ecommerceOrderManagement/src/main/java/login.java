import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;

	public login(String username, String password) {
		// Navigate to the login page
		driver.get("https://example.com/login");

		// Enter username and password
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

		// Click the login button
		driver.findElement(By.name("login")).click();

		// Handle login failure
		if (driver.getTitle().contains("Login Failed")) {
			System.out.println("Login failed due to incorrect credentials");
		}
	}
}
