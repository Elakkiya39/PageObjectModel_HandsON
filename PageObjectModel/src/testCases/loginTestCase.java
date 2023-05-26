package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPageObjects;

public class loginTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPageObjects.userName(driver).sendKeys("Admin");
		LoginPageObjects.passWord(driver).sendKeys("admin123");
		LoginPageObjects.loginBtn(driver).click();
		

		//quit browser
		driver.quit();

	}

}
