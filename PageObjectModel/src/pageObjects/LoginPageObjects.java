package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	// username, password, login button
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}

	public static WebElement passWord(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}

	public static WebElement loginBtn(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}

}
