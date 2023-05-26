package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestCaseWithOutAnnotation {

	public static WebElement username;

	public static WebElement password;

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		PageFactory.initElements(driver, LoginTestCaseWithOutAnnotation.class);
		username.sendKeys("Admin");
		password.sendKeys("admin123");

		// quit browser
		driver.quit();
	}
}
